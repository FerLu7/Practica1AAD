import java.io.FileWriter;
import java.io.IOException;

public class Ej2 {

	public static void main(String[] args) {

/*	2.	Crear un fichero (en el directorio recursos dentro del proyecto) info-alumnos.txt haciendo uso de las clases FileWriter y BufferedWriter y teniendo en cuenta
 *  que habr� que cargar, por c�digo:
		a.	Una primera l�nea con el texto NOMBRE, APELLIDOS, CURSO (la cabecera)
		b.	A�adir un m�todo a la clase que permita a�adir un nuevo registro en el que aparezca tu nombre y apellidos y DAM2 como curso. Ejemplo */

		FileWriter fw = null;
		
			try {
				fw = new FileWriter ("C:\\xampp\\htdocs\\aadd\\recursos\\info-alumnos.txt");
			
				fw.write("NOMBRE, APELLIDOS, CURSO"+"\n");
		
				escribeFichero(fw);
				
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}		
	}

	private static void escribeFichero (FileWriter fw) throws IOException {
		fw.write("Fer, Delgado, DAM2");		
	}
}