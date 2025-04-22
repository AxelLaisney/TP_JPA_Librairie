package fr.diginamic.entity;


import jakarta.persistence.*;

@Entity
@Table
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
