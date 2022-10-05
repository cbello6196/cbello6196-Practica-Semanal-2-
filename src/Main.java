

//Autor Carlos Esteban Bello Salinas

public class Main {
    public static void main(String[] args) {
    
    Pila pila=new Pila();
    pila.push(new Plato("Plato",5));
    pila.push(new Plato("Plato",0));
    pila.push(new Plato("Vaso",0));
    pila.imprimir();
    
    }    
}    