package ValidadorCorrelativasTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import validadorCorrelativas.Alumno;
import validadorCorrelativas.Inscripcion;
import validadorCorrelativas.Materia;

public class InscripcionTest {
    @Test
    public void JuanSePuedeAnotarProgramacionI(){
        Alumno juan = new Alumno("Juan", "1123");
        Materia programacion1 = new Materia("Programacion I");
        Inscripcion inscripcionDeJuan = new Inscripcion(juan, programacion1);

        Assertions.assertTrue(inscripcionDeJuan.aprobada());
    }

    @Test
    public void JuanNoSePuedeAnotarProgramacionII(){
        Alumno juan = new Alumno("Juan", "1123");
        Materia programacion1 = new Materia("Programacion I");
        Materia programacion2 = new Materia("Programacion II");
        Inscripcion inscripcionDeJuan = new Inscripcion(juan, programacion2);

        programacion2.agregarCorrelativa(programacion1);

        Assertions.assertFalse(inscripcionDeJuan.aprobada());
    }

    @Test
    public void JuanSePuedeAnotarProgramacionII(){
        Alumno juan = new Alumno("Juan", "1123");
        Materia programacion1 = new Materia("Programacion I");
        Materia programacion2 = new Materia("Programacion II");
        Inscripcion inscripcionDeJuan = new Inscripcion(juan, programacion2);

        programacion2.agregarCorrelativa(programacion1);

        juan.agregarAprobada(programacion1);

        Assertions.assertTrue(inscripcionDeJuan.aprobada());
    }
}
