package com.PetCare.backend.persistance.entity;
@Entity
@Table(name = "DUENO")
public class Duenio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDueno;

    private String nombre;
    private String telefono;
    private String direccion;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @OneToMany(mappedBy = "dueno")
    private List<Mascota> mascotas;
}
