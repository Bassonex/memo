package com.app.model;

import com.app.model.enums.NoteCategory;

// Object
public class Category {
    private String myCategory;
    private NoteCategory noteCategory;

    // Constructor
    public Category(String myCategory) {
        this.myCategory = myCategory;
    }

    public Category(NoteCategory noteCategory) {
        this.noteCategory = noteCategory;
    }

    // Getters-Setters
    public String getMyCategory() {
        return myCategory;
    }

    public void setMyCategory(String myCategory) {
        this.myCategory = myCategory;
    }

    public NoteCategory getNoteCategory() {
        return noteCategory;
    }
}
