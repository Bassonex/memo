package model.enums;

public enum NoteCategory {
    HomeWork("Home Work"),
    JobTask("Job Task"),
    ShoppingList("Shopping List"),
    NoCategory("No category");

    private String name;

    // Constructor

    NoteCategory(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
