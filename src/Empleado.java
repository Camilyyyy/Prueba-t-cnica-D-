public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private float salarioBase;


    public Empleado(int id, String nombre, String apellido, float salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre=" + nombre +
                ", apellido=" + apellido +
                ", salarioBase=" + salarioBase +
                '}';
    }

    protected float calcularSalario()
    {

        return 0;
    }

}
