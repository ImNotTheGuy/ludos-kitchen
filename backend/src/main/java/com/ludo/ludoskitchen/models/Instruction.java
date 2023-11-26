package com.ludo.ludoskitchen.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@With
public class Instruction {
    private String action;
    private Ingredient ingredient;
    private Ustensil ustensil;
    private Float durationInMinutes;
    private String adjective;

    public enum Ustensil {
        KNIFE,
        PAN_SMALL,
        PAN_MEDIUM,
        PAN_LARGE,
        POT_SMALL,
        POT_MEDIUM,
        POT_LARGE,
        GRATER,
        BOARD
    }

    public Instruction mix(Ingredient ingredient){
        this.action = "mix";
        this.ingredient = ingredient;
        return this;
    }

    public Instruction boil(Ingredient ingredient){
        this.action = "boil";
        this.ingredient = ingredient;
        return this;
    }

    public Instruction cut(Ingredient ingredient){
        this.action = "cut";
        this.ingredient = ingredient;
        return this;
    }

    public Instruction grate(Ingredient ingredient){
        this.action = "grate";
        this.ingredient = ingredient;
        return this;
    }

    public Instruction in(Ustensil ustensil){
        this.ustensil = ustensil;
        this.adjective = adjective;
        return this;
    }

    public Instruction with(Ustensil ustensil){
        this.ustensil = ustensil;
        this.adjective = adjective;
        return this;
    }

    public Instruction during(Float minutes){
        this.durationInMinutes = minutes;
        return this;
    }

    public Instruction until(Float minutes){
        this.durationInMinutes = minutes;
        return this;
    }

    @Override
    public String toString() {
        return action + " " + this.ingredient + " " + this.adjective + " " + this.ustensil;
    }
}
