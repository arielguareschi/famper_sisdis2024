package br.edu.famper.nobank.controller;

import br.edu.famper.nobank.dto.CidadeDto;
import br.edu.famper.nobank.service.CidadeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cidade")
@RequiredArgsConstructor
@Slf4j
@Tag(name = "Cidade",
     description = "Operation for cities")
public class CidadeController {

    private final CidadeService cidadeService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Get all cities from DB",
               description = "Fetches all cities from DB and return " +
                       "in JSON Array"
                )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful"),
            @ApiResponse(responseCode = "404", description = "not fund")
    })
    public List<CidadeDto> getAllCidades() {
        log.info("Buscando todas as cidades");
        return cidadeService.getAllCidades();
    }
}
