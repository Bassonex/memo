package com.app.services;

import com.app.dao.NoteDaoImpl;
import com.app.model.Note;
import com.app.model.User;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class NoteService {

    NoteDaoImpl noteDao = new NoteDaoImpl();

    // Created notes lay here
    public List<Note> getNotes() {
        return noteDao.getAllNotes();
    }

    // This method looks for user in Note array, if he exist there then prints his notes
    public List<Note> getUserNotes(String userName) {
        return noteDao.getUserNotes(userName);
    }

    public void addNote(Note note) {
        noteDao.addNote(note);
    }

    // Note form validation
    public Note validateNote(Note note) {
        if (note.getTitle().isEmpty() || note.getNote().isEmpty()
                || note.getUserName().getFirstName().isEmpty()
        || note.getUserName().getLastName().isEmpty()) {
            System.out.println("Validation failed!");
            return null;
        }
        noteDao.addNote(note);
        return note;
    }

}
