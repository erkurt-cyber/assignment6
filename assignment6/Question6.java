package assignment6;

public class Question6 {

	public static void main(String[] args) {
		
		for (int row=1;row<=5;row++) {
			
			int i=row;
			
			for (int col=1;col<=row;col++) {
				System.out.print(i+" ");
				
				i=i+5-col;
			}
		
		
			System.out.println();
		}
		

	}

}
