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
public class PilaPe {
    private int max=20;
    private Persona v[]=new Persona[max+1];
    private int tope=0;
     public void pila(){
        tope=0;
    }
    public boolean esVacia()
    {
        if(tope==0)
            return true;
        return false;  
    }
    public boolean esLlena(){
        if(tope==max)
            return true;
        return false;
    }
    public int nroelem(){
    return tope;
    }
    public void adicionar(Persona e){
        if(esLlena())
           System.out.println("pila llena!");
        else{
            tope=tope+1;
            v[tope]=e;
        }
    }
    public Persona eliminar(){
        Persona e=null;
        if(esVacia()){
            System.out.println("pila VACIA!");}
        else{
        e=v[tope];
        tope=tope-1;
    }
    return e;
  }
    public void vaciar(PilaPe aux){
        while(!aux.esVacia())
            adicionar(aux.eliminar());
    }
    
    public void mostrar(){
        PilaPe aux=new PilaPe();
        while(!esVacia()){
            Persona e;
            e=eliminar();
            e.mostrar();
            aux.adicionar(e);
            
        }
        this.vaciar(aux);
    }
}
