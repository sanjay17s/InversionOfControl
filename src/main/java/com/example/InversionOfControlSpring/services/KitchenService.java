package com.example.InversionOfControlSpring.services;

import org.springframework.stereotype.Service;

@Service
public class KitchenService {

    /*A bean is a class that you tell Spring you want to manage and initialize for you.
     You invert the control from your code to Spring to handle.
“an object that the Spring container instantiates, assembles, and manages.” - Baeldung
 * */

    public void cookFood() {
        System.out.println("food cooking");
    }
}
