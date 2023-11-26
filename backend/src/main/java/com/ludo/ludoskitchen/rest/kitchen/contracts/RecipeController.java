package com.ludo.ludoskitchen.rest.kitchen.contracts;

import com.ludo.ludoskitchen.models.Recipe;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Recipes", description = "Recipe API")
@RestController
@RequestMapping(value = "/api/kitchen/recipe")
public interface RecipeController {

    @Operation(
            description = "Carbonara recipe",
            summary = "Testing recipe"
    )
    @ApiResponses({
            @ApiResponse(
                    description = "The recipe",
                    content = @Content,
                    responseCode = "200"
            ),
            @ApiResponse(
                    description = "Error",
                    content = @Content,
                    responseCode = "500"
            ),
    })
    @GetMapping("/carbonara")
    Recipe carbonara();
}
