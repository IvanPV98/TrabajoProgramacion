package Tarea_Colecciones;
import java.util.ArrayList;
import java.util.List;

public class PilaOrdenada<T extends Comparable<T>> {
    private List<T> pila;

    public PilaOrdenada() {
        pila = new ArrayList<>();
    }

    public void push(T objeto) {
        int posicion = pila.size();
        for (int i = 0; i < pila.size(); i++) {
            if (objeto.compareTo(pila.get(i)) > 0) {
                posicion = i;
                break;
            }
        }
        pila.add(posicion, objeto);
    }

    public T pop() {
        if (pila.isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return pila.remove(pila.size() - 1);
    }

    public T peek() {
        if (pila.isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return pila.get(pila.size() - 1);
    }

    public boolean isEmpty() {
        return pila.isEmpty();
    }
}

public class PilaOrdenada<T extends Comparable<T>> {
    private List<T> pila;

    public PilaOrdenada() {
        pila = new ArrayList<>();
    }

    public void meter(T objeto) {
        if (pila.isEmpty() || objeto.compareTo(pila.get(pila.size() - 1)) < 0) {
            pila.add(objeto);
        }
    }

    public T sacar() {
        if (pila.isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return pila.remove(pila.size() - 1);
    }

    public T cima() {
        if (pila.isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return pila.get(pila.size() - 1);
    }

    public boolean isEmpty() {
        return pila.isEmpty();
    }
}