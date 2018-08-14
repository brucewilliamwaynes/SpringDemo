/**
 * 
 */
package beans;

import java.util.Date;

/**
 * @author bridgelabz
 *
 */
public class Shape {

	private Date curDate;
	
	public void customInit() {
		
		System.out.println( "Creating bean custom"  );
		
	}
	
	
	public void showDate(){
		
		System.out.println( "Hi : "   );
		
		System.out.println(  new Date()   );
		
	}
	
	public void customDestroy(){
		
		System.out.println( "Destroying Bean Custom"  );
		
	}


	/**
	 * @return the curDate
	 */
	public Date getCurDate() {
		return curDate;
	}


	/**
	 * @param curDate the curDate to set
	 */
	public void setCurDate(Date curDate) {
		this.curDate = curDate;
	}
	
}
