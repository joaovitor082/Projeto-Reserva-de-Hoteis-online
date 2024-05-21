package repositorio;
import entities.Quarto;
import java.util.ArrayList;

public class RepositorioQuarto {
  private ArrayList<Quarto> ListaQuartos;

  public RepositorioQuarto() {
    this.ListaQuartos = new ArrayList<>();
  }

  public void adicionarQuarto(Quarto novoQuarto){
    ListaQuartos.add(novoQuarto);
  }
}
