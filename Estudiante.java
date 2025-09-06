
public class Estudiante {
//Atributos->int,long,short -- float,double char---String="Cadenas de texto" 
long matricula;
String nombre;
char genero;
float pagoMensual;

//Métodos  
public void loguear(){
    System.out.println("Haz inciciado sesion...");
}

public void cerrarSesion(){
    System.out.println("Hasta la proxima, haz cerrado sesion...");
}

public void ingresarOC (){
    System.out.println ("Haz ingresado a la clase de POO");
}

public void salirOC(){
    System.out.println("Haz salido de la clase de POO");
}
public void imprimirInformacion(){
    System.out.println("Matricula:" + this.matricula);
    System.out.println("Nombre:" + this.nombre);
    System.out.println("Geneor:" + this.genero);
    System.out.println("Pago mensual:" + this.pagoMensual + "MXN:");
    System.out.println("**************************");
}

}
