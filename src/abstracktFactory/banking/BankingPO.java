package abstracktFactory.banking;

import abstracktFactory.ProductOwner;

public class BankingPO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("Bankin PO manage product");
    }
}
