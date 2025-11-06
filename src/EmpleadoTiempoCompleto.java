public class EmpleadoTiempoCompleto extends Empleado{
    public EmpleadoTiempoCompleto(int id, String nombre, String apellido) {
        super(id, nombre, apellido);
    }

    @Override
    protected double calcularSalario() {
       return this.getSalarioBase()*1.10;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();

    }
}
