/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package floresrivera_24112025;

/*
Nancy Beatriz Flores Rivera - FR100524
*/

public class GrafoRecursivo {
     Nodo [] Nodos;
     boolean [][] Adyacencia;
     boolean [] Visitado;
     
    public GrafoRecursivo (int Tamano){
         Nodos = new Nodo [Tamano];
         Adyacencia = new boolean [Tamano][Tamano];
         Visitado = new boolean [Tamano];
     }
    
    public void InsertarNodo (char Valor){
         for(int i = 0; i < Nodos.length; i ++){
             if(Nodos [i] == null){
                 Nodos [i] = new Nodo(Valor);
                 return;
             }
             else{
                 continue;
             }
         }
         System.out.println("No hay espacio para mas nodos.");
     }
    
    public void Conectar(int Origen, int Destino){
         Adyacencia [Origen][Destino] = true;
         Adyacencia[Destino][Origen] = true;
     }
    
    public void DFS(int Inicio){
         Recorrer(Inicio, 0);
     }
    
    public void Recorrer(int Actual, int Siguiente){
         if(!Visitado[Actual]){
             Visitado[Actual] = true;
             System.out.print(Nodos[Actual].Valor + " ");
         }
         if(Siguiente >= Nodos.length){
             return;
         }
         else{
             if(Adyacencia[Actual][Siguiente] && !Visitado[Siguiente]){
                 Recorrer(Siguiente, 0);
                 Recorrer(Actual, Siguiente + 1);
             }
             else{
                 Recorrer(Actual, Siguiente + 1);
             }
         }
     }
 }