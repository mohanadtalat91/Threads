import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Random rand = new Random() ; 
		int row, col ; 
		Scanner inp = new Scanner(System.in) ;
		
		System.out.println("Enter row : ");
		row = inp.nextInt() ;  
		System.out.println("Enter colume : ");
		col = inp.nextInt() ;
		
		inp.close();
		
		int [][] matrix1 = new int[row][col], matrix2 = new int[row][col] ;
		int [][] res = new int[row][col] ; 
		
		// Filing the two matrices with round value
		
		System.out.println("All elements of matrix #1");
		for( int i=0 ; i<row ; i++) {
			for( int q=0 ; q<col ; q++) {
				matrix1[i][q] = rand.nextInt(10) ;
				System.out.print(matrix1[i][q]);
			}
			System.out.println();
		}
		
		System.out.println("All elements of Matrix #2");
		for( int p=0 ; p<row ; p++) {
			for( int q=0 ; q<col ; q++) {
				matrix2[p][q] = rand.nextInt(10) ;
				System.out.print(matrix2[p][q]);
			}
			System.out.println() ; 
		}
		
		Vector<MyThread> threads = new Vector<>() ;
		
		for(int i=0 ; i<row ; i++) {
			MyThread t = new MyThread(col, i, matrix1, matrix2, res) ; 
			t.start(); 
			threads.add(t) ; 
		}
		
		boolean flag = false ; 
		
		while(!flag) {
			for( int i=0 ; i<threads.size() ; i++ ) {
				if(threads.get(i).isAlive()) {
					flag = true ; 
					break ; 
				}
			}
		}
		
		for( int i=0 ; i<row ; i++) {
			for(int j=0 ; j<col ; j++) {
				System.out.print(res[i][j]);
			}
			System.out.println();
		}

	}

}
