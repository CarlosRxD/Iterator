package unpa;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
         * // *Lista
         * ListaPersonas<Persona> lista = new ListaPersonas<>();
         * Iterador<Persona> iterador;
         * 
         * lista.agregarPersona(new Persona("Juan", 25, "Masculino"));
         * lista.agregarPersona(new Persona("María", 30, "Femenino"));
         * lista.agregarPersona(new Persona("Maritza", 21, "Femenino"));
         * 
         * iterador = lista.crearIterador();
         * while (iterador.tieneSiguiente()) {
         * Persona dato = (Persona) iterador.siguiente();
         * dato.imprimirPersona();
         * System.out.println();
         * }
         * 
         */
        //* Árbol binario 
        Iterador<Integer> iterador2;
        NodoArbol<Integer> raiz = new NodoArbol<>(1);
        raiz.setIzquierda(new NodoArbol<>(2));
        raiz.setDerecha(new NodoArbol<>(3));
        raiz.getIzquierda().setIzquierda(new NodoArbol<>(4));
        raiz.getIzquierda().setDerecha(new NodoArbol<>(5));
        raiz.getDerecha().setIzquierda(new NodoArbol<>(6));
        raiz.getDerecha().setDerecha(new NodoArbol<>(7)); 

        // Crear el árbol binario
        ArbolBinario<Integer> arbolBinario = new ArbolBinario<>(raiz);

        // Obtener un iterador y recorrer el árbol
        iterador2 = arbolBinario.crearIterador();
        while (iterador2.tieneSiguiente()) {
            System.out.println(iterador2.siguiente());
        }

        /*
         * Iterator Java
         

        // * Lista
        List<String> list = Arrays.asList("Hola", "Cómo", "Estás");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        // * Pila
        Stack<String> stack = new Stack<>();
        stack.push("hola");
        stack.push("mundo");
        stack.push("cruel");
        Iterator<String> stackIterator = stack.iterator();
        while (stackIterator.hasNext()) {
            System.out.println(stackIterator.next());
        }
        */

    }
}