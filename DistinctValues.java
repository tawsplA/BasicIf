public class DistinctValues{
	public static void main(String[] args) {
	
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);
	int contador = 0;
	
	if (a == b && b == c){
	contador = 1;
	}
	else{
		if (a != b){
		contador +=1;
		}
		if (a != c){
		contador +=1;
		}
		if (b !=c){
		contador +=1;
		}
	}

	System.out.println(contador + " numbers are distinct.");

	}
}
