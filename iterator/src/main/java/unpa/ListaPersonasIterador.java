package unpa;

import java.util.*;

// *Paso 4: Implementa la interfaz de colección
public class ListaPersonasIterador<T> implements Iterador<T> {

    private List<T> personas;
    private int posicion;

    public ListaPersonasIterador(List<T> personas) {
        this.personas = personas;
        this.posicion = personas.size()-1;
    }

    @Override
    public T siguiente() {
        return personas.get(posicion--);
    }

    @Override
    public boolean tieneSiguiente() {
        return posicion >= 0;
    }
}
