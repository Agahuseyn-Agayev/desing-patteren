package facade;

public class MobileShop {
    private Mobile iphone;
    private Mobile samsung;
    private Mobile redmi;

    public MobileShop() {
     iphone=new Iphone();
     samsung=new Samsung();
     redmi=new Redmi();
    }
    public void getIphone(){
        iphone.price();
    }
    public void getSamsung(){
        samsung.price();
    }
    public void getRedmi(){
        redmi.price();
    }
}
