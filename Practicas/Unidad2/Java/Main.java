package practicas.unidad2.java;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.edad = 25;
        persona.nombre = "Rogelio";
        persona.vive = true;

        persona.saludar();
        persona.incrementaredad();
        persona.morir();

        System.out.println("La edad de la persona es " + persona.edad);

        System.out.println("Hola mi nombre es " + persona.nombre);
        System.out.println("La persona vive? " + persona.vive);

    }

}
