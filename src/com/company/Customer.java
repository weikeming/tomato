package com.company;

public class Customer {
    private String states="standby";
    private static String NEW_LINE=System.getProperty("line.separator");
    private Boolean haveOrder=false;
    private String dish=null;

    public String getStates(){
        return states;
    }

    public Boolean getHaveOrdered(){
        return haveOrder;
    }

    public void setStates(String newStates){
        states=newStates;
    }

    public void setOrder(Boolean newOrder){
        haveOrder=newOrder;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public void enterRes(){
        this.setStates("have entered restaurant");
    }

    @Override
    public String toString() {
        return "Customer's States:"+getStates()+
                NEW_LINE+ "have ordered:"+getHaveOrdered()+
                NEW_LINE+"dish:"+getDish()+
                NEW_LINE;
    }
}
