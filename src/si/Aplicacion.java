package si;
import java.util.Scanner;
public class Aplicacion {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
		
		Tablas prueba = new Tablas();
		
		System.out.println("Digite el numero");
		prueba.ImprTablas(leer.nextInt());
		
		leer.close();
	
	}

}
