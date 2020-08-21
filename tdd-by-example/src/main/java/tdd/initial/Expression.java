package tdd.initial;

public interface Expression {
    Money reduce(Bank bank,String to);
    public Expression plus(Expression addmend);
    public Expression times(int multiplier);
}
