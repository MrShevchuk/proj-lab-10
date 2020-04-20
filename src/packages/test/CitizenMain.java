package packages.test;

import packages.citizen.Passport;
import packages.citizen.PassportUtil;

public class CitizenMain {

    public static void main(String[] args) {

        Passport husband = new Passport(741220,"Slava","Zaporozhye", 25,"Zaporozhye, Charivna Street");
        Passport wife = new Passport(147530,"Nastya","Zaporozhye", 22,"Zaporozhye, Soborny Avenue");
        System.out.println("Husband: " + husband);
        System.out.println("Wife: " + wife);

        PassportUtil.marriageRegistrate(husband,wife);

    }
}
