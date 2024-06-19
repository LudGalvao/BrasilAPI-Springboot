package com.projeto.brasilapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.brasilapi.Service.BrasilApiService;

import br.com.brasilapi.api.CEP;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class BrasilApiController {

    @Autowired
    private BrasilApiService brasilApiService;

    @GetMapping("/endereco/{cep}")
    public CEP getEndereco(@PathVariable String cep){
        return brasilApiService.getEnderecoByCep(cep);
    }
    
}
