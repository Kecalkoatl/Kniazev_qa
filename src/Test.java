import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DataBaseHandler DBH = new DataBaseHandler();
          DBH.signUpUser("Vovpen", "Knyazya", "Kecalkoatl", "12345", "Georgia", "Male");


    }
}
