
package programacion;

public class Empleado {
    // Atributos privados para los sueldos
    private double sueldo1;
    private double sueldo2;
    private double sueldo3;
    private double sueldo4;

    // Constructor vacío
    public Empleado() {
    }

    // Constructor con parámetros
    public Empleado(double sueldo1, double sueldo2, double sueldo3, double sueldo4) {
        this.sueldo1 = sueldo1;
        this.sueldo2 = sueldo2;
        this.sueldo3 = sueldo3;
        this.sueldo4 = sueldo4;
    }

    // Métodos getters y setters para cada sueldo
    public double getSueldo1() {
        return sueldo1;
    }

    public void setSueldo1(double sueldo1) {
        this.sueldo1 = sueldo1;
    }

    public double getSueldo2() {
        return sueldo2;
    }

    public void setSueldo2(double sueldo2) {
        this.sueldo2 = sueldo2;
    }

    public double getSueldo3() {
        return sueldo3;
    }

    public void setSueldo3(double sueldo3) {
        this.sueldo3 = sueldo3;
    }

    public double getSueldo4() {
        return sueldo4;
    }

    public void setSueldo4(double sueldo4) {
        this.sueldo4 = sueldo4;
    }

    // Método para calcular el total de los sueldos
    public double calcularTotal() {
        return sueldo1 + sueldo2 + sueldo3 + sueldo4;
    }

    // Método para calcular el promedio de los sueldos
    public double calcularPromedio() {
        return calcularTotal() / 4;
    }

    // Método para encontrar el sueldo mayor
    public double sueldoMayor() {
        return Math.max(Math.max(sueldo1, sueldo2), Math.max(sueldo3, sueldo4));
    }

    // Método para encontrar el sueldo menor
    public double sueldoMenor() {
        return Math.min(Math.min(sueldo1, sueldo2), Math.min(sueldo3, sueldo4));
    }

    // Método para mostrar los resultados
    public void mostrarResultados() {
        System.out.println("Total de sueldos: " + calcularTotal());
        System.out.println("Promedio de sueldos: " + calcularPromedio());
        System.out.println("Sueldo mayor: " + sueldoMayor());
        System.out.println("Sueldo menor: " + sueldoMenor());
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un objeto Empleado y establecer los sueldos mediante setters
        Empleado empleado = new Empleado();
        empleado.setSueldo1(1200.50);
        empleado.setSueldo2(1400.75);
        empleado.setSueldo3(1300.60);
        empleado.setSueldo4(1250.80);

        // Mostrar los resultados
        empleado.mostrarResultados();
    }
}
