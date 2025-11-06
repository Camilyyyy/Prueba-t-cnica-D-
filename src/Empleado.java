public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private float salarioBase;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
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

    protected float calcularSalario()
    {
        return 0;
    }

}
