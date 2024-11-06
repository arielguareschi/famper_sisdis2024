package br.edu.famper.nobank.controller;

import br.edu.famper.nobank.dto.CidadeDto;
import br.edu.famper.nobank.exception.ResourceNotFoundException;
import br.edu.famper.nobank.model.Cidade;
import br.edu.famper.nobank.service.CidadeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Get one city from DB",
            description = "Fetches one city from DB and return " +
                    "in JSON Object"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful"),
            @ApiResponse(responseCode = "404", description = "not fund")
    })
    public ResponseEntity<CidadeDto> getCidadeById(@PathVariable(name = "id") Long id) throws ResourceNotFoundException {
        log.info("Buscando cidade por id: {}", id);
        return ResponseEntity.ok().body(cidadeService.getCidadeById(id));
    }

    @PostMapping
    @Operation(summary = "Save city",
            description = "Save a city in database"
    )
    public Cidade createCidade(@RequestBody CidadeDto cidadeDto) throws ResourceNotFoundException {
        log.info("Cadastro cidade: {}", cidadeDto);
        return cidadeService.saveCidade(cidadeDto);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Update city",
            description = "Update a city in database"
    )
    public ResponseEntity<CidadeDto> updateCidade(@PathVariable(name = "id") Long id, @RequestBody CidadeDto cidadeDto) throws ResourceNotFoundException {
        log.info("Atualizando cidade: {}", cidadeDto);
        return ResponseEntity.ok(cidadeService.editCidade(id, cidadeDto));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove city",
            description = "Remove a city in database"
    )
    public Map<String, Boolean> deleteCidade(@PathVariable(name = "id") Long id) throws Exception {
        log.info("Deletando cidade: {}", id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", cidadeService.deleteCidade(id));
        return response;
    }


}
