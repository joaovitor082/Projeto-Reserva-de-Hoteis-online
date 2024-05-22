package entities;

public class LugaresTuristicos{
  private double Praia = 10; 
  private double Cachoeira = 10;
  private double Barco = 20;
  private double ilha = 30;

  
  public LugaresTuristicos(double praia, double cachoeira, double barco, double ilha) {
    Praia = praia;
    Cachoeira = cachoeira;
    Barco = barco;
    this.ilha = ilha;
  }

  public double getPraia() {
    return Praia;
  }

  public double getCachoeira() {
    return Cachoeira;
  }

  public double getBarco() {
    return Barco;
  }

  public double getIlha() {
    return ilha;
  }
  
}
