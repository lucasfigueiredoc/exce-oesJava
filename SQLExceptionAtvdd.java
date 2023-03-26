
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SQLExceptionAtvdd {

     
    public static void main(String[] args) throws ClassNotFoundException {
        // SQL Exception ocorre na execução de querys em banco de dados
        // quando se ultilia o JBDC, seu tratamento é simples, limitando
        // no uso do try catch
        // Há algumas categorias de SQL Exception, que vem como subclasses da principal
        //sendo elas :
        //SQLNonTransientException,SQLRecoverableException, SQLClientInfoException
        //SQLTransientException, BatchUpdateException
        //
    String update_query = "update employee_details set email='martinL@gmail.com' where empNum1 = 10011"; 
    Class.forName("oracle.jdbc.driver.OracleDriver");  

    try(Connection conn = DriverManager.getConnection("jdbc:oracle:thin:system/pass123@localhost:1521:XE")){
        Statement statemnt1 = conn.createStatement();
        ResultSet rs1 =null;
        statemnt1 = conn.createStatement();
        System.out.println("Executing Update query using executeUpdate method");
        int return_rows = statemnt1.executeUpdate(update_query);
        System.out.println("No. of Affected Rows = "+ return_rows);
        }
    catch(SQLException sqe){
        System.out.println("Error Code = " + sqe.getErrorCode());
        System.out.println("SQL state = " + sqe.getSQLState());
        System.out.println("Message = " + sqe.getMessage());
        System.out.println("printTrace /n");
        sqe.printStackTrace();
        }
    }
    }


