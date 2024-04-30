
package sistema;
import java.sql.*;

public class ConexaoSQlite {
   public Connection c;

    public ConexaoSQlite() {
        this.c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            this.c = DriverManager.getConnection("jdbc:sqlite:MeuBancoHB.db"); // banco.db é o nome do arquivo do banco de dados, que deve estar na pasta principal do projeto
            System.out.println("Conexão com o banco de dados efetuada com sucesso");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
        
    }



    

