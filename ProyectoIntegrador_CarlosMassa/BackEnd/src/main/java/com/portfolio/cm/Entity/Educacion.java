
package com.portfolio.cm.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String nombreEmpresaE;
    private String fechasE;

    public Educacion() {
    }

    public Educacion(String nombreE, String descripcionE, String nombreEmpresaE, String fechasE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.nombreEmpresaE = nombreEmpresaE;
        this.fechasE = fechasE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getNombreEmpresaE() {
        return nombreEmpresaE;
    }

    public void setNombreEmpresaE(String nombreEmpresaE) {
        this.nombreEmpresaE = nombreEmpresaE;
    }

    public String getFechasE() {
        return fechasE;
    }

    public void setFechasE(String fechasE) {
        this.fechasE = fechasE;
    }
    
    
    
    
}

