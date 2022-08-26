public static void main(String[] args) {

	int N;
	Scanner tec = new Scanner (System.in);
	
	System.out.print("Digite um número maior do que zero: ");
	N = tec.nextInt();
		if (N <= 0){
			do {
				System.out.print("Digite um número válido: ");
				N = tec.nextInt();
			} while (N <= 0);
		}
		if ((N = 1) || (N = 2)){
			System.out.print("O número é primo");
		}
		
		if (primo = true){
			System.out.print("O número é primo");
		}
		if (primo = false){
			System.out.print("O número NÃO é primo");
		}
	}


public static boolean primo (int x){
	int y, aux;
	aux = (int) (x/2);
	
	for (y=2;y=aux;y++){
		if (x % y == 0){
			return true;
			break;
		}
	}
	return false;
}
