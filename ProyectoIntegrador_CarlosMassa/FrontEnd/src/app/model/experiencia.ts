export class Experiencia {
    id? : number;
    nombreE : string;
    descripcionE : string;
    nombreEmpresE: string;
    fechasE: string;

    constructor(nombreE: string, descripcionE: string, nombreEmpresE: string, fechasE: string){
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.nombreEmpresE = nombreEmpresE;
        this.fechasE= fechasE;

    }
}