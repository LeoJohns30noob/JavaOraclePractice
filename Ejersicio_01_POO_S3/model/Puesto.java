
package model;

public class Puesto {
    private long codigo;
    private String nombre;
    private float sueldo;
//Constructores

public Puesto(){

}

public Puesto(float sueldo){
    //this Diferenciar parametros de class y parametro del constructor
    this.sueldo = sueldo;
}
public Puesto(long codigo,String nombre){
    this.codigo = codigo;
    this.nombre = nombre;
}
public Puesto(long codigo, String nombre, float sueldo){//1001,Dev web, 5000
    this.codigo = codigo;
    this.nombre = nombre;
    this.sueldo = sueldo;
}
//Metodos get 
public long getCodigo(){
    return this.codigo; 
}
public String getNombre(){
    return this.nombre;
}
public float getSueldo(){
    return this.sueldo;
}
//Metodos set -- Asignar valor a los atributos
public void setCodigo(long codigo){
    this.codigo = codigo;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
public void setSueldo(float sueldo){
    this.sueldo = sueldo;
}
}