import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Ej3 {

	public static void main(String[] args) throws IOException {
		
		File nuevo =new File("C:\\Users\\nando\\OneDrive\\Documentos\\Acceso a Datos\\escribir.txt");
		FileReader fr = new FileReader("C:\\xampp\\htdocs\\aadd\\recursos\\alumnos-dam2-nuevos.txt", Charset.forName("UTF-8"));
		BufferedReader br = new BufferedReader (fr);
		FileWriter fw = new FileWriter (nuevo);
		BufferedWriter bw = new BufferedWriter(fw);
		String linea;
		
		while ((linea=br.readLine())!=null)
		{
			String[] palabras = linea.split(",");
			if(!linea.contains("ID"))
			{
				if(palabras.length==3)
				{
					bw.append(palabras[1]+palabras[2]+ " DAM2" + "\n");
				}
				else
				{
					bw.append(palabras[1]+palabras[2]+palabras[3] + " DAM2"+ "\n");
				}
			}	
		}	
		br.close();
		bw.close();
	}
}