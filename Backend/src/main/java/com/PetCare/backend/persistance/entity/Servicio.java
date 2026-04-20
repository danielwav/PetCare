package com.PetCare.backend.persistance.entity;
@Entity
@Table(name = "SERVICIO")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServicio;

    private String nombreServicio;
    private BigDecimal costo;

    @ManyToMany(mappedBy = "servicios")
    private List<Cita> citas;
}
