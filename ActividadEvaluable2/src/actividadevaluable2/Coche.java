package actividadevaluable2;

public class Coche {

    private String marca;
    private String modelo;
    private int fabricacion;
    private int cilindrada;
    private  Combustible = combustible; //{GASOLINA, DIESEL, BIOETANOL, BIODIESEL, GASNATURAL};
    private  Tipo = tipo; //{BERLINA, COMPACTO, FAMILIAR, ADVANCE, SUV};
    private int puertas;
    private int asientos;
    private static int velocidadMaxima=120;
    private  Color = color; //{BLANCO, NEGRO, ROSA, ROJO, AMARILLO, VERDE, AZUL, GRIS}
    
    public Coche(String marca, String modelo, int fabricacion, int cilindrada, int puertas, int asientos) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricacion = fabricacion;
        this.cilindrada = cilindrada;
        this.puertas = puertas;
        this.asientos = asientos;
    }

}
	
	
