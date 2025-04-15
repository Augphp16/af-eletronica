package br.com.api.af_eletronica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.af_eletronica.models.Cliente;
import br.com.api.af_eletronica.models.RespostaCliente;
import br.com.api.af_eletronica.repositories.ClienteRepositorio;

@Service
public class ClienteServico {

    @Autowired
    private ClienteRepositorio cr;

    @Autowired
    private RespostaCliente rc;

    //método para listar todos os clientes
    public Iterable<Cliente> listar(){
        return cr.findAll();
    }

    public ResponseEntity<?> cadastrarCliente(Cliente c, String acao){
        if(c.getNome().equals("")){
            rc.setMensagem("O nome do cliente é obrigatório!");
            return new ResponseEntity<RespostaCliente>(rc, HttpStatus.BAD_REQUEST);
        } else if(c.getTelefone().equals("")){
            rc.setMensagem("O telefone do cliente é obrigatório!");
            return new ResponseEntity<RespostaCliente>(rc, HttpStatus.BAD_REQUEST);
        } else if(c.getEndereco().equals("")){
            rc.setMensagem("O endereço do cliente é obrigatório!");
            return new ResponseEntity<RespostaCliente>(rc, HttpStatus.BAD_REQUEST);
        } else {
            if(acao == "cadastrar"){
                return new ResponseEntity<Cliente>(cr.save(c), HttpStatus.CREATED);
            } else {
                return new ResponseEntity<Cliente>(cr.save(c), HttpStatus.OK);
            }
        }
    }

}
