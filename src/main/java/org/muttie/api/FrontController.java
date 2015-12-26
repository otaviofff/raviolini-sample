package org.muttie.api;

import org.muttie.domain.Dog;
import org.raviolini.api.RequestRouter;

public class FrontController {

    public static void main(String[] args) {
        RequestRouter<Dog> router = new RequestRouter<>();
        
        router.route(Dog.class);
    }
}