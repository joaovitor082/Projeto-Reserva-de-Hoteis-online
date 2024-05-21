package entities;

public class Frigobar {
  private double precoCocaCola = 5.0;
  private double precoEnergetico = 6.0;
  private double precoChocolate = 2.50;
  private double precoSalgadinho = 4.0;

  // construtor
  public Frigobar() {
  
  }

  public Frigobar(double precoCocaCola, double precoEnergetico, double precoChocolate, double precoSalgadinho) {
    this.precoCocaCola = precoCocaCola;
    this.precoEnergetico = precoEnergetico;
    this.precoChocolate = precoChocolate;
    this.precoSalgadinho = precoSalgadinho;
  }


  // GET SET
  public double getPrecoCocaCola() {
    return precoCocaCola;
  }
  public double getPrecoEnergetico() {
    return precoEnergetico;
  }
  public double getPrecoChocolate() {
    return precoChocolate;
  }
  public double getPrecoSalgadinho() {
    return precoSalgadinho;
  }
}
