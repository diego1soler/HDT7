public class Node{
   
    Node left;
    Association<String,String> data =new Association<>();
    Node right;
     
    //Inicializacion
    public Node (Association datosNodo)
    {
        data = datosNodo;
        left = right = null; 
    }
     
    //Insertar nuevo nodo
    public  void insertar(Association<String,String> valorInsertar)
    {
        
        String word=valorInsertar.getEnglish();
        //Insertar en subarbol izquierdo
        if(word.compareTo(data.getEnglish())<0){
           
          
            if(left == null){
                
                left = new Node(valorInsertar);}
               
            else    
                left.insertar(valorInsertar);
        }
         
        //Nodo Derecho
        if(word.compareTo(data.getEnglish())>0){
            if(right == null){
             
                right = new Node(valorInsertar);
            }
            else
                right.insertar(valorInsertar);
        }
    }
    

}