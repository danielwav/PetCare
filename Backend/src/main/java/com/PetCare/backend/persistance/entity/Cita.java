package com.PetCare.backend.persistance.entity;
@Entity
@Table(name = "CITA")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCita;

    @ManyToOne
    @JoinColumn(name = "id_historia")
    private HistoriaClinica historiaClinica;

    private LocalDateTime fechaHora;
    private String motivo;

    @Enumerated(EnumType.STRING)
    private EstadoCita estado;

    @ManyToOne
    @JoinColumn(name = "id_veterinario")
    private Veterinario veterinario;

    @ManyToMany
    @JoinTable(
        name = "CITASERVICIO",
        joinColumns = @JoinColumn(name = "id_cita"),
        inverseJoinColumns = @JoinColumn(name = "id_servicio")
    )
    private List<Servicio> servicios;
}
