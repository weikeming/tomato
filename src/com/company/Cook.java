package com.company;

public class Cook {
    private static String NEW_LINE=System.getProperty("line.separator");
    private String states="standby";
    private Boolean haveMeun=false;
    private Boolean haveStartedCooking=false;

    public String getStates(){
        return states;
    }

    public Boolean getHaveMeun(){
        return haveMeun;
    }

    public Boolean getHaveStartedCooking(){
        return haveStartedCooking;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public void setHaveMeun(Boolean haveMeun) {
        this.haveMeun = haveMeun;
    }

    public void setHaveStartedCooking(Boolean haveStartedCooking) {
        this.haveStartedCooking = haveStartedCooking;
    }

    public String toString(){
        String Info="cook's states:"+getStates()+
                NEW_LINE+"have got meun:"+getHaveMeun()+
                NEW_LINE+"have started cooking:"+getHaveStartedCooking() +
                NEW_LINE;
        return Info;
    }
}
