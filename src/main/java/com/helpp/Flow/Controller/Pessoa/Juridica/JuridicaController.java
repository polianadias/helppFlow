package com.helpp.Flow.Controller.Pessoa.Juridica;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JuridicaController {

    @RequestMapping("/juridica")
    public String obterPessoaJuridicac(){
        return "Funciona o cadastro";
    }

}