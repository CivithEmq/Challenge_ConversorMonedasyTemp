package pe.ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirSolesADivisas {
	
	// Los valores de conversión de las divisas son pertenecientes a la fecha del 21/08/2023 a las 12:00 horas
	
	public void ConvertirSolesADolares(double soles) {
		double numeroDolares = (double) Math.round(soles*0.2697 *100)/100d;
		JOptionPane.showMessageDialog(null, "Usted tiene $ " + numeroDolares + " dólares estadounidenses");
	}	
	
	public void ConvertirSolesAEuros(double soles) {
		double numeroEuros = (double) Math.round(soles*0.2476 *100) /100d;
		JOptionPane.showMessageDialog(null, "Usted tiene € " + numeroEuros + " euros");
	}	
	
	public void ConvertirSolesALibras(double soles) {
		double numeroLibras = (double) Math.round(soles*0.2118 *100) /100d;
		JOptionPane.showMessageDialog(null, "Usted tiene ₤ " + numeroLibras + " libras esterlinas");
	}	
	
	public void ConvertirSolesAYenes(double soles) {
		double numeroYenes = (double) Math.round(soles*39.2112 *100) /100d;
		JOptionPane.showMessageDialog(null, "Usted tiene ¥ " + numeroYenes + " yenes japoneses");
	}	
	
	public void ConvertirSolesAWones(double soles) {
		double numeroWones = (double) Math.round(soles*361.3749 *100) /100d;
		JOptionPane.showMessageDialog(null, "Usted tiene ₩ " + numeroWones + "wones surcoreanos");
	}	
	
	public void ConvertirSolesAPesos(double soles) {
		double numeroPesos = (double) Math.round(soles*4.5997 *100) /100d;
		JOptionPane.showMessageDialog(null, "Usted tiene " + numeroPesos + " pesos mexicanos");
	}	
}
