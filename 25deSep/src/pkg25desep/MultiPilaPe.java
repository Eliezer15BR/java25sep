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
public class MultiPilaPe {
    private PilaPe v[]=new PilaPe[40];
    private int n;
    MultiPilaPe(){
    for(int i=1;i<40;i++){
    v[i]=new PilaPe();
    }
    }
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    boolean esvacia(int i){
    return v[i].esVacia();
    }
    boolean esllena(int i){
    return v[i].esLlena();
    }
    int nroelem(int i){
    return v[i].nroelem();
    }
    void adicionar(Persona elem, int i){
    v[i].adicionar(elem);
    }
    Persona eliminar(int i){
    return v[i].eliminar();
    }
    void mostrar(int i){
    v[i].mostrar();
    }
    void mostrar(){
    for(int i=1;i<=this.getN();i++){
        System.out.println("...Pila "+i+"....");
        v[i].mostrar();
    }
    }
    void vaciar(PilaPe Z,int i){
    v[i].vaciar(Z);
    }
    void vaciar(int i, int j){
    v[i].vaciar(v[j]);
    }
    
    
}
