/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg25desep;

/**
 *
 * @author estudiante
 */
public class Main {
    public static void main(String[] args) {
        MultiPilaPe A=new MultiPilaPe();
        A.adicionar(new Persona("Pipo",34), 1);
       A.adicionar(new Persona("Juan",37), 1);
       A.adicionar(new Persona("Tim",84), 1);
       A.adicionar(new Persona("Jose",14), 1);
       A.adicionar(new Persona("Guillermo",38), 2);
       A.adicionar(new Persona("Abigail",45), 2);
       A.adicionar(new Persona("Rodri",16), 3);
       A.adicionar(new Persona("Fernando",74), 3);
       A.adicionar(new Persona("Johny",5), 3);
       A.adicionar(new Persona("Oscar",64), 4);
       A.adicionar(new Persona("Ruth",15), 4);
       A.adicionar(new Persona("Ana",11), 4);
       A.setN(4);
       A.mostrar();
       System.out.println("**********************************************************************");
       //2 llevar al ultimo de cada pila a una nueva pila en la multipila
       llevar(A);
       A.mostrar();
       System.out.println("**********************************************************************");
        //3 llevar el primero al ultimo de siguiente de cada pila
        llevar2(A);
        A.mostrar();
        System.out.println("**********************************************************************");
    }
    public static void llevar(MultiPilaPe a){
    for(int i=1;i<=a.getN();i++){
    a.adicionar(a.eliminar(i), a.getN()+1);
    }
    a.setN(a.getN()+1);
    }
    public static void llevar2(MultiPilaPe a){
    PilaPe aux=new PilaPe();
    for(int i=1;i<=a.getN();i++){
        while(!a.esvacia(i)){
        aux.adicionar(a.eliminar(i));
        }
        if(i==a.getN()){
        a.adicionar(aux.eliminar(), 1);
        }else{
        a.adicionar(aux.eliminar(), i+1);
        }
        a.vaciar(aux, i);
    }}
    
}
