package actividadevaluable2;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Miguel �ngel", "Conde D�az", "38678765Q", 1976);
        Persona persona2 = new Persona("Daniel", "D�az P�rez", "28898765M", 1990);
        
        System.out.println("Datos de las personas:");
        System.out.println("------------------------");
        persona1.imprimirXPantalla();
        persona2.imprimirXPantalla();
    }
}