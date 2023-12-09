package com.memorizador.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "termo")
@Data
@NoArgsConstructor
public class Termo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String ingles;

    @Column
    private String portugues;

    @Column
    private Integer unidade;

    @Column(nullable = true)
    private String pronunca;
    
}
