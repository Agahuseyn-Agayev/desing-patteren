package abstracktFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();

    Tester getTester();

    ProductOwner getProductOwner();
}
