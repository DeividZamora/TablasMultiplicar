package si;

import java.io.FileWriter;

public class Tablas 
{	
	public void ImprTablas(int num)
	{
	 try {
		 FileWriter archivo_out = new FileWriter("C:\\Users\\johan\\OneDrive\\Escritorio\\pruebas\\tablas.txt");
		 archivo_out.append("Tablas de multiplicar del "+ num + '\n');
		 for(int i=0;i<=20;i++)
		{
			int r = num*i;
			System.out.println(r);
			archivo_out.append(num + " X " + i + " = "+r + '\n' );
		}
		archivo_out.close();
	    }
	    catch (Exception e)
		{
	    	System.out.println("Error: "+e.getMessage());
		}	
		}
	}


