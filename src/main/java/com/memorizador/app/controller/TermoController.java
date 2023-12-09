package com.memorizador.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.memorizador.app.model.Termo;
import com.memorizador.app.service.TermoService;

@RestController
@RequestMapping("termo")
public class TermoController {
    
    @Autowired
    private TermoService termoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Termo create(@RequestBody Termo termo) {
        return termoService.create(termo);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        termoService.delete(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Termo update(@RequestBody Termo termo) {
        return termoService.update(termo);
    }
}
