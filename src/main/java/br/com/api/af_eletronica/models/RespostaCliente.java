package br.com.api.af_eletronica.models;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class RespostaCliente {
    private String mensagem;
}
