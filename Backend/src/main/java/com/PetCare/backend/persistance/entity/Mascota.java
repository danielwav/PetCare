package com.PetCare.backend.persistance.entity;
@Entity
@Table(name = "MASCOTA")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMascota;

    private String nombre;
    private String especie;
    private String raza;
    private LocalDate fechaNacimiento;

    @ManyToOne
    @JoinColumn(name = "id_duenio")
    private Dueno dueno;
}
