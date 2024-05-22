package entities;

public class Quarto {
  private ficha fichaCliente;
  private String tipoQuarto;
  
  // CONSTRUTOR
  public Quarto(ficha fichaCliente, String tipoQuarto) {
    this.fichaCliente = fichaCliente;
    this.tipoQuarto = tipoQuarto;
  }
  // GET SET

  public ficha getFichaCliente() {
    return fichaCliente;
  }

  public void setFichaCliente(ficha fichaCliente) {
    this.fichaCliente = fichaCliente;
  }

  public String getTipoQuarto() {
    return tipoQuarto;
  }

  public void setTipoQuarto(String tipoQuarto) {
    this.tipoQuarto = tipoQuarto;
  }

}

