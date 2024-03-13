import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.api.UserPaymentService;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/mphasis/config/application-context.xml");
		
	UserPaymentService paymentService = 	applicationContext.getBean(UserPaymentService.class);
		System.out.println(paymentService.processPayment());
		
	}

}
