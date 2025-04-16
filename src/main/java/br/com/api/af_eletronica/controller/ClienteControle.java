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
import br.com.api.af_eletronica.models.RespostaCliente;
import br.com.api.af_eletronica.services.ClienteServico;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@CrossOrigin(origins = "*")
public class ClienteControle {

    @Autowired
    private ClienteServico cs;

    @GetMapping("/clientes")
    @Operation(summary = "Rota responsável por listar os clientes")
    public Iterable<Cliente> listar(){
        return cs.listar();
    }

    @PostMapping("/clientes/cadastrar")
    @Operation(summary = "Rota responsável pelo cadastro de clientes")
    @ApiResponses(value = {
    @ApiResponse(
        responseCode = "201", 
        description = "cliente cadastrado com sucesso",
        content = {
            @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = Cliente.class)
            )
        }
    ),

    @ApiResponse(
        responseCode = "400", 
        description = "Informação inválida",
        content = {
            @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = RespostaCliente.class)
            )
        }
    )
    })
    public ResponseEntity<?> cadastrar(@RequestBody Cliente c){
        return cs.cadastrarCliente(c, "cadastrar");
    }

    @PutMapping("clientes/alterar")
    @Operation(summary = "Rota responsável pela atualização dos dados dos clientes")
    @ApiResponses(value = {
    @ApiResponse(
        responseCode = "200", 
        description = "dados do cliente atualizado com sucesso",
        content = {
            @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = Cliente.class)
            )
        }
    ),

    @ApiResponse(
        responseCode = "400", 
        description = "Informação inválida",
        content = {
            @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = RespostaCliente.class)
            )
        }
    )
    })
    public ResponseEntity<?> alterar(@RequestBody Cliente c){
        return cs.cadastrarCliente(c, "alterar");
    }

}
