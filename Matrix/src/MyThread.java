
public class MyThread extends Thread {
	
	int col, row ; 
	int[][] mat1, mat2, result ; 
	
	public MyThread( int col, int row, int[][] mat1, int[][] mat2, int[][] result ) {
		this.col = col ; 
		this.row = row ; 
		this.mat1 = mat1 ;
		this.mat2 = mat2 ; 
		this.result = result  ; 
	}
	
	public void run() {
		
		for( int j=0; j < col; j++ ) {
			result[row][j] = mat1[row][j] + mat2[row][j] ; 
			
			System.out.println("The running thread is a " + Thread.currentThread().getName());
		}
	}

}
