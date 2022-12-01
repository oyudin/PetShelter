package org.example;

public class Message {

    public static void greeting() {
        System.out.println("Welcome, select what you want to do: \n"
                + "1. Give a pet to the shelter" + "\n"
                + "2. View the pets in the shelter" + "\n"
                + "3. Take a pet from the shelter" + "\n"
                + "4. Save the changes" + "\n"
                + "Please, enter the number: from 1 to 3" + " or type 'exit' to leave the app");
    }


    public static void petID() {
        System.out.println("Enter the pet ID:");
    }

    public static void petName() {
        System.out.println("Enter the pet name:");
    }


    public static void petType() {
        System.out.println("Enter the type:");
    }


    public static void petAge() {
        System.out.println("Enter the age:");
    }


    public static void petGender() {
        System.out.println("Enter the gender:");
    }


    public static void petBreed() {
        System.out.println("Enter the breed:");
    }


    public static void success() {
        System.out.println("Success \n");
    }


}
