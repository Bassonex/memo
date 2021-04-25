package model;

import java.util.ArrayList;
import java.util.List;

// Object
public class UserName {
    private String firstName;
    private String lastName;
    private List<UserName> users;

    // Constructor
    public UserName(String firstName, String lastName){
        this.lastName = lastName;
        this.firstName = firstName;
    }
    // Initialize database
    public UserName() {
        this.users = new ArrayList<>();
    }

    // Getters-Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<UserName> getUsers() {
        return users;
    }

    public void setUsers(List<UserName> users) {
        this.users = users;
    }

    // Custom method
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Add "note" to the "allNotes" Array
    public void addUser(UserName user){
        users.add(user);
    }

    public void printFullName(){
        System.out.println("----------------------------------");
        System.out.println("Created by: " + getFullName());
    }
}
