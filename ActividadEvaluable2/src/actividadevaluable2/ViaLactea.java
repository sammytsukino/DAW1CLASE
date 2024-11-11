package actividadevaluable2;

public class ViaLactea {
    private String nombre = null;
    private double masa = 0.0;
    private double volumen = 0.0;
    private int diametro = 0;
    private enum Tipo {LIQUIDO, TERRESTRE, GASEOSO};
    private boolean esObservable = false;
    private boolean esExterior = false;

    public ViaLactea(String nombre, double masa, double volumen, int diametro, boolean esObservable,
            boolean esExterior) {
        this.nombre = nombre;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.esObservable = esObservable;
        this.esExterior = esExterior;
    }

    public void imprimirXPantalla(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Masa: " + masa);
        System.out.println("Volumen: " + volumen);
        System.out.println("Diametro: " + diametro);
        System.out.println("Es Observable: " + esObservable);
        System.out.println("Es Exterior: " + esExterior);
    }

    public void getDensidad(){
        System.out.println("La densidad es: " + masa/volumen);
    }
    public void dentroVia(){
        if (esExterior = true) {
            System.out.println("Este planeta está dentro de la Vía Láctea");
        }
    }

    }



