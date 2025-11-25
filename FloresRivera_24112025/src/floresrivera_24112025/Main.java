/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package floresrivera_24112025;

/*
Nancy Beatriz Flores Rivera - FR100524
*/

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         GrafoRecursivo Grafo = new GrafoRecursivo (4);
         Grafo.InsertarNodo('A'); // Índice 0
         Grafo.InsertarNodo('B'); // Índice 1
         Grafo.InsertarNodo('C'); // Índice 2
         Grafo.InsertarNodo('D'); // Índice 3
         
         Grafo.Conectar(0, 1); // Arista {A,B}
         Grafo.Conectar(0, 2); // Arista {A,C}
         Grafo.Conectar(1, 3); // Arista {B,D}
         Grafo.Conectar(2, 3); // Arista {C,D}
         
         System.out.println("Recorrido o Depth First Search (DFS) desde el nodo A:");
         
         Grafo.DFS(0);
         // Teóricamente el recorrido es:
         // Visita nodo A
         // Luego visita nodo B (Seria el primer adyacente de A)
         // Luego visita D (Seria el adyacente de B)
         // Luego retrocede (Vuelve a la raíz) y visita C (Seria el adyacente no visitado)
     }   
 }