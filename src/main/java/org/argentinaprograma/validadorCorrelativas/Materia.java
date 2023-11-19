package org.argentinaprograma.validadorCorrelativas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre){
        this.setNombre(nombre);
        this.correlativas=new ArrayList<Materia>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getCorrelativas() {
        return this.correlativas;
    }
    //Métodos


    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public void agregarMateriaCorrelativa(Materia materia){
        this.correlativas.add(materia);
    }

    public void quitarMateriaCorrelativa(Materia materia){
        this.correlativas.remove(materia);
    }

    public boolean puedeCursar(Alumno alumno) {

        /**
         * El alumno puede cursar la materia si cumple tiene todas las correlativas necesarias
         */
        if(this.getCorrelativas().size()==0){
            return true;
        } else {
            Iterator var3 = this.getCorrelativas().iterator();
            while (var3.hasNext()){
                Materia materia = (Materia)var3.next();
                if (!alumno.getMateriasAprobadas().contains(materia)) {
                    return false;
                }
            }
            return true;
        }
        //return this.correlativas.stream().allMatch(materiaCorrelativa -> alumno.tenesCorrelativa(materiaCorrelativa));
    }

    //public boolean tenesCorrelativas() {
      //  return !this.correlativas.isEmpty();
    //}
}
