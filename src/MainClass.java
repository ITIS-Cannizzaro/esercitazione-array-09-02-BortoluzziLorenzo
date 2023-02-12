
import java.util.Scanner;

public class MainClass
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
			case 1:
				es1();
				break;
			case 2:
				es2();
				break;
			case 3:
				//Inserire metodo statico
				break;
			default:
				System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{

		System.out.println("1 - Es n. * - Titolo es. *");
		System.out.println("2 - Es n. * - Titolo es. *");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	static void es1() 
	{

		int[]array1 = new int[5];
		int []array2 = new int [5];
		int []array3 = new int[10];

		for (int i=0; i<5; i++) 
			array1[i]= (int)(Math.random() * 20);

		for (int j =0; j<5; j++) 
			array2[j]= (int)(Math.random()*20);


		for (int k=0; k<5; k++)
			array3[k]= array1[k];
		for (int k=0; k<5; k++)
			array3[k+5]= array2[k];

		stampa (array1);
		stampa (array2);

		stampa (array3);



		int temp;
		for(int i=0; i<9; i++) 
		{
			for (int j=i+1; j< 10;j++)
				if(array3[i]>array3[j]) 
				{
					temp = array3[i];
					array3[i] = array3[j];
					array3[j] = temp;     
				} 



		}
		System.out.println("array ordinato:");

		stampa (array3);
	}

	public static void es2() {
		int contatore=0;
		int []array = new int[10];

		for (int i=0; i<10; i++) 
		{
			array[i]= (int)(Math.random() * 21) -10;
			if(array[i]>=0) 
			{
				contatore++;	
			}
		}

		stampa(array);


		int j=0;
		int []array_1 = new int[contatore];
		for(int i=0; i<10; i++) 
		{
			if (array[i]>=0) {
			array_1[j]= array[i];
			j++;
			}
		}
		stampa_inv(array_1);
	}

	public static void stampa (int []array) 
	{
		int n= array.length;
		for(int i = 0; i<n ; i++) 
		{
			System.out.print(array[i] +" ");
		}
		System.out.println("\n ");
	}
	public static void stampa_inv (int []array) 
	{
		int n= array.length;
		for(int i = n-1; i>=0; i--) 
		{
			System.out.print(array[i] +" ");
		}
		System.out.println("\n ");
	}
}
