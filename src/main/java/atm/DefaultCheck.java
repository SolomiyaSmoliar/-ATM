package atm;

public class DefaultCheck implements Check{
    private int check;
    private Check nextCheck;

    public DefaultCheck(int check){
        this.check = check;
    }

    public void setNext(Check check){
        this.nextCheck = check;
    }

    public void process (int amount){
        nextCheck.process(amount % check);
        System.out.println(amount / check);

    }
}
