/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg25sepb;

/**
 *
 * @author estudiante
 */
public class Estudiante {
    private String nombre;
    private int nota;
    Estudiante(String a, int n){
    nombre=a;
    nota=n;
    }
    Estudiante(){
    
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    public void mostrar(){
    System.out.println(nombre+" "+nota);
    }
}
