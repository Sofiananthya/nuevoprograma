/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona1;

/**
 *
 * @author User
 */
public class Estilista extends Persona {
    private String especialidadCorte;
    
    public String getEspecialidadCorte() {
        return especialidadCorte;
    }
    
    public void setEspecialidadCorte(String especialidadCorte) {
        this.especialidadCorte = especialidadCorte;
    }
    
    public void mostrarEspecialidadCorte() {
        System.out.println("Especialidad en Corte de Cabello: " + especialidadCorte);
    }
    
}
