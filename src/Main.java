

//Autor Carlos Esteban Bello Salinas

public class Main {
    public static void main(String[] args) {
    
    Pila pila=new Pila();
    pila.apilar(new Nodo("Plato",5));
    pila.apilar(new Nodo("Plato",0));
    pila.apilar(new Nodo("Vaso",0));
    pila.imprimir();
    }    
}    