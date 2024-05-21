package entities;

public class Quarto {
  private ficha fichaCliente;
  private String tipoQuarto;
  private int quantidadeSimples = 10;
  private int quantidadeIntermediario = 10;
  private int quantidadeLuxo = 5;
  
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

  public int getQuantidadeSimples() {
    return quantidadeSimples;
  }

  public int getQuantidadeIntermediario() {
    return quantidadeIntermediario;
  }

  public int getQuantidadeLuxo() {
    return quantidadeLuxo;
  }
  
  public void diminuirQuantidadeSimples(){
    if (quantidadeSimples > 0) {
      quantidadeSimples--;
    }else{
      System.out.println("Todos os quartos simples ocupados.");
    }
  }

  public void diminuirQuantidadeIntermediario(){
    if (quantidadeIntermediario > 0) {
      quantidadeIntermediario--;  
    }else{
      System.out.println("Todos os quartos intermediarios ocupados.");
    }
  }

  public void diminuirQuantidadeLuxo(){
    if (quantidadeLuxo > 0) {
      quantidadeLuxo--;  
    }else{
      System.out.println("Todos os quartos luxo ocupados.");
    }
    
  }
}

