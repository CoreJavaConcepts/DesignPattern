package com.java.state;

public class Main {
    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.performAction();


        context.setState(tvStopState);
        context.performAction();

    }
}
