package pe.ConversorTemperatura;

import javax.swing.JOptionPane;

public class FunctionTemperatura {
	
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
		
	public void ConvertirTemperatura(double TemperaturaInput) {
	    String opcion = (JOptionPane.showInputDialog(null, "Elija una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius","Kelvin a Grados Celcius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
	    switch(opcion) {
		   	case "Grados Celcius a Grados Farenheit":
		        temperatura.ConvertirCelciusAFarenheit(TemperaturaInput);
		        break;
		    case "Grados Celcius a Kelvin":
		        temperatura.ConvertirCelciusAKelvin(TemperaturaInput);
		        break;
		    case "Grados Farenheit a Grados Celcius":
		        temperatura.ConvertirFarenheitACelcius(TemperaturaInput);
		        break;
		    case "Kelvin a Grados Celcius":
		        temperatura.ConvertirKelvinACelcius(TemperaturaInput);
		        break;
		    case "Kelvin a Grados Farenheit":
		        temperatura.ConvertirKelvinAFarenheit(TemperaturaInput);
		        break;
		}
	}
}
