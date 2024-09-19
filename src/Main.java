import Model.DatabaseConnection;

import javax.xml.crypto.Data;
import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        DatabaseConnection dc = DatabaseConnection.getInstance();

        DatabaseConnection dc2 = DatabaseConnection.getInstance();

        System.out.println(dc);
        System.out.println(dc2);

    }
}