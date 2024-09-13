import java.util.Scanner;

class areaTrapecio{
	
	public static void main(String [] args){
		
		double A, B, h, area;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ CALCULO DEL AREA DE UN TRAPECIO ]");
		System.out.print("Ingrese el valor de A: ");
		A = scan.nextDouble();
		System.out.print("Ingrese el valor de B: ");
		B = scan.nextDouble();
		System.out.print("Ingrese la altura del trapecio: ");
		h = scan.nextDouble();
		
		area=((A+B)/2)*h;
		
		System.out.println("El area es de: "+area);
	}
	
}