package br.edu.famper.nobank.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteDto {

    private String nome;
    private String fone;
    private CidadeDto cidade;
}
