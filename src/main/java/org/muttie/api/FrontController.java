package org.muttie.api;

import org.muttie.domain.Dog;
import org.raviolini.api.AbstractController;

public class FrontController extends AbstractController {

    public static void main(String[] args) {
        listenToAssignedPort();
        addRouter(Dog.class);
    }
}