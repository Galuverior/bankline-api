package com.github.bankline.api.controller;

import com.github.bankline.api.dto.MovimentacaoDTO;
import com.github.bankline.api.model.Movimentacao;
import com.github.bankline.api.repository.MovimentacaoRepository;
import com.github.bankline.api.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    @Autowired
    private MovimentacaoService movimentacaoService;

    @GetMapping
    public List<Movimentacao> findAll() {
        return movimentacaoRepository.findAll();
    }

    @GetMapping("/{idConta}")
    public List<Movimentacao> findAll(@PathVariable("idConta") Integer idConta) {
        return movimentacaoRepository.findByIdConta(idConta);
    }

    @PostMapping
    public void save(@RequestBody MovimentacaoDTO movimentacaoDTO) {
        movimentacaoService.save(movimentacaoDTO);
    }
}
