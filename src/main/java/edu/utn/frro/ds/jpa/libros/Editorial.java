package edu.utn.frro.ds.jpa.libros;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Editorial {
    @Id
    private Integer id;
    private String nombre;
    private String direccion;
 
    @OneToMany(mappedBy = "editorial")
    private List<Libro> libros;
}
