import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ej1 {
	/*Crear un proyecto JAVA en Eclipse en el que se utilice una clase para:
1.	Lectura del fichero C:\xampp\htdocs\aadd\recursos\infoinstitutodam2.json utilizando las clases FileReader y BufferedReader. 
a.	Imprimir texto por consola
b.	Almacenar el texto del fichero en una variable tipo String e imprimir dicha variable
c.	Procesar el fichero haciendo uso de la librería para JSON GSON (carga de librerías en el proyecto Eclipse).
*/
	public static void main(String[] args) throws IOException {

		File archivo = null;
		archivo = new File ("C:\\xampp\\htdocs\\aadd\\recursos\\infoinstitutodam2.json");

		String info = obtener(archivo);

		}
		
		public static String obtener (File archivo) throws IOException {
			
			FileReader fr= null;
			BufferedReader br = null;
			
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);
			
			String linea;
			while((linea=br.readLine()) != null)
				System.out.println(linea);
			
		br.close();
		return linea;
	}
}
