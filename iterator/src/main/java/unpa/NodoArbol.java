package unpa;

// Clase para representar los nodos del árbol binario
public class NodoArbol<T> {
    private T dato;
    private NodoArbol<T> izquierda;
    private NodoArbol<T> derecha;

    public NodoArbol(T dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }

    public T getDato() {
        return dato;
    }

    public NodoArbol<T> getIzquierda() {
        return izquierda;
    }

    public NodoArbol<T> getDerecha() {
        return derecha;
    }

    public void setIzquierda(NodoArbol<T> izquierda) {
        this.izquierda = izquierda;
    }

    public void setDerecha(NodoArbol<T> derecha) {
        this.derecha = derecha;
    }
}
