package Ejersicios_01_S2;

public class Aplicacion {
    public static void main(String[]args){
    //Creando instancia u objeto de calculadora 
    Calculadora basica = new Calculadora();//Construcor vacío
    //Asignando valores a los atributos
    basica.numeroUno= 45.25F;
    basica.numeroDos= 13.14F;
    
    basica.sumar();
    basica.restar();
    basica.dividir();
    basica.multiplicar();
    basica.obtenerResiduo();
    basica.multiplicar();//Valores asignados a los atributos
    basica.multiplicar(75, 89);//Otros valos que el usuario o el programa asigna

    System.out.println("La suma de "+ basica.numeroUno + " y " +basica.numeroDos + "=" + basica.sumar());
    System.out.println("La division de " + basica.numeroUno + " y " + basica.numeroDos + "=" + basica.dividir());
    System.out.println("La multiplicacion de " + basica.numeroUno + " y " + basica.numeroDos + "=" + basica.multiplicar());
    System.out.println("La multiplicacion es: " + "=" + basica.multiplicar( 74,15));

    }
}
