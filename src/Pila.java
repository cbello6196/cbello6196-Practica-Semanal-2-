
public class Pila {
   private Nodo tope;
   
   public Pila(){
       tope=null;
   }
   
   public boolean estaVacia(){
       return tope==null;
   }
   
   public void push(Nodo n){
       if(estaVacia()){
           tope=n;
       }else{
           n.setSiguiente(tope);
           tope=n;
       }
   }
   
   public Nodo pol(){
       if(!estaVacia()){
           Nodo aux=tope;
           tope=tope.getSiguiente();
           aux.setSiguiente(null);
           return aux;
       }else{
           return null;
       }
   }
   
   public Nodo siguiente(){
       return tope;
   }
   
   public void imprimir(){
       Nodo aux=tope;
       while(aux!=null){
           System.out.println(aux);
           aux=aux.getSiguiente();
       }
   }
   
   public void sacar(){
       Nodo aux=tope;
       if(aux!=null && aux.getCubiertos()!=0){
           int cubiertos=aux.getCubiertos();
           aux.setCubiertos(0);
           if(tope.getSiguiente()!=null){
               tope.getSiguiente().setCubiertos(cubiertos+tope.getSiguiente().getCubiertos());
           }
       }
   }
}