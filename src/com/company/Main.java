package com.company;

public class Main {

    public static void main(String[] args) {



        System.out.println(methodChyngyz(32, 17));
        System.out.println(methodChyngyz(65, 44));
        System.out.println(methodChyngyz(17, 23));
        System.out.println(methodChyngyz(43, 19));
        System.out.println(methodChyngyz(37, 29));

    }

    public static String methodChyngyz(int age, int temperature) {
        if (temperature < -20 & temperature < 30 & (age > 20 & age < 45)) {
            return "Можно идти гулять!";
        }
        if (age < 20 & temperature > 0 & temperature < 28) {
            return"Можно идти гулять!";
        }
        if (age > 45 & temperature > -10 & temperature < 25
        ) {
            return"Можно идти гулять! ";
        } else {
            return"Оставайтесь дома!";

        }
    }

}
