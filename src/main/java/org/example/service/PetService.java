package org.example.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Message;
import org.example.model.Pet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetService {
    Scanner scanner = new Scanner(System.in);
    ObjectMapper objectMapper = new ObjectMapper();
    private List<Pet> pets = new ArrayList<>();
    private final String pathToFile = "src/main/resources/pets.json";
    File file = new File(pathToFile);

    public void addPet() {
        Message.petName();
        String name = scanner.next();
        Message.petType();
        String type = scanner.next();
        Message.petAge();
        String age = scanner.next();
        Message.petGender();
        String gender = scanner.next();
        Message.petBreed();
        String breed = scanner.next();
        Message.petBreed();

        Pet pet = new Pet(name, type, age, gender, breed);

        pets.add(pet);

        Message.success();
        Message.greeting();
    }

    public void getPets() {
        System.out.println("Pets:");
        int id = 1;
        for (Pet pet : pets) {
            System.out.println(pet + " petID=" + id++);
        }
    }

    public void takePet() {
        Message.petID();
        try {
            pets.remove(scanner.nextInt() - 1);
            Message.success();
        } catch (IndexOutOfBoundsException e) {
            System.err.println("No such pet ID, try again");
        }
        Message.greeting();
    }

    public void serializePets() {
        try {
            objectMapper.writeValue(file, pets);
            System.out.println("Saved. \n");
        } catch (IOException e) {
            System.out.println("Cannot create a file");
        }
    }

    public void deserializePets() {
        try {
            pets = objectMapper.readValue(file, new TypeReference<>() {
            });
        } catch (IOException e) {
            System.out.println("Cannot read a file");
        }
    }
}
