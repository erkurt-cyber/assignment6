package assignment6;

public class Question5 {

	public static void main(String[] args) {
		
		int i = 1;
		
		for (int row=1;row<=7;row++) {
			
			for (int col=6;col>=row;col--) {
				
				System.out.print(i);
				
			}
				for (int num=1;num<=row;num++) {
					
					System.out.print(row);	
		
				}
				
		System.out.println();
		
		}
		
	}

}
