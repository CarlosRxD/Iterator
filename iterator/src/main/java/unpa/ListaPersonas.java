package unpa;

import java.util.*;

// *Paso 3: Implementa la clase de 
// *colección concreta (Lista de Personas)
public class ListaPersonas<T> implements IterableCollection<T> {
    // Lista para almacenar objetos Persona
    private List<T> personas;

    public ListaPersonas() {
        personas = new ArrayList<>();
    }
    // Método para agregar una persona a la lista
    public void agregarPersona(T elemento) {
        personas.add(elemento);
    }

    // *Paso 4: atajo para crear iteradores personalizados
    @Override
    public Iterador<T> crearIterador() {
        return new ListaPersonasIterador<T>(personas);
    }
}
