package abstrackt_factory.banking;

import abstrackt_factory.Developer;
import abstrackt_factory.ProductOwner;
import abstrackt_factory.ProjectTeamFactory;
import abstrackt_factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProductOwner getProductOwner() {
        return new BankingPO();
    }
}
