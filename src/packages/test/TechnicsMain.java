package packages.test;

import packages.technics.Passport;
import packages.technics.PassportUtil;

public class TechnicsMain {

    public static void main(String[] args) {

        Passport asus = new Passport(123456, "monitor Asus with IPS screen and has diagonal 24' inhes", "black", "Indonesia", "3/16/20");
        System.out.println("Item: " + asus);

        PassportUtil.warrantyReplace(asus);
    }
}
