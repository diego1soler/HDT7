import java.util.ArrayList;
import java.util.List;

/** 
* Clase: Main.java
* @author Diego Soler, Jose Molina, Brandon Hernandez
* @version 26/09/16
*/

public class main {
	


	public static void main(String[] args){
	
		//Se crea el arbol y arrays de la clase Association
		BinaryTree Tree = new BinaryTree();
		Association<String,String> [] classesTaken = new Association[10];
     	Association temp = new Association();
     	int count=0;
     	
     	//Se lee el diccionario y se ingresa al arbol
	    String lecture = temp.leerArchivo("diccionario.txt");
	    for (String sp : lecture.split("-")) {
		String st[] = sp.split(",");
		classesTaken[count] = new Association<String, String>(st[0].substring(1), st[1].substring(1, st[1].length()-1));
		Tree.insertNode(classesTaken[count]);
		count ++;	
        }
   
	    //Se recorre el arbol
	    Tree.recorridoinOrder();
	    
	    String texto1=temp.leerArchivo("texto.txt");
	    String texto=texto1.substring(0, texto1.length()-1);
	    System.out.println("El texto a traducir es: \n"+texto);
	    
	    
	    
	    int inicio = 0;
        int num=0;
        List<String> Texto = new ArrayList<>();
             for(int i = 0; i <texto.length(); i++){
                    if(Character.toString(texto.charAt(i)).equals(" ")){
                        Texto.add(texto.substring(inicio, i));
                        inicio = i;
                        num++;
                        
                    }
                 }
        

        String resultado="";
             for(int n = 0; n<num; n++){
                        String word1 = Tree.Search(Texto.get(n).replace(" ",""));
                        String word2 = Texto.get(n).replace(" ","");
                        
                        if(word1.equals(word2)){
                            resultado=resultado+" "+Texto.get(n).replace(" ","")+" ";
                            
                        }
                        else{
                    
                        resultado=resultado+Tree.Search(Texto.get(n).replace(" ",""));
                 
                        }
                 }
             
             System.out.println("Texto traducido: \n"+resultado);
   
  /* for (int i = 0; i< classesTaken.length; i++){
       System.out.println("La palabra en ingles es " + classesTaken[i].getEnglish() +
                      " y en español es " + classesTaken[i].getSpanish()+ ".");
   }*/
	}
}
