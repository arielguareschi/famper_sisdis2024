package br.edu.famper.nobank.service;

import br.edu.famper.nobank.dto.CidadeDto;
import br.edu.famper.nobank.model.Cidade;
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

    // buscar uma cidade
    public CidadeDto getCidadeById(Long id){
        Cidade cid = cidadeRepository.findById(id).orElseThrow();
        return new CidadeDto()
                .builder()
                .nome(cid.getNome())
                .uf(cid.getUf())
                .build();
    }

    // inserir uma cidade
    public Cidade saveCidade(CidadeDto cidadeDto){
        Cidade cidade = new Cidade();
        cidade.setNome(cidadeDto.getNome());
        cidade.setUf(cidadeDto.getUf());
        return cidadeRepository.save(cidade);
    }

    // editar uma cidade
    public CidadeDto editCidade(Long id, CidadeDto cidadeDto){
        Cidade cidade = cidadeRepository.findById(id).orElseThrow();
        cidade.setNome(cidadeDto.getNome());
        cidade.setUf(cidadeDto.getUf());
        Cidade cidadeEdited = cidadeRepository.save(cidade);
        return new CidadeDto()
                .builder()
                .nome(cidadeEdited.getNome())
                .uf(cidadeEdited.getUf())
                .build();
    }

    // apagar uma cidade
    public boolean deleteCidade(Long id){
        try{
            Cidade cidade = cidadeRepository.findById(id).orElseThrow();
            cidadeRepository.deleteById(id);
            return true;
        } catch (Exception e){
            return false;
        }
    }

}
