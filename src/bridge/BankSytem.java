package bridge;

public class BankSytem extends Application{

    protected BankSytem(Developer developer) {
        super(developer);
    }

    @Override
    public void developApplication() {
        System.out.println("Bank Sytem in progress");
        getDeveloper().writeCode();
    }
}
