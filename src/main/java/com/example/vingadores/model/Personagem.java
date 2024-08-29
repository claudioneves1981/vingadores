package com.example.vingadores.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(name = "seq_personagem" , sequenceName = "seq_personagem", allocationSize = 1)
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_personagem")
    @Column(name = "ID_PERSONAGEM")
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "ID_PLANETA")
    private Planeta planeta;



}
