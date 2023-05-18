/**
 * @author José Manuel Pérez 
 */

import javax.swing.JOptionPane;

public class TecladoGrafico {
	
	/**
	 * Esté método muestra una ventana gráfica con el texto recibido como
	 * parámetro y pide un número entero por teclado. 
	 * @param texto  - Este texto será mostrado en la ventana gráfica
	 * @return    Devolverá el número entero leído de teclado
	 * @throws No lanza ninguna excepción
	 */
	public int leerInt(String texto){
		int num=0;
		  num=Integer.parseInt(JOptionPane.showInputDialog(texto));
		return num;
	}
	double leerDouble(String texto){
		double num=Double.parseDouble(JOptionPane.showInputDialog(texto));
		return num;
	}
	String leerString(String texto){
		String t=JOptionPane.showInputDialog(texto);
		return t;
	}
	void mostrarMsg(String texto){
		JOptionPane.showMessageDialog(null,texto);
	}
	int botonSeleccion(String opciones[]){
		Object botones[]= new Object[opciones.length];
		for (int i=0; i<opciones.length; i++)
			botones[i]=opciones[i];
		int opc = JOptionPane.showOptionDialog(
				   null,  //componente padre
 				   "Seleccione opcion",  //mensaje
				   "Selector de opciones", //titulo de la ventana
				   JOptionPane.DEFAULT_OPTION,
				   JOptionPane.PLAIN_MESSAGE,
				   null,    // null para icono por defecto.
				   botones,   // null para YES, NO y CANCEL
				   botones[0]);  //opción por defecto
				 
		return opc;
	}
	int menuSeleccion(String opciones[]){
		Object opcionesObj[]= new Object[opciones.length];
		for (int i=0; i<opciones.length; i++)
			opcionesObj[i]=opciones[i];
		Object opc = JOptionPane.showInputDialog(
				   null,
				   "Seleccione opcion",
				   "Selector de opciones",
				   JOptionPane.PLAIN_MESSAGE,
				   null,  // null para icono defecto
				   opcionesObj,
				   opcionesObj[0]);
				 
			//System.out.println("El usuario ha elegido "+opc);
	     int i=0;
		 while (opc!= opcionesObj[i]) i++;
		
		 return i;
	}
	public static void main (String a[]){
		TecladoGrafico t= new TecladoGrafico();
		int n= t.leerInt("Dar número");
		System.out.println("Número leído:"+ n);
		double d= t.leerDouble("Dar número real");
		System.out.println("Número leído:"+ d);
		String s= t.leerString("Dar String");
		System.out.println("String leído:"+ s);
		t.mostrarMsg("Se acabo \n fin");
		
		String msgs[]={"cero","uno", "dos", "tres"};
		n=t.botonSeleccion(msgs);
		System.out.println("Opción elegida:"+n);
		
		String msgs2[]={"opc00","opc01", "opc02"};
		n=t.menuSeleccion(msgs2);
		System.out.println("Opción elegida:"+n);
		
	}

}
