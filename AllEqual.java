public class AllEqual{
	public static void main(String[] args) {
	

	int n1 = Integer.parseInt(args[0]);
	int n2 = Integer.parseInt(args[1]);
	int n3 = Integer.parseInt(args[2]);

	if (n1 == n2 && n1 == n3){
	System.out.println("All numbers are equal.");
	}
	else {
	System.out.println("All numbers are NOT equal.");
	}

	System.out.println("Number 1: " + n1);
	System.out.println("Number 2: " + n2);
	System.out.println("Number 3: " + n3);
	}
}
