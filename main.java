
public class main {
	


	public static void main(String[] argv){

    Association [] classesTaken = new Association[5];
   classesTaken[0] = new Association("ESPANOL", new String("ENGLISH"));
   classesTaken[1] = new Association("ESPANOL1", new String("ENGLISH1"));
   classesTaken[2] = new Association("ESPANOL2", new String("ENGLISH2"));
   classesTaken[3] = new Association("ESPANOL3", new String("ENGLISH3"));
   classesTaken[4] = new Association("ESPANOL4", new String("ENGLISH4"));
 
       
   for (int i = 0; i< classesTaken.length; i++){
       System.out.println("La palabra en ingles es " + classesTaken[i].getValue() +
                      " y en espanol es " + classesTaken[i].getKey()+ ".");
   }
	}
  	}


