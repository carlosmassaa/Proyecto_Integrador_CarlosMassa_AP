

package com.portfolio.cm.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String nombreEmpresE;
    private String fechasE;
    
    //Constructores

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String nombreEmpresE, String fechasE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.nombreEmpresE = nombreEmpresE;
        this.fechasE = fechasE;
    }

    
    
    //Getter and Setter

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

    public String getNombreEmpresE() {
        return nombreEmpresE;
    }

    public void setNombreEmpresE(String nombreEmpresE) {
        this.nombreEmpresE = nombreEmpresE;
    }

    public String getFechasE() {
        return fechasE;
    }

    public void setFechasE(String fechasE) {
        this.fechasE = fechasE;
    }

}
