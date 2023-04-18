package educarvr.pojos.shop;

import educarvr.pojos.shop.Battery;
import educarvr.pojos.shop.Disc;
import educarvr.pojos.shop.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Scope("prototype")
@Component
public class ShoppingCart {
    private List<Product> items=new ArrayList<>();

    public  void addItem(Product item){
        items.add(item);
    }

    public  List<Product> getItems(){
        return  items;
    }


}
