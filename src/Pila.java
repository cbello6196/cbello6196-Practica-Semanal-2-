

public class Pila {
   private Plato cima;
   
   public Pila(){
       cima=null;
   }
   
   public boolean estaVacia(){
       return cima==null;
   }
   
   public void push(Plato n){
       if(estaVacia()){
           cima=n;
       }else{
           n.setSiguiente(cima);
           cima=n;
       }
   }
   
   public Plato pool(){
       if(!estaVacia()){
           Plato aux=cima;
           cima=cima.getSiguiente();
           aux.setSiguiente(null);
           return aux;
       }else{
           return null;
       }
   }
   
   public Plato siguiente(){
       return cima;
   }
   
   public void imprimir(){
       Plato aux=cima;
       while(aux!=null){
           System.out.println(aux);
           aux=aux.getSiguiente();
       }
   }
}