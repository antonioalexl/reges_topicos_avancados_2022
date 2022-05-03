package br.com.reges.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.reges.backend.models.Cliente;
import br.com.reges.backend.rdn.ClienteRdn;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> Get(){

        ClienteRdn rdn = new ClienteRdn();
        return rdn.obterTodos();
    }
    
    @GetMapping("/clientes/{id}")
    public Cliente GetById(@PathVariable("id") int id){

        ClienteRdn rdn = new ClienteRdn();
        return rdn.obterPorId(id);
    }

    

}
