package com.company;

import static com.company.Bicycle.speed;
import static com.company.Bicycle.speedUp;

/**
 * Created by mzdzioch on 2017-08-20.
 */
public class BicycleMain {

    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        Bicycle b2 = new Bicycle();

        System.out.println(b1.speed);
        speedUp(b1);
        System.out.println(b2.speed);
        speedUp(b2);
        System.out.println(b1.speed);

    }


}
