package com.projeto.brasilapi.Service;

import org.springframework.stereotype.Service;
import br.com.brasilapi.BrasilAPI;
import br.com.brasilapi.api.CEP;

@Service
public class BrasilApiService {

    public CEP getEnderecoByCep(String cep) {
        try {
            return BrasilAPI.cep(cep);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
