package algorithm;

public class TurnRight {
	public static void main(String[] args) {
		int size=4;
		int numA1[][] = new int[size][size];
		int numA2[][] = new int[size][size];
		int insu=1;
		
		
		for(int i=0; i<size; i++){
			for(int j=0; j<size;j++){
				numA1[i][j] = insu;
				insu++;
			}
		}
		
		for(int i=0; i<size; i++){
			for(int j=0; j<size;j++){
				numA2[(size-1)-j][i] = numA1[i][j]; 
			}
		}
		
		for(int i=0; i<size; i++){
			for(int j=0; j<size;j++){
				System.out.print(numA1[i][j]);
			}System.out.println();
		}
		
		System.out.println();System.out.println();
		
		for(int i=0; i<size; i++){
			for(int j=0; j<size;j++){
				System.out.print(numA2[i][j]);
			}System.out.println();
		}
		
		
	}
}
