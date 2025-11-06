public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private float salarioBase;

    public float getSalarioBase() {
        return salarioBase;
    }

    public Empleado(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = 1000;
    }

    public void mostrarInformacion(){
        System.out.printf("Nombre %s\n", this.nombre);
        System.out.printf("Apellido %s\n", this.apellido);
        System.out.printf("Salario %f\n", this.salarioBase);
        System.out.printf("id %d\n", this.id);
    }

    protected double calcularSalario()
    {
        return 0;
    }

}
