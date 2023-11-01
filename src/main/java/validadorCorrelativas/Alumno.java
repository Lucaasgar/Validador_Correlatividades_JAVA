package validadorCorrelativas;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String Nombre;
    private String Legajo;
    private List<Materia> aprobadas;

    public Alumno(String nombre, String legajo) {
        this.Nombre = nombre;
        this.Legajo = legajo;
        this.aprobadas = new ArrayList<Materia>();
    }

    public String getNombre() {
        return Nombre;
    }

    public String getLegajo() {
        return Legajo;
    }

    public List<Materia> getAprobadas() {
        return aprobadas;
    }

    public void agregarAprobada(Materia aprobada){
        this.aprobadas.add(aprobada);
    }

    public boolean tenesCorrelativas(Materia materiaCorrelativa) {
        return this.aprobadas.contains(materiaCorrelativa);
    }
}
