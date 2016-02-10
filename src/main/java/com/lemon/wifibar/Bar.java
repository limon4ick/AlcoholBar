package com.lemon.wifibar;


import java.math.BigDecimal;

public class Bar {
    BigDecimal c1 = new BigDecimal("3");
    BigDecimal c2 = new BigDecimal("5");
    Liquid v1 = new Liquid(BigDecimal.valueOf(Double.MAX_VALUE),new BigDecimal("100"));
    Liquid v2 = new Liquid(BigDecimal.valueOf(Double.MAX_VALUE),new BigDecimal("0"));

    public void openBar(){
        Canister canister3 = new Canister(c1, new Liquid(new BigDecimal("0"),new BigDecimal("0")));
        Canister canister5 = new Canister(c2, new Liquid(new BigDecimal("0"),new BigDecimal("0")));

        System.out.println("Action                                  |   3L          5L    ");
        System.out.println("----------------------------------------|-------------------");
        System.out.println("Init state                              | " + canister3 + "     -  " + canister5);

        canister3.append(v1);
        System.out.println("Fill canister3 whith V1                 | " + canister3 + " -  " + canister5);

        canister5.transfuse(canister3);
        System.out.println("Transfer canister3 content to canister5 | " + canister3 + "     -  " + canister5);

        canister3.append(v2);
        System.out.println("Fill canister3 whith V2                 | " + canister3 + "   -  " + canister5);

        canister5.transfuse(canister3);
        System.out.println("Transfer canister3 content to canister5 | " + canister3 + "   -  " + canister5);

        canister3.transfuse(canister5);
        System.out.println("Transfer canister5 content to canister3 | " + canister3 + "  -  " + canister5);

        canister5.transfuse(canister3);
        System.out.println("Transfer canister3 content to canister5 | " + canister3 + "  -  " + canister5);

        canister5.pourOut();
        System.out.println("Purge canister5                         | " + canister3 + "  -  " + canister5 );
    }

    public static void main(String[] args) {

        new Bar().openBar();
    }

}