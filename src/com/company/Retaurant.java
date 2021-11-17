package com.company;

public class Retaurant {
    private Customer A=new Customer();
    private Cook B=new Cook();
    private Waiter C=new Waiter();

    public void changeStates(){
        if(A.getStates()=="have entered restaurant"){
            A.setOrder(true);
            A.setDish("西红柿炒鸡蛋");
            C.setHaveGotOrder(true);
            C.setStates("serving");
            C.setHaveSendOrder(true);
            B.setHaveMeun(true);
            B.setHaveStartedCooking(true);
            B.setStates("cooking");
        }
    }

    public Customer getA() {
        return A;
    }

    public String toString(){
        String Info=A.toString()+"\n"+
                    C.toString()+"\n"+
                    B.toString()+"\n";
        return Info;
    }
}
