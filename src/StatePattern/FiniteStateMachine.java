package StatePattern;

public class FiniteStateMachine
{
    private State state1 = new State1(this);
    private State state2 = new State2(this);

    public State getState1(){return this.state1;}
    public State getState2(){return this.state2;}


    private State currentState = state1;
    public void setState(State state) {
        this.currentState = state;
    }

    public void action1() { currentState.action1(); }
    public void action2() { currentState.action2(); }

    FiniteStateMachine() { this.state1.name = "state1" ; this.state2.name="state2"; }
}
