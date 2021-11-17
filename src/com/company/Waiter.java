package com.company;

public class Waiter {
    private static String NEW_LINE=System.getProperty("line.separator");
    private String states="standby";
    private Boolean haveGotOrder=false;
    private Boolean haveSendOrder=false;

    public String getStates(){
        return states;
    }

    public Boolean getHaveGotOrder(){
        return haveGotOrder;
    }

    public Boolean getHaveSendOrder(){
        return haveSendOrder;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public void setHaveGotOrder(Boolean haveGotOrder) {
        this.haveGotOrder = haveGotOrder;
    }

    public void setHaveSendOrder(Boolean haveSendOrder) {
        this.haveSendOrder = haveSendOrder;
    }

    @Override
    public String toString() {
        return "Waiter's states:"+getStates()+
                NEW_LINE+ "have got order:"+getHaveGotOrder()+
                NEW_LINE+ "have sent order:"+getHaveSendOrder()+
                NEW_LINE;
    }
}
