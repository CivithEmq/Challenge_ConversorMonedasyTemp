package pe.ConversorInterfaz;

import javax.swing.JOptionPane;

import pe.ConversorMonedas.FunctionMonedas;
import pe.ConversorTemperatura.FunctionTemperatura;

public class ConversorPrincipal {
	public static void main(String[] args) {
		FunctionMonedas monedas = new FunctionMonedas();
		FunctionTemperatura temperatura = new FunctionTemperatura();

		while (true) {
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Conversor de Moneda", "Conversor de Temperatura" }, "Selection")).toString();

			switch (opciones) {
			case "Conversor de Moneda":
				String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desee convertir: ");
				if (ValidarNumero(input) == true) {
					double MonedaInput = Double.parseDouble(input);
					monedas.ConvertirMonedas(MonedaInput);

					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Seleccione opción Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido, asegúrese de ingresar un valor numérico");
				}
				break;

			case "Conversor de Temperatura":
				input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir: ");
				if (ValidarNumero(input) == true) {
					double TemperaturaInput = Double.parseDouble(input);
					temperatura.ConvertirTemperatura(TemperaturaInput);

					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Seleccione opción Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido, asegúrese de ingresar un valor numérico");
				}
				break;
			}
		}
	}

	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
