package br.com.v3r.springboot.controllers;

import br.com.v3r.springboot.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping(path = "/qlqr")
    public Cliente obterCliente() {
        return new Cliente(36, "José", "123.456.789-10");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId(@PathVariable int id) {
        return new Cliente(id, "Maria", "987.654.321-00");
    }

    @GetMapping()
    public Cliente obterClientePorId2(
            @RequestParam(name = "id", defaultValue = "1") int id) {
        return new Cliente(id, "Paula", "111.222.333.444-55");
    }




}
