
package sistema.Dao;

import java.sql.PreparedStatement;
import sistema.modelo.Funcionario;
import java.sql.Connection;


public class FuncionarioDao {
    private Connection c;

    public FuncionarioDao(Connection c) {
        this.c = c;
  
    }
    
    
      public String cadastrarFuncionario(Funcionario func){
        String resposta = "";
         try{
             
           String sql = "INSERT INTO funcionario(nome , cpf, email, telefone, cep, senha, rua, bairro, numero)\n" +
                         "VALUES (?,?,?,?,?,?,?,?,?)";
           PreparedStatement stm = this.c.prepareStatement(sql);
           stm.setString(1, func.getNome());
           stm.setString(2, func.getCpf());
           stm.setString(3, func.getEmail());
           stm.setString(4, func.getTelefone());
           stm.setString(5, func.getCep());
           stm.setString(6, func.getSenha());
           stm.setString(7, func.getRua());
           stm.setString(8,func.getBairro());
           stm.setInt(9, func.getNumero());
            
            stm.executeUpdate();
            stm.close();
            resposta = "Ok";
        }catch(Exception e){
             resposta = "Erro ao cadastrar funcionário: " + e.getMessage();
        }
          return resposta;      
    }
    
}
