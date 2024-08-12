package com.render2.myname3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class NombreController {
    @GetMapping("/nombre")
    public String getNombre() {
        return "Marcos3";
    }
}
