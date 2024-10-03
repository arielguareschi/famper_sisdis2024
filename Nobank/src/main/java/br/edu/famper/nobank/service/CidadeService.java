package br.edu.famper.nobank.service;

import br.edu.famper.nobank.dto.CidadeDto;
import br.edu.famper.nobank.repository.CidadeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<CidadeDto> getAllCidades(){
        return cidadeRepository
                .findAll()
                .stream()
                .map(cidade -> CidadeDto
                        .builder()
                        .nome(cidade.getNome())
                        .uf(cidade.getUf())
                        .build()
                )
                .toList();
    }
}
