package bridge;

import java.util.Arrays;
import java.util.Iterator;

public class ApplicationCreator {
    public static void main(String[] args) {
        Application[]applications={
                new BankSytem(new JavaDeveloper()),
                new StockExchange(new KotlinDeveloper())
        };
        for (Application application:applications){
            application.developApplication();
        }

    }
}
