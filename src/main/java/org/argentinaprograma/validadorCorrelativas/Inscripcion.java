package org.argentinaprograma.validadorCorrelativas;

import java.time.LocalDate;

public class Inscripcion {
    private Alumno alumno;
    private Materia materia;
    private LocalDate fecha;

    //Constructor
    public Inscripcion(Alumno alumno, Materia materia) {
        this.setAlumno(alumno);
        this.setMateria(materia);
        this.setFecha(LocalDate.now());
    }

    //Getters
    public Alumno getAlumno() {
        return this.alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return this.materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    //Métodos
    public boolean aprobada(){

        return this.materia.puedeCursar(this.alumno);

        /**
         * ¿Cómo sabemos si la inscripción está aceptada?
         * -La inscripción está aceptada si la materia no tiene correlativas.
         * -La inscripción está aceptada si la materia tiene correlativas y el alumno las tiene aprobadas
         */
        //TODO
        //return !this.materia.tenesCorrelativas() || this.materia.puedeCursar(this.alumno);
    }

    public String aprobadaString(){
        return this.aprobada() ? "Aprobada":"Rechazada";
    }

}
