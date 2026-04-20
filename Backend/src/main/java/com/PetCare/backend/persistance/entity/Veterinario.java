package com.PetCare.backend.persistance.entity;
@Entity
@Table(name = "VETERINARIO")
public class Veterinario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVeterinario;

    private String especialidad;
    private String numeroColegiado;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
}
