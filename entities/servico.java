package entities;

public class servico {
  private ficha fichaCliente;
  private String tipoServico;
  
  // CONSTRUTOR
  public servico(ficha fichaCliente, String tipoServico) {
    this.fichaCliente = fichaCliente;
    this.tipoServico = tipoServico;
  }

  // GET SET
  public ficha getFichaCliente() {
    return fichaCliente;
  }
  public void setFichaCliente(ficha fichaCliente) {
    this.fichaCliente = fichaCliente;
  }
  public String getTipoServico() {
    return tipoServico;
  }
  public void setTipoServico(String tipoServico) {
    this.tipoServico = tipoServico;
  }
  
}
