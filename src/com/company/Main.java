package com.company;

public class Main {
    private static Retaurant Yuncan=new Retaurant();

    public static void main(String[] args){
        Yuncan.getA().enterRes();
        Yuncan.changeStates();
        System.out.println(Yuncan.toString());
    }
}
