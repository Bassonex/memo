package model;


import model.enums.NoteCategory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Object
public class Note {
    private String note;
    private Date date;
    private String notePriority;
    private String moreInfo;
    private List <Note> notes;
    private UserName userName;
    private NoteCategory category;

    // Constructors
    public Note(String note, String notePriority, String moreInfo) {
        this.note = note;
        this.notePriority = notePriority;
        this.moreInfo = moreInfo;
    }
    public Note(String note, String notePriority) {
        this.note = note;
        this.notePriority = notePriority;
    }
    public Note(String note) {
        this.note = note;
    }
    // Initialize database
    public Note() {
        this.notes = new ArrayList<>();
    }

    public Note(String note, NoteCategory category, Date date, UserName userName, String priority, String moreInfo){
        this.note = note;
        this.category = category;
        this.date = date;
        this.notePriority = priority;
        this.moreInfo = moreInfo;
        this.userName = userName;
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

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UserName getUserName() {
        return userName;
    }

    public void setUserName(UserName userName) {
        this.userName = userName;
    }

    public NoteCategory getCategory() {
        return category;
    }

    public void setCategory(NoteCategory category) {
        this.category = category;
    }

    public List<Note> getAllNotes() {
        return notes;
    }


    // Custom method
    // Add "note" to the "allNotes" Array
    public void addNote(Note note){
        notes.add(note);
    }


    public void printNote(){
        System.out.println("Note: " + note);
        System.out.println("----------------------------------");
    }

    public void printDateAndNote(){
        //System.out.println("When (" + date+")");
        System.out.println("Note: " + note);
        System.out.println("----------------------------------");
    }

    public void printFullNote(){
        System.out.println("Priority: " + notePriority);
      //System.out.println("When (" + date+")");
        System.out.println("Note: " + note);
        System.out.println("More info: '" + moreInfo + "'");
        System.out.println("----------------------------------");
    }
}




