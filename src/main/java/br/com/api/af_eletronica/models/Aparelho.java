package br.com.api.af_eletronica.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "aparelhos")
@Getter
@Setter
public class Aparelho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @NotEmpty
    private String nome;
    @NotEmpty
    private String marca;
    @NotEmpty
    private String sintomas;
    private String obs;
    private String diagnostico;
    private Double orcamentoValor;
    @NotEmpty
    private String dataEntrada;
    private String dataSaida;
    
}
