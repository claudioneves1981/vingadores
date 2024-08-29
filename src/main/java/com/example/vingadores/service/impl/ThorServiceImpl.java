package com.example.vingadores.service.impl;

import com.example.vingadores.dto.AtaqueDTO;
import com.example.vingadores.service.AtaqueService;
import org.springframework.stereotype.Service;

@Service
public class ThorServiceImpl implements AtaqueService {

    @Override
    public AtaqueDTO poder(int tipo) {

        AtaqueDTO ataqueDTO = new AtaqueDTO();

        if(tipo == 1){
            ataqueDTO.setPoder("Martelada do Thor");
        }else if (tipo == 2){
            ataqueDTO.setPoder("Ataque Normal");
        }else{
            ataqueDTO.setPoder("Raio");
        }

        return ataqueDTO;
    }

    public AtaqueDTO poder(String nome) {

        AtaqueDTO ataqueDTO = new AtaqueDTO();

        if(nome.equals("martelo")){
            ataqueDTO.setPoder("Martelada do Thor");
        }else if (nome.equals("raio")){
            ataqueDTO.setPoder("Raio");
        }else{
            ataqueDTO.setPoder("Ataque Normal");
        }

        return ataqueDTO;
    }

}
