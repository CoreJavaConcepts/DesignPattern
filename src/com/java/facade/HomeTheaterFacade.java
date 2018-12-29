package com.java.facade;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;
    private TheaterLights theaterLights;

    public HomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Projector projector, Screen screen, TheaterLights theaterLights) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
    }

    public void wathcMovie(String movieName){
        System.out.println("Get Ready to watch a movie");
        amplifier.on();
        amplifier.setDvd();
        amplifier.setSurroundSound();
        dvdPlayer.on();
        dvdPlayer.play();
        projector.on();
        projector.widescreenmode();
        screen.down();
        theaterLights.dim();

    }

    public void endMovie(){
        System.out.println("Shutting movie theater down");
        amplifier.off();
        dvdPlayer.stop();
        projector.off();
        screen.up();
        theaterLights.normalLights();



    }
}
