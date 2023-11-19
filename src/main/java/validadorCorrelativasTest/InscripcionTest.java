package validadorCorrelativasTest;


import org.junit.jupiter.api.Assertions;
import org.argentinaprograma.validadorCorrelativas.Alumno;
import org.argentinaprograma.validadorCorrelativas.Inscripcion;
import org.argentinaprograma.validadorCorrelativas.Materia;

public class InscripcionTest {

    public void juanSePuedeAnotarAProgramacionI(){
        Alumno juan=new Alumno( "Juan", "1557");
        Materia programacionI = new Materia ( "Programación I");
        Inscripcion inscripcionDeJuanAPrograI=new Inscripcion(juan,programacionI);
        Assertions.assertTrue(inscripcionDeJuanAPrograI.aprobada());
    }
}
