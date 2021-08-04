package com.app.controllers;

import com.app.model.Note;
import com.app.model.NotePriority;
import com.app.model.User;
import com.app.model.enums.NoteCategory;
import com.app.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;

@Controller
public class NoteController {
    @Autowired
    NoteService noteService;

    @GetMapping("/allnotesdb")
    public String getNotes(Model model) {
        System.out.println("Success connect to Db!");
        model.addAttribute("noteData", noteService.getNotesDb());

        return "createdNotes";
    }

    // Homework 3 ----------------------------------------------------------------------------------------------
    // Show all notes from all users
    @GetMapping("/allnotes")
    public String getAllUsersAndNotesPage(Model model) {
        System.out.println("Success connect!");
        model.addAttribute("noteData", noteService.getNotes());
        return "createdNotes";
    }

    // Show notes only from one user
    @GetMapping("/notes/{userName}")
    public String getAllUsersNotesPage(@PathVariable(value = "userName") String userName, Model model) {
        System.out.println("1) LOADING PAGE");

        model.addAttribute("noteData", noteService.getUserNotes(userName));
        System.out.println("Notes from array: " + noteService.getUserNotes(userName));

        System.out.println("2) PAGE LOADED");
        return "createdNotes";

    }

    //----------------------------------------------------------------------------------------------------------------\\
    // Note creation form
    //----------------------------------------------------------------------------------------------------------------//
    @GetMapping("/new/note")
    public String getCreationPage(Model model) {

        model.addAttribute("noteData", new Note());  // new Note
        model.addAttribute("userData", new User());  // new User
        model.addAttribute("catData", NoteCategory.values()); // Category selection
        model.addAttribute("priorData", new NotePriority()); // Priority selection

        return "newNote";
    }

    // Created notes
    @PostMapping("/created/note")
    public String createdNote(@ModelAttribute Note newNote, User user, com.app.model.NoteCategory category, NotePriority notePriority, Model model) {

        model.addAttribute("noteData", newNote);
        model.addAttribute("userData", user);

        LocalDateTime dateTime = newNote.getDateTime();

        newNote.setDateTime(dateTime);
        System.out.println("TIME DATE: " + dateTime);
        newNote.setUser(user);
        newNote.setCategory(category);
        newNote.setNotePriority(notePriority);

        // TESTING LOGS

        if (noteService.validateNote(newNote) == null ) {
            return "redirect:/new/note";
        }
        return "createdNotes";
    }
}
