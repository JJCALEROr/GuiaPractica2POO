import java.util.Scanner;

class grupoNumeros{
	
	public static void main(String [] args){
		
		int num=0, mayor=0, menor=0;
		Scanner scan = new Scanner(System.in);
	
	for(int i=1; i<7; i++){
			System.out.print("Ingrese un numero: ");
			num=scan.nextInt();

			if(num>mayor){
				mayor = num;
			}else{
				menor = num;
			}	
	}
	System.out.println("El numero mayor es:"+mayor);
	System.out.print("El numero menor es:"+menor);
		
	}
	
}