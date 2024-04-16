package com.org.annotations;

import com.org.annotations.Value.VauleDemo;
import com.org.annotations.controller.MyController;
import com.org.annotations.controller.PizzaController;
import com.org.annotations.lazy.LazyLoader;
import com.org.annotations.propertySource.PropertySourceDemo;
import com.org.annotations.repository.MyRepository;
import com.org.annotations.scopr.PrototypeBean;
import com.org.annotations.scopr.SingletonBean;
import com.org.annotations.service.MyService;
import com.org.annotations.service.NonVegPizza;
import com.org.annotations.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAnnotationsApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(SpringBootAnnotationsApplication.class, args);
//		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
//		System.out.println(pizzaController.getPizza());
//		MyController myController = context.getBean(MyController.class);
//		System.out.println(myController.hello());
//		MyService myService=context.getBean(MyService.class);
//		System.out.println(myService.hello());
//		MyRepository myRepository=context.getBean(MyRepository.class);
//		System.out.println(myRepository.hello());
//
//
//		LazyLoader lazyLoader=context.getBean(LazyLoader.class);

//		VegPizza vegPizza = (VegPizza) context.getBean("vegPizza");
//		System.out.println(vegPizza.getPizza());
//
//		var nonVegPizza=context.getBean(NonVegPizza.class);
//		System.out.println(nonVegPizza.getPizza());

//		SingletonBean singletonBean=context.getBean(SingletonBean.class);
//		System.out.println(singletonBean.hashCode());
//		SingletonBean singletonBean1=context.getBean(SingletonBean.class);
//		System.out.println(singletonBean1.hashCode());
//		SingletonBean singletonBean2=context.getBean(SingletonBean.class);
//		System.out.println(singletonBean2.hashCode());
//
//		PrototypeBean prototypeBean=context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean.hashCode());
//		PrototypeBean prototypeBean1=context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean1.hashCode());
//		PrototypeBean prototypeBean2=context.getBean(PrototypeBean.class);

//		VauleDemo vauleDemo = context.getBean(VauleDemo.class);
//		System.out.println(vauleDemo.getDefaultName());
//		System.out.println(vauleDemo.getHost());
//		System.out.println(vauleDemo.getEmail());
//		System.out.println(vauleDemo.getPassword());
//		System.out.println(vauleDemo.getJavaHome());
//		//System.out.println(vauleDemo.getHomeDir());
//
//		PropertySourceDemo propertySourceDemo=context.getBean(PropertySourceDemo.class);
//		System.out.println(propertySourceDemo.getEmail());
//		System.out.println(propertySourceDemo.getHost());
//		System.out.println(propertySourceDemo.getPassword());
//		System.out.println(propertySourceDemo.getMsgname());
//		System.out.println(propertySourceDemo.getMsgtype());

	}

}
