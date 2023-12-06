/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona1;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado(); 
        empleado.nombre = "Pedro";
        empleado.edad = 25;
        empleado.sexo = "Masculino";
        empleado.sueldo = 50000.0;
        empleado.mostrarDatos();
        empleado.mostrarSueldo();
        
        
        System.out.println( "\n");
        System.out.println("Estudiante: ");
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Ana");
        estudiante.setEdad(20);
        estudiante.setGenero( "Femenino");
        estudiante.setCarrera("Ingenieria Informatica");
        estudiante.mostrarDatos();
        estudiante.mostarCarrera();
        
    }
    
}
