public class ListaEnlazada {
    Nodo cabeza;

    public void agregar(int dato){
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null){
            cabeza = nuevo;
        }else {
            Nodo actual = cabeza;
            while (actual.siguiente !=null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }
    //este metodo ordela la lista usando el algoritmo burbuja
    public void ordenar() {
        if (cabeza == null) return;

        boolean intercambio;
        do {
        intercambio = false;
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.dato > actual.siguiente.dato){
                int temp = actual.dato;
                actual.dato = actual.siguiente.dato;
                actual.siguiente.dato = temp;
                intercambio = true;
            }
            actual = actual.siguiente;
        }
    } while (intercambio);
    }
    public void imprimir(){
        Nodo actual = cabeza;
        while (actual != null){
            System.out.println(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
