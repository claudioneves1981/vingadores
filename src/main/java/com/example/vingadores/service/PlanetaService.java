package com.example.vingadores.service;

import com.example.vingadores.model.Personagem;
import com.example.vingadores.model.Planeta;

import java.util.List;

public interface PlanetaService {

    void criaPlaneta(Planeta planeta);
    void addPersonagem(String nomeDoPlaneta, Personagem personagem);
    Planeta exibirPlaneta(String nomeDoPlaneta);
    List<Planeta> exibirTodosPlanetas();

}
