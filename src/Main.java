public class Main {
    public static void main(String[] args){
        Empleado empleado1 = new Empleado(2, "Juan", "Perez");
        EmpleadoTiempoCompleto empleadoTiempoCompleto1= new EmpleadoTiempoCompleto(3, "Angie", "Velez");
        EmpleadoPorHoras empleadoPorHoras1=new EmpleadoPorHoras(4, "Sofia", "Macias", 8, 2.5);
        empleado1.calcularSalario();
        empleado1.mostrarInformacion();
        empleadoPorHoras1.mostrarInformacion();
        empleadoPorHoras1.calcularSalario();
        empleadoTiempoCompleto1.mostrarInformacion();
        empleadoTiempoCompleto1.calcularSalario();

    }

}