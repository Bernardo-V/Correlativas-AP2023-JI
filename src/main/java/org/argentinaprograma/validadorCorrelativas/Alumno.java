package org.argentinaprograma.validadorCorrelativas;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String legajo) {
        this.setLegajo(legajo);
        this.setNombre(nombre);
        this.materiasAprobadas=new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getLegajo() {
        return this.legajo;
    }

    public void setLegajo(String legajo){
        this.legajo=legajo;
    }
    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public void agregarMateriaAprobada(Materia materia){
        this.materiasAprobadas.add(materia);
    }

    public void quitarMateriaAprobada(Materia materia){
        this.materiasAprobadas.remove(materia);
    }

    public boolean tenesCorrelativa(Materia materiaCorrelativa) {
        return this.materiasAprobadas.contains(materiaCorrelativa);
    }
}
