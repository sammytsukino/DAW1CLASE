public class Rueda (){

private int capacidadMaxima;
private int capacidadActual;

public Rueda (){
    this.capacidadMaxima= 100
    this.capacidadActual=0
}

public Rueda (capacidadActual){
    capacidadActual=capacidadMaxima
}

public void llenarRueda (){
    capacidadActual=capacidadMaxima
System.out.println("La rueda ya está llena");
}

public void vaciarRueda (){

    capacidadActual=0;
    System.out.println("La rueda está vacía");


}