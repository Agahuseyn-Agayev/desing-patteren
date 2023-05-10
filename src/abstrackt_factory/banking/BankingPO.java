package abstrackt_factory.banking;

import abstrackt_factory.ProductOwner;

public class BankingPO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("Bankin PO manage product");
    }
}
