import prueba.Persona;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Richard", 19, "12345678B");
        Persona persona2 = new Persona();
        persona2.setNombre("niki");
        System.out.println(persona1.getNombre());

    }
}
