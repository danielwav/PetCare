package com.PetCare.backend.persistance.entity;
@Entity
@Table(name = "HISTORIACLINICA")
public class HistoriaClinica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHistoria;

    @OneToOne
    @JoinColumn(name = "id_mascota")
    private Mascota mascota;
}