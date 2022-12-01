package org.example;

import org.example.service.PetService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PetService petService = new PetService();
        Scanner scanner = new Scanner(System.in);

        petService.deserializePets();
        Message.greeting();

        while (true) {
            switch (scanner.next()) {
                case "1" -> petService.addPet();
                case "2" -> petService.getPets();
                case "3" -> petService.takePet();
                case "4" -> petService.serializePets();
                case "exit" -> System.exit(0);
                default -> System.out.println("Wrong input, try again: \n");

            }
        }
    }
}
