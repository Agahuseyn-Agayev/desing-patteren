package abstrackt_factory;

public interface ProjectTeamFactory {
    Developer getDeveloper();

    Tester getTester();

    ProductOwner getProductOwner();
}
