package com.example.InversionOfControlSpring;

import com.example.InversionOfControlSpring.services.KitchenService;
import com.example.InversionOfControlSpring.services.RestaurantService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InversionOfControlSpringApplication {
/*this is an inversion of control example project
* here we invert the control from your code to spring to handle
* earlier we would have created
* 	KitchenService kitchenService = new KitchenService(); and passed to the constructor of RestaurantService
* 	and KitchenService wouldn't be a Service  */


	public static void main(String[] args) {
		/*The Application Context is the IoC container(inherits from BeanFactory) in Spring
		that manages all your beans for you. This is where you can find them too if you need them.*/

		ApplicationContext applicationContext = SpringApplication.run(InversionOfControlSpringApplication.class, args);
		/*both are fine to get the bean */
		//KitchenService kitchenService = (KitchenService) applicationContext.getBean("kitchenService");
		 		KitchenService kitchenService = (KitchenService) applicationContext.getBean(KitchenService.class);
		RestaurantService restaurantService = new RestaurantService(kitchenService);
		restaurantService.doProcess();
	}

}
