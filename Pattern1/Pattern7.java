package Pattern1;

public class Pattern7 {

	public static void main(String[] args) {
		System.out.println("Printing Pattern 7");
        int no=1;
        for (int i=1; i <=5; i++) 
        {
            for (int j=1; j<=i; j++) 
            {
                System.out.print(no+" ");
                no++;
            }
            System.out.println();
        }
	}

}
