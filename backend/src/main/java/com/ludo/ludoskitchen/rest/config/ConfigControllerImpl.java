package com.ludo.ludoskitchen.rest.config;

import org.springframework.web.bind.annotation.RestController;
import com.ludo.ludoskitchen.rest.config.contracts.ConfigController;

@RestController
public class ConfigControllerImpl implements ConfigController {
    @Override
    public String health() {
        return "Success";
    }
}
