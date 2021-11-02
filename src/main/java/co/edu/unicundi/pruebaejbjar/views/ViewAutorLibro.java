/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.views;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

/**
 *
 * @author Joseph
 */
@Entity
@Table(name = "ViewAutorLibro")

@NamedNativeQueries({
    @NamedNativeQuery(name = "Autor.ListarTodos", query = "SELECT * FROM public.ViewAutorLibro")
})

public class ViewAutorLibro implements Serializable{
    
    @Id    
    private Integer id;   
    
    @Column(name = "identificacion")
    private String identificacion;      
    
    @Column(name = "nombre_autor")
    private String nombreAutor;    
    
    @Column(name = "apellido")
    private String apellido;    
    
    @Column(name = "edad")
    private Integer edad;   

    @Column(name = "nombre_libro")
    private String nombreLibro;     
    
    @Column(name = "descripcion")
    private String descripcion;       
    
    @Column(name = "no_paginas")
    private Integer noPaginas;
    
    @Column(name = "cantidad")
    private Integer cantidad;

    public ViewAutorLibro() {
    }

    public ViewAutorLibro(String identificacion, String nombreAutor, String apellido, Integer edad, String nombreLibro, String descripcion, Integer noPaginas, Integer cantidad) {
        this.identificacion = identificacion;
        this.nombreAutor = nombreAutor;
        this.apellido = apellido;
        this.edad = edad;
        this.nombreLibro = nombreLibro;
        this.descripcion = descripcion;
        this.noPaginas = noPaginas;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNoPaginas() {
        return noPaginas;
    }

    public void setNoPaginas(Integer noPaginas) {
        this.noPaginas = noPaginas;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
