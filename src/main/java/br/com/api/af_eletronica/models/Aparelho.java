package br.com.api.af_eletronica.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private String nome;
    private String marca;
    private String sintomas;
    private String obs;
    private String diagnostico;
    private Double orcamentoValor;
    private String dataEntrada;
    private String dataSaida;
    
}
