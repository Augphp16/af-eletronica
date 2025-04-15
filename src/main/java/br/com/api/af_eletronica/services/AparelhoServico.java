package br.com.api.af_eletronica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.af_eletronica.models.Aparelho;
import br.com.api.af_eletronica.models.RespostaAparelho;
import br.com.api.af_eletronica.repositories.AparelhoRepositorio;

@Service
public class AparelhoServico {

    @Autowired
    private AparelhoRepositorio ar;

    @Autowired
    private RespostaAparelho ra;

    //método para listar todos os aparelhos
    public Iterable<Aparelho> listarAparelhos(){
        return ar.findAll();
    }


    //método de cadastro dos aparelhos
    public ResponseEntity<?> cadastrarAlterarAparelho(Aparelho a, String acao){
        if(a.getNome().equals("")){
            ra.setMensagem("O nome do aparelho é obrigatório!");
            return new ResponseEntity<RespostaAparelho>(ra, HttpStatus.BAD_REQUEST);
        } else if(a.getMarca().equals("")){
            ra.setMensagem("A marca do aparelho é obrigatório!");
            return new ResponseEntity<RespostaAparelho>(ra, HttpStatus.BAD_REQUEST);
        } else if(a.getSintomas().equals("")){
            ra.setMensagem("Os sintomas do aparelho são obrigatórios!");
            return new ResponseEntity<RespostaAparelho>(ra, HttpStatus.BAD_REQUEST);
        } else if (a.getDataEntrada().equals("")){
            ra.setMensagem("A data de entrada do aparelho é obrigatória!");
            return new ResponseEntity<RespostaAparelho>(ra, HttpStatus.BAD_REQUEST);
        } else {
            if(acao.equals("cadastrar")){
                return new ResponseEntity<Aparelho>(ar.save(a), HttpStatus.CREATED);
            } else {
                return new ResponseEntity<Aparelho>(ar.save(a), HttpStatus.OK);
            }
        }
    }
}
