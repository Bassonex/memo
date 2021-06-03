package com.app.controllers;

import com.app.model.Note;
import com.app.model.User;
import com.app.services.NoteService;
import com.app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Locale;

@Controller
public class NoteController {
    @Autowired
    private NoteService noteService;
    private UserService userService;
    private User user;

    // Homework 3 ----------------------------------------------------------------------------------------------
    // Show all notes from all users
    @GetMapping("/notes/allnotes")
    public String getAllUsersAndNotesPage(Model model) {
        System.out.println("Success connect!");
        model.addAttribute("notes", noteService.getNotes());
        return "allNotes";
    }

    // Show notes only from one user
    @GetMapping("/notes/{userName}")
    public String getAllUsersNotesPage(@PathVariable(value = "userName") String userName, Model model) {
        System.out.println("1) LOADING PAGE");

        model.addAttribute("notes", noteService.getUserNotes(userName));
        System.out.println("Notes from array: " + noteService.getUserNotes(userName));

        System.out.println("2) PAGE LOADED");
        return "userNotes";

    }

}
