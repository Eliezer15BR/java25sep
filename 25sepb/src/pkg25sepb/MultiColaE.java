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
public class MultiColaE {
     private CCircularE v[]=new CCircularE[40];
    private int n;
    MultiColaE(){
    for(int i=1;i<40;i++){
    v[i]=new CCircularE();
    }
    }
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    boolean esvacia(int i){
    return v[i].esvacia();
    }
    boolean esllena(int i){
    return v[i].esllena();
    }
    int nroelem(int i){
    return v[i].nroelem();
    }
    void adicionar(Estudiante elem, int i){
    v[i].adicionar(elem);
    }
    Estudiante eliminar(int i){
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
    void vaciar(CCircularE Z,int i){
    v[i].vaciar(Z);
    }
    void vaciar(int i, int j){
    v[i].vaciar(v[j]);
    }
}
