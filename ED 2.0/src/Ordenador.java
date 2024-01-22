/**
 * La clase Persona representa a una persona con información básica como nombre, edad y DNI.
 */
public class Persona {

    /**
     * El nombre de la persona.
     */
    private String nombre;

    /**
     * La edad de la persona.
     */
    private int edad;

    /**
     * El Documento Nacional de Identidad (DNI) de la persona.
     */
    private String dni;

    /**
     * Constructor para crear una nueva instancia de la clase Persona.
     *
     * @param nombre El nombre de la persona.
     * @param edad La edad de la persona.
     * @param dni El Documento Nacional de Identidad (DNI) de la persona.
     */
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre El nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad de la persona.
     *
     * @return La edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     *
     * @param edad La nueva edad de la persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el Documento Nacional de Identidad (DNI) de la persona.
     *
     * @return El DNI de la persona.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el Documento Nacional de Identidad (DNI) de la persona.
     *
     * @param dni El nuevo DNI de la persona.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
}
