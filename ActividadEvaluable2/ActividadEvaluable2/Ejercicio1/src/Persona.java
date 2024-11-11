public class Persona {
	
    private String nombre;
    private String apellidos;
    private String dni;
    private int anyoDeNacimiento;
    
    public Persona(String nombre, String apellidos, String dni, int anyoDeNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.anyoDeNacimiento = anyoDeNacimiento;
    }
    
    public void imprimirXPantalla() {
        System.out.println("Datos de la persona:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("DNI: " + dni);
        System.out.println("Año de nacimiento: " + anyoDeNacimiento);
        System.out.println("------------------------");
    }
}
