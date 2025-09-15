package Ejersicios_02_S2;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
       Triangulo areaTriangulo = new Triangulo();
       Scanner scanner = new Scanner(System.in);
    //Asignar valor a los atributos//Int-Integer, float-Floar, double-Double, String-String -->parse 
    System.out.print("Ingresar la base del triangulo: ");
    areaTriangulo.base = scanner.nextDouble();

    System.out.print("Ingresar la altura del triangulo: ");
    areaTriangulo.altura = scanner.nextDouble();

    double area = areaTriangulo.calcularArea();
    System.out.println("El área del triángulo es: " + area);
    scanner.close();
    }
}
