package facade;

public class FacadeDemo {
    public static void main(String[] args) {
        var mobileShop=new MobileShop();
        mobileShop.getIphone();
        mobileShop.getRedmi();
        mobileShop.getSamsung();
    }
}
