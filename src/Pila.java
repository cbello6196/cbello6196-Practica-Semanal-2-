

public class Pila {
   private Nodo cima;
   
   public Pila(){
       cima=null;
   }
   
   public boolean estaVacia(){
       return cima==null;
   }
   
   public void apilar(Nodo n){
       if(estaVacia()){
           cima=n;
       }else{
           n.setSiguiente(cima);
           cima=n;
       }
   }
   
   public Nodo desapilar(){
       if(!estaVacia()){
           Nodo aux=cima;
           cima=cima.getSiguiente();
           aux.setSiguiente(null);
           return aux;
       }else{
           return null;
       }
   }
   
   public Nodo siguiente(){
       return cima;
   }
   
   public void imprimir(){
       Nodo aux=cima;
       while(aux!=null){
           System.out.println(aux);
           aux=aux.getSiguiente();
       }
   }
}