package ejercicios2;

public class Tetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Tetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Tetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    public Tetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;

        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    public void llenarTe() {
        cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int capacidadTaza) {
        if (cantidadActual >= capacidadTaza) {
            cantidadActual -= capacidadTaza;
        } else {
            System.out.println("No hay suficiente té. Se sirvió lo que quedaba: " + cantidadActual + " c.c.");
            cantidadActual = 0;
        }
    }

    public void vaciarTe() {
        cantidadActual = 0;
    }

    public void agregarTe(int cantidad) {
        if (cantidadActual + cantidad > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        } else {
            cantidadActual += cantidad;
        }
    }

    public static void main(String[] args) {

        Tetera tetera1 = new Tetera();
        System.out.println("Tetera 1 - Capacidad Máxima: " + tetera1.getCapacidadMaxima());
        System.out.println("Tetera 1 - Cantidad Actual: " + tetera1.getCantidadActual());

        // Llenar la tetera 1 y verificar la cantidad actual
        tetera1.llenarTe();
        System.out.println("Tetera 1 después de llenar - Cantidad Actual: " + tetera1.getCantidadActual());

        // Servir una taza de 200 c.c. de la tetera 1
        tetera1.servirTaza(200);
        System.out.println("Tetera 1 después de servir una taza de 200 c.c. - Cantidad Actual: " + tetera1.getCantidadActual());

        // Vaciar la tetera 1 y verificar la cantidad actual
        tetera1.vaciarTe();
        System.out.println("Tetera 1 después de vaciar - Cantidad Actual: " + tetera1.getCantidadActual());

        // Crear una tetera con capacidad máxima de 1500 c.c. y cantidad inicial de 1500 c.c.
        Tetera tetera2 = new Tetera(1500);
        System.out.println("\nTetera 2 - Capacidad Máxima: " + tetera2.getCapacidadMaxima());
        System.out.println("Tetera 2 - Cantidad Actual: " + tetera2.getCantidadActual());

        // Servir una taza de 500 c.c. de la tetera 2
        tetera2.servirTaza(500);
        System.out.println("Tetera 2 después de servir una taza de 500 c.c. - Cantidad Actual: " + tetera2.getCantidadActual());

        // Agregar 200 c.c. de té a la tetera 2
        tetera2.agregarTe(200);
        System.out.println("Tetera 2 después de agregar 200 c.c. - Cantidad Actual: " + tetera2.getCantidadActual());

        // Crear una tetera con capacidad máxima de 1200 c.c. y cantidad inicial de 1500 c.c.
        Tetera tetera3 = new Tetera(1200, 1500);
        System.out.println("\nTetera 3 - Capacidad Máxima: " + tetera3.getCapacidadMaxima());
        System.out.println("Tetera 3 - Cantidad Actual (ajustada al máximo): " + tetera3.getCantidadActual());

        // Agregar más té a la tetera 3 para comprobar el límite
        tetera3.agregarTe(100);
        System.out.println("Tetera 3 después de intentar agregar 100 c.c. - Cantidad Actual: " + tetera3.getCantidadActual());
    }
}
