package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pet {

    private String name;
    private String type;
    private String age;
    private String gender;
    private String breed;
}
