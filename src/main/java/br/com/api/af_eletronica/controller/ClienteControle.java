package br.com.api.af_eletronica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.af_eletronica.models.Cliente;
import br.com.api.af_eletronica.services.ClienteServico;

@RestController
@CrossOrigin(origins = "*")
public class ClienteControle {

    @Autowired
    private ClienteServico cs;

    @GetMapping("/clientes")
    public Iterable<Cliente> listar(){
        return cs.listar();
    }

    @PostMapping("/clientes/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody Cliente c){
        return cs.cadastrarCliente(c, "cadastrar");
    }

    @PutMapping("clientes/alterar")
    public ResponseEntity<?> alterar(@RequestBody Cliente c){
        return cs.cadastrarCliente(c, "alterar");
    }

}
