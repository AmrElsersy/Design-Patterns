package StatePattern;

public class State1 extends State {
    State1(FiniteStateMachine m){super(m);}
    public void action1()
    {
        System.out.println("Action1 State1");
        this.Machine.setState(this.Machine.getState2());
    }
    public void action2()
    {
        System.out.println("Action2 State1 ERROR NOT RAY2");
    }

}
