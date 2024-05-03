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


		//KitchenService kitchenService = (KitchenService) applicationContext.getBean("kitchenService");


		// here as we annotated RestaurantService as @Service we can get RestaurantService from ApplicationContext
		// so dont even need to get KitchenService (as SpringBoot does a component scanning which will search for components like @Service and will know the dependencies)
		RestaurantService restaurantService = applicationContext.getBean(RestaurantService.class);
		restaurantService.doProcess();
	}

}
