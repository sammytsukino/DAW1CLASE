package actividadevaluable2;

enum Combustible {
    GASOLINA, DIESEL, BIOETANOL, BIODIESEL, GASNATURAL
}

enum Tipo {
    
    BERLINA, COMPACTO, FAMILIAR, ADVANCE, SUV

}

enum Color {
    BLANCO, NEGRO, ROSA, ROJO, AMARILLO, VERDE, AZUL, GRIS
}


public class Coche {

    private String marca;
    private String modelo;
    private int fabricacion;
    private int cilindrada;
    private Combustible combustible;
    private Tipo tipo;
    private int puertas;
    private int asientos;
    private static int velocidadMaxima=120;
    private Color color;
    
    public Coche(String marca, String modelo, int fabricacion, int cilindrada, int puertas, int asientos, Combustible combustible, Tipo tipo, Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricacion = fabricacion;
        this.cilindrada = cilindrada;
        this.puertas = puertas;
        this.asientos = asientos;
    }

}
