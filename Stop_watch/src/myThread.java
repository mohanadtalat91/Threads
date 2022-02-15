
public class myThread extends Thread {
	
	public void run() {
		int hours = 0 ; 
		int mins = 0 ; 
		int secs = 0 ;
		
		while(true){
			try {
				Thread.sleep(1000);
				secs += 1 ; 
				
				if(secs == 60) {
					mins++ ; 
					secs = 0 ;
				}
				if(mins == 60) {
					hours++ ; 
					mins = 0 ; 
				}
				
				System.out.println(hours + ":" + mins + ":" + secs );
			}
			catch(InterruptedException e ) {
				e.printStackTrace();
			}
		}
	}

}
