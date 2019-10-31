package com.helpp.Flow.Controller.Pessoa.Juridica;

import com.helpp.Flow.Domain.Entity.PessoaJuridica;
import com.helpp.Flow.Repository.PessoaJuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@RestController
@RequestMapping(value="/api/v1/pessoa")
public class JuridicaController {

    @Autowired
    PessoaJuridicaRepository pessoaJuridicaRepository;

    @GetMapping("/juridica")
    public  @ResponseBody List<PessoaJuridica> obterPessoaJuridica() {
        return pessoaJuridicaRepository.findAll();
    }
}