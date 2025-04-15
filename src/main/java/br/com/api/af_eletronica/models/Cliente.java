package br.com.api.af_eletronica.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String telefone;
    private String endereco;

    @OneToMany
    @JoinColumn(name = "cliente_id")
    private List<Aparelho> aparelhos;
    
}
