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
	private String name;

    Shape(String name){

        this.name = name;

    }

    //Customized Init() Function
	public void customInit() {
		
		System.out.println( "Creating bean custom"  );
		
	}
	
	
	public void showDate(){
		
		System.out.println( "Hi : " + name   );
		
		System.out.println(  curDate   );
		
	}


	//Customized Destroy Function()
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
	public void setCurDate(String curDate) {
		this.curDate = new Date();
	}
	
}
