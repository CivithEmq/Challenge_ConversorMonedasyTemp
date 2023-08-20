package pe.ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirDivisasASoles {
	
	// Los valores de conversión de las divisas son pertenecientes a la fecha del 21/08/2023 a las 12:00 horas
	
	public void ConvertirDolaresASoles(double divisas) {
		double numeroSoles = (double) Math.round(divisas*3.7100 *100)/100d;
		JOptionPane.showMessageDialog(null, "Usted tiene S/ " + numeroSoles + " soles peruanos");
	}	
	
	public void ConvertirEurosASoles(double divisas) {
		double numeroSoles = (double) Math.round(divisas*4.0407 *100)/100d;
		JOptionPane.showMessageDialog(null, "Usted tiene S/ " + numeroSoles + " soles peruanos");
	}	
	
	public void ConvertirLibrasASoles(double divisas) {
		double numeroSoles = (double) Math.round(divisas*4.7243 *100)/100d;
		JOptionPane.showMessageDialog(null, "Usted tiene S/ " + numeroSoles + " soles peruanos");
	}	
	
	public void ConvertirYenesASoles(double divisas) {
		double numeroSoles = (double) Math.round(divisas*0.0255 *100)/100d;
		JOptionPane.showMessageDialog(null, "Usted tiene S/ " + numeroSoles + " soles peruanos");
	}	
	
	public void ConvertirWonesASoles(double divisas) {
		double numeroSoles = (double) Math.round(divisas*0.0028 *100)/100d;
		JOptionPane.showMessageDialog(null, "Usted tiene S/ " + numeroSoles + " soles peruanos");
	}	
	
	public void ConvertirPesosASoles(double divisas) {
		double numeroSoles = (double) Math.round(divisas*0.2175 *100)/100d;
		JOptionPane.showMessageDialog(null, "Usted tiene S/ " + numeroSoles + " soles peruanos");
	}	
	
}
