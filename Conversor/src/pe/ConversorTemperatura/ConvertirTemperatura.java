package pe.ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	public double ConvertirCelciusAFarenheit(double temperatura) {
    	double farenheit = (double) Math.round((temperatura * 1.8 + 32) *100d)/100;
        JOptionPane.showMessageDialog(null, +temperatura+ " grados Celcius son " +farenheit+ " grados Farenheit ");
		return farenheit;
	}
	
	public void ConvertirCelciusAKelvin(double temperatura){
        double kelvin = (double) Math.round((temperatura + 273.15) *100d)/100;
        JOptionPane.showMessageDialog(null, +temperatura+ " grados Celcius son " +kelvin+ " Kelvin");
	}
	
	public void ConvertirFarenheitACelcius(double temperatura) {
        double celcius = (double) Math.round(((temperatura - 32) / 1.8) *100d)/100;
        JOptionPane.showMessageDialog(null, +temperatura+ " grados Farenheit son " +celcius+ " Celcius");
	}
	
	public double ConvertirKelvinACelcius(double temperatura) {
		 double kelvinCelcius = (double) Math.round((temperatura - 273.15) *100d)/100;
         JOptionPane.showMessageDialog(null, +temperatura+ " Kelvin son " +kelvinCelcius+ " Celcius");
         return kelvinCelcius;
	}
	
	public void ConvertirKelvinAFarenheit(double temperatura) {
		double kelvinFarenheit = ConvertirKelvinACelcius(temperatura);
		kelvinFarenheit = ConvertirCelciusAFarenheit(kelvinFarenheit);
		kelvinFarenheit	= (double) Math.round(kelvinFarenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +temperatura+ " Kelvin son " +kelvinFarenheit+ " Celcius");
	}

}
