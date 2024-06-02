package repositorio;

import java.util.ArrayList;
import entities.Frigobar;
import entities.ficha;

public class RepositorioFrigobar{
  private ArrayList<Frigobar> listaFrigobar;

  public RepositorioFrigobar(ArrayList<ficha> listaFichas, ArrayList<Frigobar> listaFrigobar) {
    this.listaFrigobar = listaFrigobar;
  }

  public RepositorioFrigobar(ArrayList<Frigobar> listaFrigobar) {
    this.listaFrigobar = listaFrigobar;
  }

  public RepositorioFrigobar(){
    this.listaFrigobar = new ArrayList<>();
  }

  public ArrayList<Frigobar> getListaFrigobar() {
    return listaFrigobar;
  }

    public void adicionarFrigobar(Frigobar comida){
      listaFrigobar.add(comida);
    }
    
}

