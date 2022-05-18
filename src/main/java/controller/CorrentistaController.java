package controller;

import model.Correntista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.CorrentistaRepository;

import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

    @Autowired
    private CorrentistaRepository correntistaRepository;

    @GetMapping
    public List<Correntista> findAll() {
        return correntistaRepository.findAll();
    }
}
