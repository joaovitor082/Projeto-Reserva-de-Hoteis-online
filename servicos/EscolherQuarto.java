package servicos;
import entities.Quarto;
import entities.ficha;
import repositorio.RepositorioQuarto;
public class EscolherQuarto extends Quarto{
  private RepositorioQuarto repositorioQuarto;

  // construtor com sobrecarga
  public EscolherQuarto(ficha fichaCliente, String tipoQuarto, RepositorioQuarto repositorioQuarto) {
    super(fichaCliente, tipoQuarto);
    this.repositorioQuarto = repositorioQuarto;
  }
  
  // metodos
  public double quartoSimples(){
    double preco = 50.00;
    return preco;
  }

  public double quartoIntermediario(){
    double preco = 70.00;
    return preco;
  }

  public double quartoLuxo(){
    double preco = 100.00;
    return preco;
  }
}
