
package sistema.modelo;


 public class Sessao {
    private static Sessao instancia;
    private Funcionario funcionarioLogado;
    
    
        private Sessao(){}
         public static Sessao getInstancia(){
             if (instancia == null){
                 instancia = new Sessao();
             }
             return instancia;
         }
         public Funcionario getFuncionarioLogado() {
               return funcionarioLogado;
         }
         public void setFuncionarioLogado(Funcionario funcionario){
               this.funcionarioLogado = funcionario;
         }
    }




