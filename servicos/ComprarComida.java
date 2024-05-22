package servicos;

import entities.Frigobar;

public class ComprarComida {
    private Frigobar frigobar;

    // metodos
    public ComprarComida(Frigobar frigobar) {
      this.frigobar = frigobar;
    }

    public double comprarCocaCola() {
      double preco = frigobar.getPrecoCocaCola();
      return preco;
    }

    public double comprarEnergetico() {
      double preco = frigobar.getPrecoEnergetico();
      return preco;
    }

    public double comprarChocolate() {
      double preco = frigobar.getPrecoChocolate();
      return preco;
    }

    public double comprarSalgadinho() {
      double preco = frigobar.getPrecoSalgadinho();
      return preco;
    }
}
