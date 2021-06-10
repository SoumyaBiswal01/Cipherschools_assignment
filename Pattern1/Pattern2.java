package Pattern1;

public class Pattern2 {

	public static void main(String[] args) {
        System.out.println("Printing Pattern 2");
        for (int i=1; i<=4; i++) 
        {  
            for (int j=4; j>=i; j--)
            {
                System.out.print("*");
            }  
            System.out.println();
        }

	}
}
