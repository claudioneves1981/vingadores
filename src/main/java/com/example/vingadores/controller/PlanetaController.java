package com.example.vingadores.controller;


import com.example.vingadores.model.Personagem;
import com.example.vingadores.model.Planeta;
import com.example.vingadores.service.impl.PlanetaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlanetaController {

    @Autowired
    private PlanetaServiceImpl planetaService;

    @PostMapping(value = "vingadores/criaplaneta")
    public void criaPlaneta(@RequestBody Planeta planeta){
        planetaService.criaPlaneta(planeta);
    }

    @PostMapping(value = "vingadores/planeta/{nomeplaneta}/adicionarpersonagem")
    public void addPersonagem(@PathVariable("nomeplaneta") String nomeDoPlaneta, @RequestBody Personagem p) throws Exception {
        planetaService.addPersonagem(nomeDoPlaneta,p);
    }

    @GetMapping(value = "vingadores/planeta/{nomeplaneta}")
    public ResponseEntity<Planeta> exibirPlaneta(@PathVariable("nomeplaneta") String nomeDoPlaneta){
        return new ResponseEntity<>(planetaService.exibirPlaneta(nomeDoPlaneta), HttpStatus.OK);
    }

    @GetMapping(value = "vingadores/exibirtodosplanetas")
    public ResponseEntity<List<Planeta>> exibirTodosPlanetas(){
        return new ResponseEntity<>(planetaService.exibirTodosPlanetas(), HttpStatus.OK);
    }




}
