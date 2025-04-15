package br.com.api.af_eletronica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.af_eletronica.models.Aparelho;
import br.com.api.af_eletronica.services.AparelhoServico;

@RestController
@CrossOrigin(origins = "*")
public class AparelhoControle {

    @Autowired
    private AparelhoServico as;

    @GetMapping("/aparelhos")
    public Iterable<Aparelho> listar(){
        return as.listarAparelhos();
    }

    @PostMapping("/aparelhos/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody Aparelho a){
        return as.cadastrarAlterarAparelho(a, "cadastrar");
    }

    @PutMapping("/aparelhos/alterar")
    public ResponseEntity<?> alterar(@RequestBody Aparelho a){
        return as.cadastrarAlterarAparelho(a, "alterar");
    }

}
