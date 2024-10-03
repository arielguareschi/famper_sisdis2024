package br.edu.famper.nobank.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column(name = "fone", length = 20)
    private String fone;

    @ManyToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidade;
}
