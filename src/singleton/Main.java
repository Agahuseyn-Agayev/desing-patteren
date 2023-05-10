package singleton;

import singleton.DbConn;
import singleton.DbConnection;

public class Main {
    public static void main(String[] args) {
        var dbConnection= DbConnection.getDbConnection();
        dbConnection.addQuery("First query");
        dbConnection.addQuery("Second query");
        dbConnection.showQueries();
        var a=DbConnection.getDbConnection();

        a.addQuery("Third");//cehck edirik burada
        a.showQueries();
        System.out.println(dbConnection.equals(a));

        DbConn.DB_CONN.showQueries();
    }
}