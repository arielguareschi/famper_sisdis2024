package br.edu.famper.nobank.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CidadeDto {
    @Schema(description = "Nome da cidade",
            example = "Ampere",
            title = "nome",
            maxLength = 150)
    private String nome;

    @Schema(description = "Estado da cidade",
            example = "PR",
            title = "uf",
            maxLength = 2)
    private String uf;
}
