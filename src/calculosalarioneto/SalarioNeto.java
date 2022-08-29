package calculosalarioneto;

import java.util.Scanner;

public class SalarioNeto {

	//Constantes
	final static double TASA_ANTIGUEDAD = 15.0;
	final static double TASA_INSS = 7.0;
	final static double TASA_INSS_PATRONAL = 22.5;
	final static double TASA_IR = 15.6;
	final static double TASA_SINDICATO = 1.0;
	//Scanner
	//static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		//Datos de entrada
		System.out.print("Ingrese su SALARIO BRUTO: C$");
		double salarioBruto = lector.nextDouble();
		System.out.print("Ingrese los años de antiguedad: ");
		int antiguedad = lector.nextInt();
		//Procesamiento
		//Cálculo de los ingresos
		double montoAntiguedad = salarioBruto * (TASA_ANTIGUEDAD/100);
		double ingresosTotales = salarioBruto + montoAntiguedad;
		//Cálculo de las deducciones
		double montoINSS = ingresosTotales * (TASA_INSS/100);
		double montoIR = ingresosTotales * (TASA_IR/100);
		double montoSindicato = salarioBruto * (TASA_SINDICATO/100);
		double deduccionesTotales = montoINSS + montoIR + montoSindicato;
		double ingresoNeto = ingresosTotales - deduccionesTotales;
		double montoINSSPatronal = ingresosTotales * (TASA_INSS_PATRONAL/100);
		//Datos de salida
		System.out.println("*-*-*-*-*-INGRESOS*-*-*-*-*-");
		System.out.println("Salario bruto: C$" + salarioBruto);
		System.out.println("Antiguedad: " + antiguedad + " años");
		System.out.println("Tasa de Antiguedad: " + TASA_ANTIGUEDAD + "%");
		System.out.println("Monto por Antiguedad: C$" + String.format("%.2f",montoAntiguedad));
		System.out.println("*-*-*-*-*-DEDUCCIONES*-*-*-*-*-");
		System.out.println("Tasa del INSS: " + TASA_INSS + "%");
		System.out.println("Monto por INSS: C$" + String.format("%.2f",montoINSS));
		System.out.println("Tasa del IR: " + TASA_IR + "%");
		System.out.println("Monto por IR: C$" + String.format("%.2f",montoIR));
		System.out.println("Tasa de Afiliación del Sindicato: " + TASA_SINDICATO + "%");
		System.out.println("Monto por Afiliación del sindicato: C$" + String.format("%.2f",montoSindicato));
		System.out.println("*-*-*-*-*-CÁLCULOS FINALES*-*-*-*-*-");
		System.out.println("Ingresos Totales: C$" + String.format("%.2f",ingresosTotales));
		System.out.println("Deducciones Totales: C$" + String.format("%.2f",deduccionesTotales));
		System.out.println("Ingreso Neto: C$" + String.format("%.2f",ingresoNeto));
		System.out.println("*-*-*-*-*-OBLIGACIONES DEL EMPLEADOR*-*-*-*-*-");
		System.out.println("Tasa del INSS Patronal: " + TASA_INSS_PATRONAL + "%");
		System.out.println("Monto por INSS Patronal: C$" + String.format("%.2f",montoINSSPatronal));
		
		lector.close();
	}

}
