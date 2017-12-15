package edu.utn.frro.ds.jpa.librosinheritance;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Libro extends Publicacion {
   
    private String isbn;
 
    @ManyToOne
    private Editorial editorial;
    
   
}