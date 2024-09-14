import java.util.Scanner;

class calculoPagar{
	
	public static void main(String [] args){
		int cant_prod=0, cant=0, i=1, totalProduc=0;
		double costo=0.0, desc=0.0, total=0.0, totalPagar=0.0; 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("********************************");
		System.out.println("*---------BIENVENIDOS----------*");
		System.out.println("********************************\n");
		
		do{
		System.out.println("Nota: Solo valores positivos");
		System.out.print("Cuantos productos va pagar? :");
		cant_prod=scan.nextInt();
	
		}while(cant_prod <=0);	
		cant_prod+=1;
		
		while(i < cant_prod){
							
			System.out.print("Cantidad del producto #"+i+": ");
			cant=scan.nextInt();
			totalProduc+=cant;
			
			System.out.print("Ingrese el costo del producto #"+i+": $");
			costo=scan.nextDouble();
			total+=(cant*costo);
			
			i++;
		}
		System.out.println(" ");
		if(total > 20 && total < 35){
			desc=total*0.05;
			totalPagar=total-desc;
			System.out.println("**************************** ");
			System.out.println("Total:         $"+total);
			System.out.println("Descuento 5%:  $"+desc);
			System.out.println("Total a pagar: $"+totalPagar+"\n");
		}else if(total > 36 && total < 50){
			desc=total*0.08;
			totalPagar=total-desc;
			System.out.println("**************************** ");
			System.out.println("Total:         $"+total);
			System.out.println("Descuento 8%:  $"+desc);
			System.out.println("Total a pagar: $"+totalPagar+"\n");
		}else if(total > 50){
			desc=total*0.10;
			totalPagar=total-desc;
			System.out.println("**************************** ");
			System.out.println("Total:         $"+total);
			System.out.println("Descuento 10%: $"+desc);
			System.out.println("Total a pagar: $"+totalPagar+"\n");
		}else{
			System.out.println("**************************** ");
			System.out.println("Total a pagar: $"+total+"\n");
		}

		System.out.println("*---------ADIOS, VUELVA PRONTO!----------*");
		
	}
}