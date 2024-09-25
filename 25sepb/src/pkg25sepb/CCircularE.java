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
public class CCircularE {
 private int max=50;
 private Estudiante v[]=new Estudiante[max+1];
 private int ini,fin;
public
 CCircularE()
 {
 ini=fin=0;
 }
 boolean esvacia()
 {if (ini==0 && fin==0){
     return true;}
 return false;
 }
 boolean esllena()
 {
 if((ini==0 && fin==max) || (ini==fin && ini!=0)){
     return true;}
 return false;
 }
 int nroelem()
 { if (ini==0 && fin==0)
 return 0;
 if (fin>ini){
 return fin-ini;}
 return max-ini+fin; // con reutilizacion
 }


 void adicionar(Estudiante elem)
 {
 if(!esllena())
 {
 if (fin==max){
 fin=1;}
 else
 fin=fin+1;
 v[fin]=elem;
 }
 else
 System.out.println("cola llena");
 }
 Estudiante eliminar()
 { 
 Estudiante elem=new Estudiante();
 if (!esvacia())
 {
 ini=ini+1;
 elem=v[ini];
 if (ini==max)
 ini=0;
 if(ini==fin){ ini=fin=0;}
 }
 else{
 System.out.println("cola vacia");}
 return elem;
 }
 void mostrar()
{ CCircularE aux=new CCircularE();
 while (!esvacia())
 {
 Estudiante elem=eliminar();
 elem.mostrar();
 aux.adicionar(elem);
 }
 vaciar(aux);
 }

 void vaciar(CCircularE Z)
 {
 while (!Z.esvacia())
 adicionar( Z.eliminar());
 }
}
