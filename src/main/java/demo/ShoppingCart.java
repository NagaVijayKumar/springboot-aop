package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkOut(){
        System.out.println("CheckOut method form shopping cart is called");
    }
}
