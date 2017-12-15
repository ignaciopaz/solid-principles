package edu.utn.frro.ds.jpa.librosinheritance;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Articulo extends Publicacion {
   
    private String contenido;
    private String url;
 
    @ManyToOne
    private SitioWeb sitioWeb;
 
   
}