
package model.app;
import java.util.Scanner;
import model.Puesto;
public class App{
    public static void main(String[] args) {
        Puesto secretaria = new Puesto();
        Puesto intendencia = new Puesto(2000);
        Puesto gerencia = new Puesto(1524, "Gerencia");
        Puesto dev = new Puesto(1001,"Dev web", 5000);

        //Impresion del objeto dev
        System.out.println("Puesto:" + dev.getNombre());
        System.out.println("Sueldo:" + dev.getSueldo());
        System.out.println("Codigo:" + dev.getCodigo());
        System.out.println("***************************");
        //Impresion del objeto gerencia
        System.out.println("Codigo:" + gerencia.getCodigo());
        System.out.println("Nombre:" + gerencia.getNombre());
        gerencia.setSueldo(8000);
        System.out.println("Sueldo:" + gerencia.getSueldo());//8000.0
        System.out.println("***************************");
        //Llenar atributos desde el teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa los datos del puesto secretaria");
        System.out.println("***************************");
        secretaria.setCodigo(Long.parseLong(teclado.nextLine()));
        secretaria.setNombre(teclado.nextLine());
        secretaria.setSueldo(Float.parseFloat(teclado.nextLine()));
        System.out.println("***************************");
        System.out.println("Puesto:" + secretaria.getNombre());
        System.out.println("Sueldo:" + secretaria.getSueldo());
        System.out.println("Codigo:" + secretaria.getCodigo());
    }
}