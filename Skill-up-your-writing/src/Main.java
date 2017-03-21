import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		      byte buffer[] = new byte[80];  // Zeichenpuffer
		      String input = "";
		      int read;
		     
		          // Einlesen der Zeichen
		          read = System.in.read(buffer, 0, 80);
		          // Umwandeln des Pufferinhaltes in einen String
		          input = new String(buffer, 0, read);
		          // Ausgabe der eingelesenen Zeichen
		          System.out.print("I didn't get you!");
		       
		
	}

}
