package pe.ConversorMonedas;

import javax.swing.JOptionPane;

public class FunctionMonedas {
	
	ConvertirSolesADivisas divisas = new ConvertirSolesADivisas();
	ConvertirDivisasASoles monedas = new ConvertirDivisasASoles();
	
	public void ConvertirMonedas(double MonedaInput) {
		String opcion = (JOptionPane.showInputDialog(null, "Elija la moneda a la que desea convertir su dinero ", "Monedas",
						JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Soles a Dólares", "De Soles a Euros", "De Soles a Libras",
						"De Soles a Yenes", "De Soles a Wones", "De Soles a Pesos", "De Dólares a Soles", "De Euros a Soles",
						"De Libras a Soles", "De Yenes a Soles", "De Wones a Soles", "De Pesos a Soles"}, "Selección")).toString();
		switch (opcion) {
		case "De Soles a Dólares":
			divisas.ConvertirSolesADolares(MonedaInput);
			break;
		case "De Soles a Euros":
			divisas.ConvertirSolesAEuros(MonedaInput);
			break;
		case "De Soles a Libras":
			divisas.ConvertirSolesALibras(MonedaInput);
			break;
		case "De Soles a Yenes":
			divisas.ConvertirSolesAYenes(MonedaInput);
			break;
		case "De Soles a Wones":
			divisas.ConvertirSolesAWones(MonedaInput);
			break;
		case "De Soles a Pesos":
			divisas.ConvertirSolesAPesos(MonedaInput);
			break;
		case "De Dólares a Soles":
			monedas.ConvertirDolaresASoles(MonedaInput);
			break;
		case "De Euros a Soles":
			monedas.ConvertirEurosASoles(MonedaInput);
			break;
		case "De Libras a Soles":
			monedas.ConvertirLibrasASoles(MonedaInput);
			break;
		case "De Yenes a Soles":
			monedas.ConvertirYenesASoles(MonedaInput);
			break;
		case "De Wones a Soles":
			monedas.ConvertirWonesASoles(MonedaInput);
			break;
		case "De Pesos a Soles":
			monedas.ConvertirPesosASoles(MonedaInput);
			break;
		}
		
	}
}
