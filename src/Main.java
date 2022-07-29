import java.time.Period;

public class Main {
    public static void main(String[] args) {

    Persona persona = new Persona();
    persona.setNombre("Ramiro");
        System.out.println("Nombre :"+ persona.getNombre());

        persona.setEdad(35);
        System.out.println("Edad :"+ persona.getEdad());

        persona.setTelefono(942749295);
        System.out.println("Telefono :"+ persona.getTelefono());

    }
}

class Persona{
    private String nombre;
    private int edad;
    private int telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}


