public class AppEstudiante {
    public static void main(String[]args){
        System.out.println("Bienvenido a nuestra aplicacion con POO");
        //Creando Objetos de estudiantes
        Estudiante mario = new Estudiante();
        Estudiante maria = new Estudiante();
        //Acceso a los atributos y metodos de los objetos
        mario.matricula = 54281758;
        mario.nombre = "Mario Morales";
        mario.genero = 'M';
        mario.pagoMensual = 1500;
        mario.loguear();
        mario.ingresarOC();
        mario.salirOC();
        mario.cerrarSesion();

        maria.matricula = 8974512;
        maria.nombre = "Maria Gonzalez";
        maria.genero = 'F';
        maria.pagoMensual = 1200;

        //Impresion de los estudiantes por medio de un metodo
        mario.imprimirInformacion();
        maria.imprimirInformacion();

    }
}
