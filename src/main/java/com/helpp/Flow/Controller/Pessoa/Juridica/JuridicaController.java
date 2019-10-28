package com.helpp.Flow.Controller.Pessoa.Juridica;

import com.helpp.Flow.Repository.PessoaJuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class JuridicaController {

    @Autowired
    public PessoaJuridicaRepository pessoaJuridicaRepository;

    @RequestMapping("/juridica")
    public String obterPessoaJuridicac() {
       return "teste";//pessoaJuridicaRepository.findAll();
    }

}