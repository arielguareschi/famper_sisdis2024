package br.edu.famper.nobank.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CidadeDto {

    private String nome;
    private String uf;
}
