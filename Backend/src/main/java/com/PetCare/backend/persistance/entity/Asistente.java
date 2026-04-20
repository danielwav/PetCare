package com.PetCare.backend.persistance.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ASISTENTE")
@Data
public class Asistente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsistente;

    @Column(columnDefinition = "TEXT")
    private String funciones;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", referencedColumnName = "idUsuario")
    private Usuario usuario;
}
