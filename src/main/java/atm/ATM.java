package atm;

public class ATM {
    private Check check;

    public ATM() {
        Check check1 = new DefaultCheck(5);
        Check check2 = new DefaultCheck(10);
        Check check3 = new DefaultCheck(20);

        check3.setNext(check2);
        check2.setNext(check1);
        this.check = check3;
    }
    public void process(int amount){
        check.process(amount);
    }
}
