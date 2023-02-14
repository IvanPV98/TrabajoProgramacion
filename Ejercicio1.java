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
	}
