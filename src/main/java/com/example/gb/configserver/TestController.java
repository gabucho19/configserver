package com.example.gb.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // <--- Permite actualizar 'mensaje' dinámicamente
public class TestController {
    @Value("${app.mensaje:Default}")
    private String mensaje;

    @GetMapping("/msg")
    public String getMsg() {
        return "Mensaje: " + mensaje;
    }
}
