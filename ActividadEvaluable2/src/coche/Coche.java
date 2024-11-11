package coche;

enum TipoCombustible {
    GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
}

enum TipoAutomovil {
    BERLINA, COMPACTO, FAMILIAR, ADVANCE, SUV
}

enum Color {
    BLANCO, NEGRO, ROSA, ROJO, AMARILLO, VERDE, AZUL, GRIS
}

public class Coche {
    private String marca;
    private int modelo;
    private double motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private static final int VELOCIDAD_MAXIMA = 120;
    private Color color;
    private double velocidadActual;

    public Coche(String marca, int modelo, double motor, TipoCombustible tipoCombustible,
                 TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsientos, Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.color = color;
        this.velocidadActual = 0;
    }

	public double getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(double velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public String getMarca() {
		return marca;
	}

	public int getModelo() {
		return modelo;
	}

	public double getMotor() {
		return motor;
	}

	public TipoCombustible getTipoCombustible() {
		return tipoCombustible;
	}

	public TipoAutomovil getTipoAutomovil() {
		return tipoAutomovil;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public int getCantidadAsientos() {
		return cantidadAsientos;
	}

	public static int getVelocidadMaxima() {
		return VELOCIDAD_MAXIMA;
	}

	public Color getColor() {
		return color;
	}
	 public void acelerar(int incremento) {
	        if (velocidadActual + incremento > VELOCIDAD_MAXIMA) {
	            System.out.println("No se puede superar la velocidad máxima de " + VELOCIDAD_MAXIMA + " km/h!");
	            velocidadActual = VELOCIDAD_MAXIMA;
	        } else {
	            velocidadActual += incremento;
	            System.out.println("Velocidad actual: " + velocidadActual + " km/h");
	        }
	    }

	    public void desacelerar(int decremento) {
	        if (velocidadActual - decremento < 0) {
	            System.out.println("No se puede tener una velocidad negativa!");
	            velocidadActual = 0;
	        } else {
	            velocidadActual -= decremento;
	            System.out.println("Velocidad actual: " + velocidadActual + " km/h");
	        }
	    }
	    
	    public void frenar() {
	        velocidadActual = 0;
	        System.out.println("El coche se ha detenido completamente");
	    }
	    
	    public void calcularTiempoEstimado(double distancia) {
	        if(velocidadActual > 0) {
	            double tiempo = distancia / velocidadActual;
	            System.out.println("Tiempo estimado: " + tiempo + " horas");
	        } else {
	            System.out.println("El coche está parado");
	        }
	    }

		public void mostrarAtributos(){
			System.out.println("La marca del coche es: " + marca);
			System.out.println("El modelo del coche es: " + modelo);
			System.out.println("El motor del coche es: " + motor);
			System.out.println("El tipo de combustible del coche es: " + tipoCombustible);
			System.out.println("El tipo de automóvil del coche es: " + tipoAutomovil);
			System.out.println("El número de puertas del coche es: " + numeroPuertas);
			System.out.println("La cantidad de asientos del coche es: " + cantidadAsientos);
			System.out.println("El color del coche es: " + color);
			System.out.println("La velocidad actual del coche es: " + velocidadActual);
		}


	} 
