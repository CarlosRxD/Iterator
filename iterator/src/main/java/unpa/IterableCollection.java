package unpa;

// *Paso 2: Declara la interfaz de colección iterable
interface IterableCollection<T> {
    Iterador<T> crearIterador();
}