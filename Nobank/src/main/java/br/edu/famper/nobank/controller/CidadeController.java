package br.edu.famper.nobank.controller;

import br.edu.famper.nobank.dto.CidadeDto;
import br.edu.famper.nobank.service.CidadeService;
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
public class CidadeController {

    private final CidadeService cidadeService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CidadeDto> getAllCidades() {
        log.info("Buscando todas as cidades");
        return cidadeService.getAllCidades();
    }
}
