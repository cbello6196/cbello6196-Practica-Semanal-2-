

public class Pila {
   private Plato tope;
   
   public Pila(){
       tope=null;
   }
   
   public boolean estaVacia(){
       return tope==null;
   }
   
   public void apilar(Plato n){
       if(estaVacia()){
           tope=n;
       }else{
           n.setSiguiente(tope);
           tope=n;
       }
   }
   
   public Plato desapilar(){
       if(!estaVacia()){
           Plato aux=tope;
           tope=tope.getSiguiente();
           aux.setSiguiente(null);
           return aux;
       }else{
           return null;
       }
   }
   
   public Plato peek(){
       return tope;
   }
   
   public void imprimir(){
       Plato aux=tope;
       while(aux!=null){
           System.out.println(aux);
           aux=aux.getSiguiente();
       }
   }
}