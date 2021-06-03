package com.app.model;

import com.app.model.enums.NoteCategory;

import java.util.Date;

// Object
public class Note {

    private long id;
    private String note;
    private String title;
    private Date date;
    private String notePriority;
    private User user;
    private NoteCategory category;

    // Constructors
    public Note(String note, String notePriority, String title) {
        this.note = note;
        this.notePriority = notePriority;
        this.title = title;
    }

    public Note(String note, String notePriority) {
        this.note = note;
        this.notePriority = notePriority;
    }

    public Note(String note) {
        this.note = note;
    }

    public Note(String note, NoteCategory category, Date date, User user, String priority, String title) {
        this.note = note;
        this.category = category;
        this.date = date;
        this.notePriority = priority;
        this.title = title;
        this.user = user;
    }

    // for creation form only
    public Note() {
    }

    // Getters-Setters
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNotePriority() {
        return notePriority;
    }

    public void setNotePriority(String notePriority) {
        this.notePriority = notePriority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCategory(NoteCategory category) {
        this.category = category;
    }

    public void setUser(User user) {
        this.user = user;
    }



    public User getUserName() {
        user.getFullName();
        return user;
    }

    public void setUserName(User user) {
        this.user = user;
    }

    public NoteCategory getCategory() {
        return category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    // Custom method for homework 1

    public void printNote() {
        System.out.println("Note: " + note);
        System.out.println("----------------------------------");
    }

    public void printFullNote() {
        System.out.println("Priority: " + notePriority);
        System.out.println("Note: " + note);
        System.out.println("More info: '" + title + "'");
        System.out.println("----------------------------------");
    }
}




