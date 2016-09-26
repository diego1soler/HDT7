public class main {
	


	public static void main(String[] args){
	
		BinaryTree Tree = new BinaryTree();
		Association<String,String> [] classesTaken = new Association[5];
     	Association temp = new Association();
     	int count=0;
     	
	    String lecture = temp.leerArchivo("diccionario.txt");
	    for (String sp : lecture.split("-")) {
		String st[] = sp.split(",");
		classesTaken[count] = new Association<String, String>(st[0].substring(1), st[1].substring(1, st[1].length() - 1));
		Tree.insertNode(classesTaken[count]);
		count ++;
		
		
}
   
   
   for (int i = 0; i< classesTaken.length; i++){
       System.out.println("La palabra en ingles es " + classesTaken[i].getEnglish() +
                      " y en español es " + classesTaken[i].getSpanish()+ ".");
   }
  }
}
