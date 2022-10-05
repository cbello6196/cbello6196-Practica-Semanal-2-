//Autor Carlos Esteban Bello Salinas

public class Main {
    public static void main(String[] args) {
    
    Pila pila=new Pila();
    pila.push(new Nodo("Plato",4));
    pila.push(new Nodo("Plato",1));
    pila.imprimir();
    pila.sacar();
    System.out.println("Despues de sacar los cubiertos");
    System.out.println("------------------------------");
    pila.imprimir();

    }    
}    