import java.util.Scanner;

class factorial{
	
	public static void main(String [] args){
		
		int num1=0, num2=0, fact1=1, fact2=1, suma=0, n1, n2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ SUMA DE 2 FACTORIALES ]");
		System.out.println(" *Solo valores positivos* \n");
		do {
			System.out.print("Ingrese el primer valor: ");
			num1=scan.nextInt();
			n1=num1;
			System.out.print("Ingrese el segundo valor: ");
			num2=scan.nextInt();
			n2=num2;
		} while(num1 < 0 || num2 < 0);
		System.out.println(num1);
		System.out.println(num2);
		
		if(num1!=0){
			while(num1 >=1){
				fact1*=num1;
				num1--;
			}
		}else{
			fact1=1;
		}
		
		if(num2!=0){
			while(num2 >=1){
				fact2*=num2;
				num2--;
			}
		}else{
			fact2=1;
		}
		suma=fact1+fact2;
		System.out.println("La suma de "+n1+"! + "+n2+"! = "+suma);

		
		
	}
}
	