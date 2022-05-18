package com.github.bankline.api.service;

import com.github.bankline.api.dto.CorrentistaDTO;
import com.github.bankline.api.model.Conta;
import com.github.bankline.api.model.Correntista;
import com.github.bankline.api.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CorrentistaService {

    @Autowired
    private CorrentistaRepository correntistaRepository;

    public void save(CorrentistaDTO correntistaDTO) {
        Correntista correntista = new Correntista();
        correntista.setCpf(correntista.getCpf());
        correntista.setNome(correntistaDTO.getNome());

        Conta conta = new Conta();
        conta.setSaldo(0.0);
        conta.setNumero(new Date().getTime());

        correntista.setConta(conta);
        correntistaRepository.save(correntista);
    }
}
