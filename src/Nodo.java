

public class Nodo {
   private String info;
   private int cubiertos;
   private Nodo siguiente;
   
   public Nodo(String i, int c){
       info=i;
       cubiertos=c;
   }
   
   public Nodo(){}

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getCubiertos() {
        return cubiertos;
    }

    public void setCubiertos(int cubiertos) {
        this.cubiertos = cubiertos;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
   
    public String toString(){
        return info+" con "+cubiertos+" cubiertos";
    }
}