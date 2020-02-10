package edu.cis;

public class Main {
    public static void main(String[] args){
        System.out.println("test");

        Virus corona = new Virus();
        System.out.println(corona.getName());

        Virus sars = new Virus();
        sars.setName("SARS 2.0");
        System.out.println(sars.getName());

        Virus mers = new Virus("MERS");
        System.out.println(mers.getName());

        sars.eradicate();

        mers.infect();
        System.out.println(mers.getName()+" is transmissible: "+mers.getTransmissible());
    }
}
