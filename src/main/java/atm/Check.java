package atm;

public interface Check {
    void process (int amount);
    void setNext(Check check);
}
