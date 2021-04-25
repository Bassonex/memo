import model.*;
import model.enums.NoteCategory;

import java.util.Date;
import java.util.List;

public class WorkWithObjects {
    // Main Method
    public static void main(String[] args) {

        homeWork1(args);
        homeWork2(args);

    }

    // First Homework
    public static void homeWork1(String[] args) {

        UserName user = new UserName("Oleg", "Glebov");
        UserName userTwo = new UserName("Jesus", "Christ");
        UserName userThree = new UserName("Milana", "Borisovna");

        Note products = new Note("Buy milk and bread!");
        Note jobTaskDesc = new Note("Call Gabe Newell and ask about Half-Life 3 development.");
        Note homeWorkDesc = new Note("Do your homework, math, physic and geometry", "Low", "get help from friend");

        Category shoppingList = new Category("Shopping list");
        Category jobTask = new Category("Job task");
        Category homeWork = new Category("Home Work");

        user.printFullName();
        System.out.println(shoppingList.getMyCategory());
        products.printNote();
        System.out.println();

        userTwo.printFullName();
        System.out.println(jobTask.getMyCategory());
        jobTaskDesc.printDateAndNote();
        System.out.println();

        userThree.printFullName();
        System.out.println(homeWork.getMyCategory());
        homeWorkDesc.printFullNote();


    }

    // Second Homework
    public static void homeWork2(String[] args) {
        // users
        UserName users = new UserName();
        List<UserName> allUsers = users.getUsers();

        users.addUser(new UserName("Alduin", "Fusrodahov"));
        users.addUser(new UserName("Aleksej", "Pupkin"));
        users.addUser(new UserName("Big", "Smoke"));

        //notes
        Note notes = new Note();
        List<Note> allNotes = notes.getAllNotes();

        notes.addNote(new Note("Take a walk to the Skyrim landscape and make chaos to citizens.", NoteCategory.JobTask, new Date(), allUsers.get(0), "High", "'find dragonborn'"));
        notes.addNote(new Note("Write a book about programming in Java.", NoteCategory.HomeWork, new Date(), allUsers.get(1), "Low", "'get info from course'"));
        notes.addNote(new Note("Rush B and don't ask questions, just RUSH B!", NoteCategory.JobTask, new Date(), allUsers.get(2), "Medium", "'die while rushing'"));
        notes.addNote(new Note("Request two number 9s, a number 9 large, a number 6 with extra dip, a number 7, two number 45s, one with cheese, and a large soda.", NoteCategory.ShoppingList, new Date(), allUsers.get(2), "Insane", "'eat everything'"));


        // Get all notes from array "allNotes"
        for (int i = 0; i < allNotes.size(); i++) {
            System.out.println("Category: " + allNotes.get(i).getCategory());
            System.out.println("All user notes: " + allNotes.get(i).getNote());
            System.out.println("Date: " + allNotes.get(i).getDate());
            System.out.println("Author: " + allNotes.get(i).getUserName().getFullName());
            System.out.println("Priority: " + allNotes.get(i).getNotePriority());
            System.out.println("More info: " + allNotes.get(i).getMoreInfo());
            System.out.println();
        }

        // Get notes for special user
        for (int i = 0; i < allNotes.size(); i++) {
            // Check if there is any notes for this user
            if (allNotes.get(i).getUserName().equals(allUsers.get(2))) {
                // print founded notes
                System.out.println(allNotes.get(i).getUserName().getFirstName() + "'s" + " notes: ");
                System.out.println("Note: " + allNotes.get(i).getNote());
            }
        }
    }
}

