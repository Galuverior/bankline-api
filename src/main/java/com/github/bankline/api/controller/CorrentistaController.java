package com.github.bankline.api.controller;

import com.github.bankline.api.dto.CorrentistaDTO;
import com.github.bankline.api.model.Correntista;
import com.github.bankline.api.repository.CorrentistaRepository;
import com.github.bankline.api.service.CorrentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

    @Autowired
    private CorrentistaRepository correntistaRepository;

    @Autowired
    private CorrentistaService correntistaService;

    @GetMapping
    public List<Correntista> findAll() {
        return correntistaRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody CorrentistaDTO correntistaDTO) {
        correntistaService.save(correntistaDTO);
    }
}
