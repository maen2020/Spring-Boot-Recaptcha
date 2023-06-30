package com.google.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data //Generar Getter y Setter.
@AllArgsConstructor //Generar constructor con parametros.
@NoArgsConstructor //Generar constructor vacio.
@Builder //
@Table(name = "Employee")
public class EmployeeEntity {

    //Atributos de la clase Empleado.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;
}
