package com.example.vingadores.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SequenceGenerator(name = "seq_planeta" , sequenceName = "seq_planeta", allocationSize = 1)
public class Planeta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_planeta")
    @Column(name = "ID_PLANETA")
    private Long id;

    private String nomePlaneta;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name="TB_PLANETA_PERSONAGEM",
            joinColumns = @JoinColumn(name = "ID_PLANETA", referencedColumnName = "ID_PLANETA"),
            inverseJoinColumns = @JoinColumn(name = "ID_PERSONAGEM",referencedColumnName = "ID_PERSONAGEM")
    )
    private List<Personagem> personagens;

}
