package edu.utn.frro.ds.jpa.librosinheritance;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.ManyToMany;

public abstract class Publicacion {
	 @Id
	 private Integer id;
	 private String titulo;
	 @ManyToMany
	 private List<Autor> autores;
}
