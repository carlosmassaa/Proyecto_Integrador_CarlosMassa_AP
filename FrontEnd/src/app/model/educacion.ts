export class Educacion {
    id: number;
    nombreE: string;
    descripcionE : string;
    nombreEmpresaE: string;
    fechasE: string;

    constructor(nombreE: string, descripcionE : string, nombreEmpresaE: string, fechasE: string ){
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.nombreEmpresaE = nombreEmpresaE;
        this.fechasE = fechasE;
    }
}