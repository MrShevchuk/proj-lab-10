package packages.test;

import packages.transport.Passport;
import packages.transport.PassportUtil;

public class TransportMain {

    public static void main(String[] args) {

        Passport mercedes = new packages.transport.Passport(98746, "Mercedes CLA", "white",5,"Nastya");
        System.out.println("Nastya car: " + mercedes);

        PassportUtil.changeOwner(mercedes, "is Slava.");
    }

}
