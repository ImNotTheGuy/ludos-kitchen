package com.ludo.ludoskitchen.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@With
public class Ingredient {

    private String name;
    private Group group;
    private Float quantity;
    private Unit unit;

    public enum Group {
        MEAT,
        VEGETABLE,
        CHEESE,
        GRAIN,
        OTHER
    }

    public enum Unit {
        QUANTITY,
        ML,
        L,
        g,
        kg,
        TEASPOON,
        TABLESPOON,
    }
}
