package com.ludo.ludoskitchen.rest.config.contracts;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Config controller", description = "various config")
@RestController
@RequestMapping(value = "/api/config")
public interface ConfigController {
    @Operation(
            description = "description",
            summary = "Check health of backend"
    )
    @ApiResponses({
            @ApiResponse(
                    description = "App is running",
                    content = @Content,
                    responseCode = "200"
            ),
            @ApiResponse(
                    description = "Issue calling the app",
                    content = @Content,
                    responseCode = "500"
            ),
    })
    @GetMapping("/health")
    String health();
}
