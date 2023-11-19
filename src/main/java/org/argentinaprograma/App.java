package org.argentinaprograma;


import org.argentinaprograma.validadorCorrelativas.Alumno;
import org.argentinaprograma.validadorCorrelativas.Materia;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        Materia programacionI = new Materia("Programación I");
        Materia programacionII = new Materia("Programación II");
        Materia baseDeDatosI = new Materia("Base de datos I");
        programacionII.agregarMateriaCorrelativa(programacionI);
        List<Materia> materias = new ArrayList();
        materias.add(programacionI);
        materias.add(programacionII);
        materias.add(baseDeDatosI);
        Alumno alumno1 = new Alumno("Vanesa Sosa", "138000-0");
        Alumno alumno2 = new Alumno("José Rodríguez", "150000-0");
        List<Alumno> alumnos = new ArrayList();
        alumnos.add(alumno1);
        alumnos.add(alumno2);

    }
}
