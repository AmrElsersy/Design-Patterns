package StatePattern;

public class State2 extends State {
    State2(FiniteStateMachine m){super(m);}
    public void action1()
    {
        System.out.println("ERROR Action1 State2");
    }
    public void action2()
    {
        System.out.println("Action2 State2");
        this.Machine.setState(this.Machine.getState1());
    }
}
