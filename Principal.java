import java.util.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vida, rp;
		boolean fl = false;
		vida = 0;
		Scanner sc = new Scanner(System.in);
		do {
			vida ++;
			System.out.println("Vida: "+ vida + "\t¿Cual es el numero secreto?");
			rp = sc.nextInt();
			if (rp == 1234)
				fl = true;
		}while(vida < 3 && !fl);
		if (fl == true)
			System.out.println("Adivinaste!!! ");
		
		else
			System.out.println("ups, perdiste...");
		
		System.out.println("Usted Gano un auto");
	}

}
