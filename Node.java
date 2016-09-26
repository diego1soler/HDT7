public class Node{
   
    Node left;
    Association<String,String> data =new Association<>();
    Node right;
     
    //iniciar dato y hacer de este nodo un nodo hoja
    public Node (Association datosNodo)
    {
        data = datosNodo;
        left = right = null; //el nodo no tiene hijos
    }
     
    //buscar punto de insercion e inserter nodo nuevo
    public  void insertar(Association<String,String> valorInsertar)
    {
        
        String word=valorInsertar.getEnglish();
        //insertar en subarbol izquierdo
        if(word.compareTo(data.getEnglish())<0){
            //insertar en subarbol izquierdo
          
            if(left == null){
                 //System.out.println("izquierda");
                left = new Node(valorInsertar);}
               
            else    //continua recorriendo subarbol izquierdo
                left.insertar(valorInsertar);
        }
         
        //insertar nodo derecho
        if(word.compareTo(data.getEnglish())>0){
            //insertar nuevo nodoArbol
            if(right == null){
                //System.out.println("derecha");
                right = new Node(valorInsertar);
            }
            else
                right.insertar(valorInsertar);
        }
    }// fin del metodo insertar
    

}