package edu.utn.frro.ds.jpa.libros;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Autor {
    @Id
    private Integer id;
    private String nombre;
    private String apellido;
 
    @ManyToMany
    private List<Libro> libros;
}
 

