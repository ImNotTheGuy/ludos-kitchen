package com.ludo.ludoskitchen.rest.kitchen;

import com.ludo.ludoskitchen.models.Ingredient;
import com.ludo.ludoskitchen.models.Instruction;
import com.ludo.ludoskitchen.models.Recipe;
import com.ludo.ludoskitchen.rest.kitchen.contracts.RecipeController;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RecipeControllerImpl implements RecipeController {
    @Override
    public Recipe carbonara() {
        Recipe recipe = new Recipe();
        recipe.setDescription("The best recipe in the world");

        Ingredient guanciale = new Ingredient("guanciale", Ingredient.Group.MEAT, 70f, Ingredient.Unit.g);
        Ingredient pecorino =  new Ingredient("pecorino", Ingredient.Group.CHEESE, 20f, Ingredient.Unit.g);
        Ingredient pasta =     new Ingredient("pasta", Ingredient.Group.GRAIN, 150f, Ingredient.Unit.g);
        Ingredient egg =       new Ingredient("egg", Ingredient.Group.OTHER, 1f, Ingredient.Unit.QUANTITY);
        Ingredient eggYolk =   new Ingredient("egg", Ingredient.Group.OTHER, 1f, Ingredient.Unit.QUANTITY);
        Ingredient water =     new Ingredient("water", Ingredient.Group.OTHER, 5f, Ingredient.Unit.L);

        Instruction instruction1 = new Instruction();
        instruction1.boil(water).in(Instruction.Ustensil.POT_LARGE);

        Instruction instruction2 = new Instruction();
        instruction2.cut(guanciale).with(Instruction.Ustensil.KNIFE);

        Instruction instruction3 = new Instruction();
        instruction3.grate(pecorino).with(Instruction.Ustensil.GRATER);

        recipe.setInstructions(List.of(instruction1, instruction2, instruction3));
        recipe.setIngredients(recipe.getInstructions().stream().map(Instruction::getIngredient).collect(Collectors.toList()));
        String description = "";
        recipe.getInstructions().stream().map(Instruction::toString).forEach((description::concat));
        recipe.setDescription(description);

        return recipe;
    }
}
