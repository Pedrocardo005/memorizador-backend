package com.memorizador.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.memorizador.app.model.Termo;
import com.memorizador.app.repository.TermoRepository;

@Service
public class TermoService {
    
    @Autowired
    private TermoRepository termoRepository;

    public Termo create(Termo termo) {
        return termoRepository.save(termo);
    }

    public void delete(Integer id) {
        termoRepository.deleteById(id);
    }

    public Termo update(Termo termo) {
        return termoRepository.save(termo);
    }
}
