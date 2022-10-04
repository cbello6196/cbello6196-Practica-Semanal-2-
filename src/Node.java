

public class Node {
    private Plato platos;
    private Vaso vasos;
    private Node siguiente;

    public Node(Plato platos, Vaso vasos, Node siguiente) {
        this.platos = platos;
        this.vasos = vasos;
        this.siguiente = siguiente;
    }

    public Plato getPlatos() {
        return platos;
    }

    public void setPlatos(Plato platos) {
        this.platos = platos;
    }

    public Vaso getVasos() {
        return vasos;
    }

    public void setVasos(Vaso vasos) {
        this.vasos = vasos;
    }

    public Node getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }
    

}
