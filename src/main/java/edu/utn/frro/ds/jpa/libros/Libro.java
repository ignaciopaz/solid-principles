package edu.utn.frro.ds.jpa.libros;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Libro {
	@Id
	private Integer id;
	private String titulo;
    private String isbn;
 
    @ManyToOne
    private Editorial editorial;
    
    @ManyToMany
    private List<Autor> autores;
 
   
}