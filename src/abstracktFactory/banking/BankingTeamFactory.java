package abstracktFactory.banking;

import abstracktFactory.Developer;
import abstracktFactory.ProductOwner;
import abstracktFactory.ProjectTeamFactory;
import abstracktFactory.Tester;

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
