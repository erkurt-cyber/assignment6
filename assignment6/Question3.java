package assignment6;

public class Question3 {

	public static void main(String[] args) {
		
		for (int row=1;row<=7;row++) {
			
			for (int space=2;space<=row;space++) {
				
				System.out.print(" ");
			}	
			
			for (int i=row;i<=7;i++) {
					
				System.out.print(i+" ");
				}
			
			System.out.println();								
		}
		
		for (int row=6;row>=1;row--) {
			
			for (int space=1;space<=(row-1);space++) {
				
				System.out.print(" ");
			}	
			
			for (int i=row;i<=7;i++) {
					
				System.out.print(i+" ");
				}
			
			System.out.println();								
		}

	}

}
