package com.java.state.correctExample;

public class CeilingFanPullChain {
    private State state;

    public CeilingFanPullChain() {
        state = new Off();
    }

    private void setState(State newState) {
        state = newState;
    }

    public void pull() {
        state.pull(this);
    }

    private interface State {
        void pull(CeilingFanPullChain wrapper);
    }

    private class Off implements State {
        public void pull(CeilingFanPullChain wrapper) {
            wrapper.setState(new Low());
            System.out.println("   low speed");
        }
    }

    private class Low implements State {
        public void pull(CeilingFanPullChain wrapper) {
            wrapper.setState(new Medium());
            System.out.println("   medium speed");
        }
    }

    private class Medium implements State {
        public void pull(CeilingFanPullChain wrapper) {
            wrapper.setState(new High());
            System.out.println("   high speed");
        }
    }

    private class High implements State {
        public void pull(CeilingFanPullChain wrapper) {
            wrapper.setState(new Off());
            System.out.println("   turning off");
        }
    }
}
