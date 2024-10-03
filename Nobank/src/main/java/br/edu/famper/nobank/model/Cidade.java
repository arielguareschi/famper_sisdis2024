package br.edu.famper.nobank.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "cidade")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome", length = 150)
    private String nome;

    @Column(name = "uf", length = 2)
    private String uf;

    @OneToMany(mappedBy = "cidade",
        targetEntity = Cliente.class,
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Cliente> clientes;
}
