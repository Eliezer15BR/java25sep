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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MultiColaE W=new MultiColaE();
        W.adicionar(new Estudiante("Mery",48),1);
        W.adicionar(new Estudiante("Jery",44),1);
        W.adicionar(new Estudiante("Juan",46),1);
        W.adicionar(new Estudiante("Odi",48),2);
        W.adicionar(new Estudiante("Abdiel",12),2);
        W.adicionar(new Estudiante("Omar",54),2);
        W.adicionar(new Estudiante("Erick",49),3);
        W.adicionar(new Estudiante("Yayo",60),3);
        W.adicionar(new Estudiante("Elias",70),3);
        W.adicionar(new Estudiante("Pedro",78),4);
        W.adicionar(new Estudiante("Waldo",28),4);
        W.adicionar(new Estudiante("Bony",38),4);
        W.setN(4);
        W.mostrar();
        System.out.println("***********************");
        mayor(W);
        
    }
    public static void mayor(MultiColaE a){
        CCircularE aux=new CCircularE();
        int may=0;
        for(int i=1;i<=a.getN();i++){
        while(!a.esvacia(i)){
        Estudiante c=a.eliminar(i);
        if(c.getNota()>may){
        may=c.getNota();
        }
        aux.adicionar(c);
        }
        a.vaciar(aux, i);
        }
        for(int i=1;i<=a.getN();i++){
        while(!a.esvacia(i)){
        Estudiante c=a.eliminar(i);
        if(c.getNota()==may){
        c.mostrar();}
        aux.adicionar(c);
        }
        a.vaciar(aux, i);
        }
        
    }
    
}
