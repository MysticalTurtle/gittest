package GUI;

/* Este programa muestra el nombre
 * de fuentes disponibles en el SO
**/
import java.awt.GraphicsEnvironment;
public class pruebaFuentes {
	public static void main(String args[]) {
		String [] nombreFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for (String n: nombreFuentes) {
			System.out.println(n);
		}
	}
}
