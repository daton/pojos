package educarvr.pojos;

import educarvr.pojos.shop.Product;
import educarvr.pojos.shop.ShoppingCart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication

public class PojosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PojosApplication.class, args);

		ApplicationContext ctx=new AnnotationConfigApplicationContext(ShoppingConfiguration.class);
		ShoppingCart cart1=ctx.getBean("shoppingCart", ShoppingCart.class);
		Product aaa=ctx.getBean("aaa", Product.class);
		Product cdrw=ctx.getBean("cdrw", Product.class);
		Product dvdrw=ctx.getBean("dvdrw", Product.class);
	 cart1.addItem(aaa);
	 cart1.addItem(cdrw);
		System.out.println("Caro 1 "+cart1.getItems());

		ShoppingCart cart2= ctx.getBean("shoppingCart", ShoppingCart.class);
		cart2.addItem(dvdrw);
		System.out.println("Carro 2 "+cart2.getItems());



	}

}
