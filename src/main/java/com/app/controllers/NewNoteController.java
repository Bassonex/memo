package com.app.controllers;

import com.app.model.Note;
import com.app.model.User;
import com.app.model.enums.NoteCategory;
import com.app.services.NoteService;
import com.app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
// Homework 4 ----------------------------------------------------------------------------------------------
public class NewNoteController {
    @Autowired
    NoteService noteService;
    @Autowired
    UserService userService;

    // Note creation form
    @GetMapping("/create/note")
    public String getCreationPage(Model model) {
        UserService users = new UserService();
        List<User> user = users.getUsers();

        model.addAttribute("noteData", new Note());  // new Note
        model.addAttribute("userData", new User());  // new User
        model.addAttribute("catData", NoteCategory.values()); //  category


        return "newNote";
    }

    // Created notes
    @PostMapping("/create/note")
    public String createdNote(@ModelAttribute Note newNote, User user, Model model) {

        model.addAttribute("noteData", newNote);
        model.addAttribute("userData", user);



        return "createdNotes";
    }
}
