package com.prueba.crud.modelo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.ValueGenerationType;

@Entity
@Data
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    @Column
    private Long numDocumento;
    @Column
    private String Nombre;
    @Column
    private String Apellido;
    @Column
    private String correoElectronico;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(Long numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Persona(Integer id, String Nombre, String Apellido, String correoElectronico) {
        super ();
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.correoElectronico = correoElectronico;
    }

    public Persona(String Nombre, String Apellido, String correoElectronico) {
        super ();
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.correoElectronico = correoElectronico;
    }
    public Persona() {
        super ();

    }


}
