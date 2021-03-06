/**
 * Clase BinaryTree, se tomo como ejemplo para su realizacion
 * la clase del libro Java Structures, capitulo 12.4.1 
 * 
 **/


/** 
* Clase: BinaryTree.java
* @author Diego Soler, Jose Molina, Brandon Hernandez
* @version 26/09/16
*/
public class BinaryTree<E>{

	private Node raiz;
    private String arbol;
    private String tempWord;
    protected E val;
    protected BinaryTree<E> parent,left,right;


	public BinaryTree() {
		// Se genera un nodo vacio.
		
		val = null;
		parent = null;
		left=right=this;
	}
	
	public BinaryTree(E valor) {
		// TODO Auto-generated constructor stub
		
		val = valor;
		right=left= new BinaryTree<E>();
		setLeft(left);
		setRight(right);
		
	}

	public BinaryTree(E valor, BinaryTree<E> left, BinaryTree<E> right) {
		// TODO Auto-generated constructor stub
		val=valor;
		if(left==null){
			left = new BinaryTree<E>();
		}
		
		setLeft(left);
		
		if(right == null){
			right = new BinaryTree<E>();
		}
		
		setRight(right);
		
	}
	
	public BinaryTree<E> left(){
		
		return left;
		
	}
	
	public BinaryTree<E> parent(){
		
		return parent;
	}
	
	public BinaryTree<E> right(){
		
		return right;
		
	}
	
	public void setLeft(BinaryTree<E> newLeft){
		
		if(isEmpty()){
			return;
		}
		if (left != null && left.parent() == this){
			left.setParent(null);
			left = newLeft;
			left.setParent(this);
		}
	}
	
	public void setRight(BinaryTree<E> newRight){
		
		if(isEmpty()){
			return;
		}
		if (right != null && right.parent() == this){
			right.setParent(null);
			right = newRight;
			right.setParent(this);
		}
	}
	
	public void setParent(BinaryTree<E> newParent){
		if (!isEmpty()){
			parent=newParent;
		}
	}
	
	
	public E value(){
		return val;
		
	}
	public void setValue(E valor){
		val=valor;
	}

	public boolean isEmpty(){
		boolean empty=false;
		if(parent==null)
			empty=true;
		else
			return empty;
		return empty;
		
	}
	
	public String Search(String word){
        tempWord=word;
        Search2(raiz);  //Recursion para la busqueda
        return tempWord;   
       }
	
   public void Search2(Node nodo){

       if(nodo==null)return;
       Search2(nodo.left);
       if(nodo.data.getEnglish().equals(tempWord)){
           tempWord=nodo.data.getSpanish();
          
       } 
       if(nodo.data.getSpanish().equals(tempWord)){
       return;
       }
       Search2(nodo.right);
       
   }    
	
	 public  void insertNode(Association<String,String> insert){
	        if(raiz == null){
	            raiz = new Node(insert); //Se crea el nodo raiz
	            
	        }
	        else{
	            raiz.insertar(insert); //Llamada a insertar
	        }
	            
	    }
	 
    public  String recorridoinOrder()
    {
        inOrder(raiz); //Metodo recursivo
        return arbol;
        
    }
     
    private void inOrder(Node nodo)
    {
    	//Se recorre el arbol
        if(nodo == null)return;
        inOrder(nodo.left);
        arbol=arbol+"("+nodo.data.getEnglish()+", "+nodo.data.getSpanish()+")";
        inOrder(nodo.right);
        
    }

}
