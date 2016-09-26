/**
 * Clase Asociation, se tomo como referncia la clase de la pagina
 * https://github.com/sliuu/post_script/blob/master/structure5/Association.java
 */

import java.io.*;


public class Association<K,V> {
	protected K english;
	protected V spanish;
	//Metodos 
	public Association()
	// post: constructor that generates an empty node
	{
		english = null;
		spanish = null;
	}
	public Association(K english,  V spanish,Association<K,V> words){
		this.english= english;
		this.spanish=spanish;
              
		}
	//Metodos Sets
	public void setEnglish(K word){
		english=word;
	}
	public void setSpanish(V word){	
		spanish=word;
	}
	public K getEnglish(){	
		return english;
	}
	public V getSpanish(){	
		return spanish;
	}
    
    public String leerArchivo (String direccion) {
		String res = "";
		String temp = "";
		try {
			FileReader f = new FileReader(direccion);
			BufferedReader b = new BufferedReader(f);
			try {
				while ((temp = b.readLine()) != null) {
					res += temp + "-";
				}
				b.close();
			} catch (IOException e) {
				return "";
			}
		} catch (FileNotFoundException e) {
			return "";
		}
		return res;
	}
    

}
   