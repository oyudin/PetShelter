package org.example.service;

import org.example.model.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetServiceTest {

    Pet pet = new Pet();
    private final List<Pet> pets = new ArrayList<>();

    @Before
    public void makePetsEmpty() {
        pets.removeAll(pets);
    }

    @Test
    public void addPetTest() {
        pets.add(pet);
        Assert.assertTrue(pets.contains(pet));

    }

    @Test
    public void takePetTest() {
        pets.add(pet);
        pets.remove(pet);
        Assert.assertTrue(pets.isEmpty());
    }
}
