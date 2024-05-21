package repositorio;
import java.util.ArrayList;
import entities.servico;

public class RepositorioServicoDeQuarto {
  private ArrayList<servico> listaServicos;

  public RepositorioServicoDeQuarto(){
    this.listaServicos = new ArrayList<>();
  }

  public void adicionarServico(servico NovoServico){
    listaServicos.add(NovoServico);
  }
}
