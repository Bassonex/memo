package com.app.services;

import com.app.model.Note;
import com.app.model.User;
import com.app.model.enums.NoteCategory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Service
public class NoteService {

    // Created notes lay here
    public List<Note> getNotes() {
        List<Note> notes = new ArrayList<>();

        UserService users = new UserService();
        List<User> user = users.getUsers();


        notes.add(new Note("Take a walk to the Skyrim landscape and make chaos to citizens.", NoteCategory.JobTask, new Date(), user.get(0), "High", "'find dragonborn'"));
        notes.add(new Note("Write a book about programming in Java.", NoteCategory.HomeWork, new Date(), user.get(1), "Low", "'get info from course'"));
        notes.add(new Note("Rush B and don't ask questions, just RUSH B!", NoteCategory.JobTask, new Date(), user.get(2), "Medium", "'die while rushing'"));
        notes.add(new Note("Request two number 9s, a number 9 large, a number 6 with extra dip, a number 7, two number 45s, one with cheese, and a large soda.",
                NoteCategory.ShoppingList, new Date(), user.get(2), "Insane", "'eat everything'"));
        return notes;
    }

    // This method looks for user in Note array, if he exist there then prints his notes
    public List<Note> getUserNotes(String userName) {
        List<Note> userNotes = new ArrayList<>();

        List<Note> notes = getNotes();
        for (int i = 0; i < notes.size(); i++) {
            if (notes.get(i).getUserName().getFullName().toLowerCase(Locale.ROOT).equals(userName)) {
                userNotes.add(notes.get(i));
                System.out.println("In IF");
            }
        }
        return userNotes;
    }

    // Note form validation

}
