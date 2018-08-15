/**
 * 
 */
package util;


import com.training.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

		/*
		//Creating new service and getting new Bean from Shape
		Shape newShape = (Shape) ctx.getBean("beanOne");
		
		newShape.showDate();
		
		((AbstractApplicationContext) ctx).close();


		//Creating and Testing for Employee and Address
		Employee emp = (Employee) ctx.getBean("emp1");

		emp.show();

		//Creating and testing for Question And List type for Constructor
		Question ques = ( Question ) ctx.getBean( "ques2" );

		ques.displayInfo();
		*/

		//Parent and Calling Child
		Employee emp = (Employee)ctx.getBean("emp2");
		emp.show();

	}

}
