package Artistic_Pattern;

public class Artistic_Pattern {
	static void printPatternTopBottom(int size) {
		System.out.print("+");
		for(int i=0; i<2*size; i++) {
			System.out.print("-");
		}
		System.out.print("+");
	}
	
	static void printUpperHalf(int size) {
		for(int row=0; row<size-1; row++){
			System.out.print("|");
			for(int i=0; i<size-row-1; i++) {
				System.out.print(" ");
			}
			
			System.out.print("/");
			for(int i=0; i<2*row; i++) {
				if(row%2==0)
					System.out.print("=");
				else
					System.out.print("-");
			}
			
			System.out.print("\\");
			for(int i=0; i<size-row-1; i++) {
				System.out.print(" ");
			}
			
			System.out.println("|");
		}
	}
	
	static void printmiddleline(int size) {
		System.out.print("|");	//Printing Pipeline Operator
		System.out.print("<");
		
		for(int i=0; i<2*size - 2; i++) {
			if(size%2 == 0)
				System.out.print("-");
			else
				System.out.print("=");
		}
			
		System.out.print(">");
		System.out.println("|");
	}
	
	static void printlowerhalf(int size) {
		for(int row=size-2; row>=0; row--) {
			System.out.print("|");
			for(int i=0; i<size-row-1;i++) {
				System.out.print(" ");
			}
			System.out.print("\\");
			
			for(int i=0; i<2*row;i++) {
				if(row%2==0)
					System.out.print("=");
				else
					System.out.print("-");
			}
		
			System.out.print("/");
			
			for(int i=0; i<size-row-1;i++) {
				System.out.print(" ");
			}
			System.out.println("|");
			}
		
}
	static void printPattern(int size) {
		printPatternTopBottom(size);
		System.out.println();
		printUpperHalf(size);
		printmiddleline(size);
		printlowerhalf(size);
		printPatternTopBottom(size);
		System.out.println();
	}

	public static void main(String[] args) {
		//printPattern(2);
		//printPattern(4);
		printPattern(7);
	}

}
