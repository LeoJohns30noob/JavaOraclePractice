package Ejersicios_01_S2;

public class Calculadora {
    //Atributos o Variables generales
    float numeroUno;
    float numeroDos;
    //Métodos-- Alcance ValorRetorno nonbreMetodo () o (.......)
    public float sumar(){
    //Ambito del metodo 
    return numeroUno + numeroDos;
    } 
    public float restar(){
        return numeroUno - numeroDos;
    }
    public float dividir(){
        return numeroUno / numeroDos;
    }
    public float obtenerResiduo(){
        return numeroUno % numeroDos;
    }
    public float multiplicar(){
        return numeroUno * numeroDos; 
    }
    public float multiplicar(float numeroUno, float numeroDos){
        return numeroUno*numeroDos; //Variables locales
    } 
}
