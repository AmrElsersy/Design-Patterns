package StatePattern;

abstract class State {
    public String name;
    protected FiniteStateMachine Machine;
    State(FiniteStateMachine machine) {this.Machine = machine; }
    abstract void action1();
    abstract void action2();
}
