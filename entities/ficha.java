package entities;

public class ficha{
  private String nome;
  private char sexo;
  private String cpf;
  private int quantidadeDeDias;
  private int numeroDeAcompanhantes;
  private boolean cadastrado = false;
  private double valorPagar;
  
  // construtor com sobrecarga
  
  public ficha(String nome, char sexo, String cpf, int quantidadeDeDias, int numeroDeAcompanhantes, boolean cadastrado) {
    this.nome = nome;
    this.sexo = sexo;
    this.cpf = cpf;
    this.quantidadeDeDias = quantidadeDeDias;
    this.numeroDeAcompanhantes = numeroDeAcompanhantes;
    this.cadastrado = cadastrado;
  }

  // GET E SET

  public boolean getCadastro(){
    return cadastrado;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public int getQuantidadeDeDias() {
      return quantidadeDeDias;
  }

  public void setQuantidadeDeDias(int quantidadeDeDias) {
      this.quantidadeDeDias = quantidadeDeDias;
  }

  public int getNumeroDeAcompanhantes() {
    return numeroDeAcompanhantes;
  }

  public void setNumeroDeAcompanhantes(int numeroDeAcompanhantes) {
    this.numeroDeAcompanhantes = numeroDeAcompanhantes;
  }

  public void setCadastro(boolean cadastrado){
    this.cadastrado = cadastrado;
  }

  public double getValorPagar(){
    return valorPagar;
  }

  public void setValorPagar(double valorPagar){
     this.valorPagar = valorPagar;
  }

  public void imprimirFicha(){
    System.out.println("\nNome: " + getNome());
    System.out.println("Quantidade de dias: " + getQuantidadeDeDias());
    System.out.println("Quantidade de acompanhantes: " + getNumeroDeAcompanhantes());
    System.out.println("Valor a pagar: R$ " + getValorPagar() + "\n");
  }
}