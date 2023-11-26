package com.ludo.ludoskitchen.models;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@With
public class Recipe {

    private String name;
    private String description;
    private List<Ingredient> ingredients;
    private List<Instruction> instructions;
    private UnitStandard unitStandard;

    public enum UnitStandard {
        US,
        NORMAL
    }
}
