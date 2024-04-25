package unpa;

import java.util.*;

public class ArbolBinarioIterador<T> implements Iterador<T> {
    private Deque<NodoArbol<T>> pila;

    public ArbolBinarioIterador(NodoArbol<T> raiz) {
        pila = new ArrayDeque<>();
        if (raiz != null) {
            pila.push(raiz);
        }
    }

    @Override
    public boolean tieneSiguiente() {
        return !pila.isEmpty();
    }

    @Override
    public T siguiente() {
        if (!tieneSiguiente()) {
            throw new IllegalStateException("No hay más elementos");
        }
        NodoArbol<T> nodo = pila.pop();
        if (nodo.getDerecha() != null) {
            pila.push(nodo.getDerecha());
        }
        if (nodo.getIzquierda() != null) {
            pila.push(nodo.getIzquierda());
        }
        return nodo.getDato();
    }
}