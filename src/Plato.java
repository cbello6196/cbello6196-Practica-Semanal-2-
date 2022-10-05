
public class Plato {
   private String info;
   private int cubiertos;
   private Plato siguiente;
   
   public Plato(String i, int c){
       info=i;
       cubiertos=c;
   }
   
   public Plato(){}

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

    public Plato getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Plato siguiente) {
        this.siguiente = siguiente;
    }
   
    public String toString(){
        return info+" con "+cubiertos+" cubiertos";
    }
}