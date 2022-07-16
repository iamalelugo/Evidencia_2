import java.util.Scanner;
public class Evidencia_2 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Ingrese el valor del radio: ");
		int radio = read.nextInt();
		
		System.out.println("Ingrese circunferencia");
		
		double ResultCircunferencia = CalcularCircunferencia(radio);
		double ResultArea = CalcularArea(radio);
		
		System.out.println("El valor de la circunferencia es " 
				+ ResultCircunferencia + " y el valor del area es " + ResultArea);
	}
	
	
	public static double CalcularCircunferencia(double radio) {
		
		double Result = 2 * Math.PI * radio;
		return Result;
	}
	
	public static double CalcularArea (double radio) {
		double Result = (Math.PI)*(Math.pow(radio, 2));
		return Result;
	}
	

}
