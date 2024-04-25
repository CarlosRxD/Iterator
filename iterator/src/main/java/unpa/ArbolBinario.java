package unpa;

// *Paso 3: Implementa la clase de colección concreta (Árbol binario)
class ArbolBinario<T> implements IterableCollection<T> {
    private NodoArbol<T> raiz;

    public ArbolBinario(NodoArbol<T> raiz) {
        this.raiz = raiz;
    }

    @Override
    public Iterador<T> crearIterador() {
        return new ArbolBinarioIterador<>(raiz);
    }
}