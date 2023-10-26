package practicas.unidad2.java;

class Persona {
    String nombre;
    int edad;
    boolean vive;

    void saludar() {
        System.out.println("Hola mi nombre es " + nombre);
    }

    void incrementaredad() {
        edad = edad + 1;
    }

    void morir() {
        vive = false;
    }
}
