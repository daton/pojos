package educarvr.pojos;

import educarvr.pojos.shop.Battery;
import educarvr.pojos.shop.Disc;
import educarvr.pojos.shop.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("educarvr.pojos.shop")
public class ShoppingConfiguration {


    @Bean
    public Product aaa(){
        Battery battery=new Battery();
        battery.setRechargeable(true);
        battery.setName("AAA");
        battery.setPrice(2.5);
        return  battery;
    }
    @Bean
    public Product cdrw(){
        Disc disc=new Disc("CD-rw", 1.5);
        disc.setCapacity(700);
        return  disc;
    }
    @Bean
    public Product dvdrw(){
        Disc disc=new Disc("DVD-RW",3.0);
        disc.setCapacity(700);
        return disc;
    }
}
