package com.java.facade;

public class Main {
    public static void main(String[] args) {
        //Can give example of Builder

        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights theaterLights = new TheaterLights();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, dvdPlayer, projector, screen, theaterLights);
        homeTheaterFacade.wathcMovie("MOvie");
        homeTheaterFacade.endMovie();
    }
}
