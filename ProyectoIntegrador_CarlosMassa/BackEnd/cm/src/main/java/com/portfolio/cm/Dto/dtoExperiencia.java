
package com.portfolio.cm.Dto;

import javax.validation.constraints.NotBlank;



public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String nombreEmpresE;
    @NotBlank
    private String fechasE;
    
    //Constructor

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String nombreEmpresE, String fechasE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.nombreEmpresE = nombreEmpresE;
        this.fechasE = fechasE;
    }





    
    //Getter and Setter 

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
