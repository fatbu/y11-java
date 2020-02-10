package edu.cis;

public class Virus {
    String symptoms;
    int deathRate;
    String name;
    boolean isTransmissible; // boolean is initialized to false by default
    int propRate;
    String genus;

    public Virus(){
        name = "Corona";
    }
    public Virus(String initialName){
        name = initialName;
    }

    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }

    public void eradicate(){
        name = "dead";
        deathRate = 0;
        System.out.println("Nooooooo!");
    }
    public void infect(){
        isTransmissible = true;
        System.out.println("Hi, I'm "+name+", I found a new host");
    }

    public boolean getTransmissible(){
        return isTransmissible;
    }
}
