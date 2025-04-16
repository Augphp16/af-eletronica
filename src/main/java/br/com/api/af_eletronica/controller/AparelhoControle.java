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
import br.com.api.af_eletronica.models.RespostaAparelho;
import br.com.api.af_eletronica.services.AparelhoServico;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@CrossOrigin(origins = "*")
public class AparelhoControle {

    @Autowired
    private AparelhoServico as;

    @GetMapping("/aparelhos")  
    @Operation(summary = "Rota responsável por listar os aparelhos")  
    public Iterable<Aparelho> listar(){
        return as.listarAparelhos();
    }

    @PostMapping("/aparelhos/cadastrar")
    @Operation(summary = "Rota responsável pelo cadastro de aparelhos")
    @ApiResponses(value = {
    @ApiResponse(
        responseCode = "201", 
        description = "Aparelho cadastrado com sucesso",
        content = {
            @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = Aparelho.class)
            )
        }
    ),

    @ApiResponse(
        responseCode = "400", 
        description = "Informação inválida",
        content = {
            @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = RespostaAparelho.class)
            )
        }
    )
    })
    public ResponseEntity<?> cadastrar(@RequestBody Aparelho a){
        return as.cadastrarAlterarAparelho(a, "cadastrar");
    }

    @PutMapping("/aparelhos/alterar")
    @Operation(summary = "Rota responsável pela atualização dos dados dos aparelhos")
    @ApiResponses(value = {
    @ApiResponse(
        responseCode = "200", 
        description = "dados do aparelho atualizados com sucesso",
        content = {
            @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = Aparelho.class)
            )
        }
    ),

    @ApiResponse(
        responseCode = "400", 
        description = "Informação inválida",
        content = {
            @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = RespostaAparelho.class)
            )
        }
    )
    })
    public ResponseEntity<?> alterar(@RequestBody Aparelho a){
        return as.cadastrarAlterarAparelho(a, "alterar");
    }

}
