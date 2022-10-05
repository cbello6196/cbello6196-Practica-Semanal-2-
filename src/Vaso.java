
public class Vaso {
   private String info;
   private int cubiertos;
   private Vaso siguiente;
   
   public Vaso(String i, int c){
       info=i;
       cubiertos=c;
   }
   
   public Vaso(){}

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

    public Vaso getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Vaso siguiente) {
        this.siguiente = siguiente;
    }
   
    public String toString(){
        return info+" con "+cubiertos+" cubiertos";
    }
}

