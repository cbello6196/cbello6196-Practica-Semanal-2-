

//Autor Carlos Esteban Bello Salinas

public class Main {
    public static void main(String[] args) {
    
    Pila pila=new Pila();
    pila.apilar(new Plato("Plato",5));
    pila.apilar(new Plato("Plato",0));
    pila.apilar(new Plato("Vaso",0));
    pila.imprimir();
    
    }    
}    