package br.com.v3r.springboot.controllers;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/somar/{a}/{b}")
    public int Somar(@PathVariable int a,@PathVariable int b) {
        return a + b;
    }

    @GetMapping("/subtrair")
    public int subtrair(@RequestParam(name = "a") int a,@RequestParam(name = "b") int b){
        return a - b;
    }
}
