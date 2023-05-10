package bridge;

public abstract class Application {
    private final Developer developer;

    protected Application(Developer developer) {
        this.developer = developer;
    }
    public abstract void developApplication();

    public Developer getDeveloper(){
        return developer;
    }

}
