package com.example.vingadores.service.impl;

import com.example.vingadores.model.Personagem;
import com.example.vingadores.model.Planeta;
import com.example.vingadores.repository.PlanetaRepository;
import com.example.vingadores.service.PlanetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetaServiceImpl implements PlanetaService {

    @Autowired
    private PlanetaRepository planetaRepository;

    @Override
    public void criaPlaneta(Planeta planeta) {
        planetaRepository.save(planeta);
    }

    @Override
    public void addPersonagem(String nomeDoPlaneta, Personagem p) {

        Planeta planeta = planetaRepository.findByNomePlaneta(nomeDoPlaneta);
        List<Personagem> personagens = planeta.getPersonagens();
        personagens.add(p);
        planeta.setPersonagens(personagens);
        planetaRepository.save(planeta);

    }

    @Override
    public Planeta exibirPlaneta(String nomeDoPlaneta) {
        return planetaRepository.findByNomePlaneta(nomeDoPlaneta);
    }

    @Override
    public List<Planeta> exibirTodosPlanetas() {
        return planetaRepository.findAll();
    }
}
