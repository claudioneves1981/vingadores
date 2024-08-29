package com.example.vingadores.service.impl;

import com.example.vingadores.dto.AtaqueDTO;
import com.example.vingadores.service.AtaqueService;
import org.springframework.stereotype.Service;

@Service
public class ThanosServiceImpl implements AtaqueService {

    @Override
    public AtaqueDTO poder(int tipo) {
        AtaqueDTO ataqueDTO = new AtaqueDTO();
        if(tipo == 1){
            ataqueDTO.setPoder("Joia do tempo");
        }else if(tipo == 2){
            ataqueDTO.setPoder("Joia do poder");
        }else if(tipo == 3){
            ataqueDTO.setPoder("Joia da Alma");
        }else{
            ataqueDTO.setPoder("Atacar Normal");
        }
        return ataqueDTO;
    }
}
