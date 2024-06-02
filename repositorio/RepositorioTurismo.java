package repositorio;
import java.util.ArrayList;
import servicos.GuiaTuristico;

public class RepositorioTurismo {
  private ArrayList<GuiaTuristico> listaDeGuias;

  public RepositorioTurismo(ArrayList<GuiaTuristico> listaDeGuias) {
    this.listaDeGuias = listaDeGuias;
  }

  public RepositorioTurismo(){
    this.listaDeGuias = new ArrayList<>();
  }

  public ArrayList<GuiaTuristico> getListaDeGuias() {
    return listaDeGuias;
  }

  public void adicionarGuia(GuiaTuristico lugar){
    listaDeGuias.add(lugar);
  }
}
