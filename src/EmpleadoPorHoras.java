public class EmpleadoPorHoras extends Empleado{
    private double horasTrabajadas;
    private double pagoPorHoras;

    public EmpleadoPorHoras(int id, String nombre, String apellido, double horasTrabajadas, double pagoPorHoras) {
        super(id, nombre, apellido);
        this.horasTrabajadas=horasTrabajadas;
        this.pagoPorHoras=pagoPorHoras;

    }

    @Override
    protected double calcularSalario() {
        return this.horasTrabajadas*pagoPorHoras;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.printf("HOras trabajadas %s\n", this.horasTrabajadas);
        System.out.printf("Pago por horas %s\n", this.pagoPorHoras);
    }
}
