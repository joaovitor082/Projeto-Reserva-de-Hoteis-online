package servicos;
import entities.LugaresTuristicos;
import repositorio.RepositorioTurismo;
public class GuiaTuristico extends LugaresTuristicos{
  private RepositorioTurismo RepositorioTurismo;
  private LugaresTuristicos lugaresTuristicos;
  
  public GuiaTuristico(double praia, double cachoeira, double barco, double ilha,
      repositorio.RepositorioTurismo repositorioTurismo) {
    super(praia, cachoeira, barco, ilha);
    RepositorioTurismo = repositorioTurismo;
  }

  public double paraPraia(){
    double preco = getPraia();
    return preco;
  }
  
  public double paraCachoeira(){
    double preco = getCachoeira();
    return preco;
  }

  public double paraBarco(){
    double preco = getBarco();
    return preco;
  }

  public double paraIlha(){
    double preco = getIlha();
    return preco;
  }
}
