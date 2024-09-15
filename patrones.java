class patrones{

	public static void main(String [] args){	
		//filas
			for(int i=1;i<=5;i++){
				//columnas
				for(int j=1;j<=5;j++){
					System.out.print("  *");
				}//fin for j
				System.out.println(" ");
			}//fin for i
			
			System.out.println("\n");
			for (int i = 1; i <= 5; i++) { // Filas
				for (int j = 1; j <= 5; j++) { // Columnas
					if (j >= i) {
						System.out.print(" * ");
					} else {
						System.out.print("   ");
					}
				}
				System.out.println();
			
		}
	}
}

	