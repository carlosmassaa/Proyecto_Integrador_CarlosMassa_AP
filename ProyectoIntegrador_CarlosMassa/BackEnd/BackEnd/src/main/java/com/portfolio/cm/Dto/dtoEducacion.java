
package com.portfolio.cm.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String nombreEmpresaE;
    @NotBlank
        private String fechasE;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String nombreEmpresaE, String fechasE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.nombreEmpresaE = nombreEmpresaE;
        this.fechasE = fechasE;
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
