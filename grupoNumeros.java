import java.util.Scanner;

class grupoNumeros{
	
	public static void main(String [] args){
		
		int num=0, mayor, menor;
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Ingrese un numero: ");
		num=scan.nextInt();
		mayor=num;
		menor=num;
	
	for(int i=2; i<7; i++){
			System.out.print("Ingrese un numero: ");
			num=scan.nextInt();
			if(num>mayor){
				mayor = num;
			}
			
			if(num<menor){
				menor = num;
			}	
	}
	System.out.println("El numero mayor es:"+mayor);
	System.out.print("El numero menor es:"+menor);
		
	}
	
}