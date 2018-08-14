/**
 * 
 */
package util;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Shape;

/**
 * @author bridgelabz
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Setting up XML Based on Application And Bean
		ApplicationContext ctx = new ClassPathXmlApplicationContext( "Context.xml" );
		
		//Creating new service and getting new Bean from Shape
		Shape newShape = (Shape) ctx.getBean("beanOne");
		
		newShape.showDate();

	}

}
