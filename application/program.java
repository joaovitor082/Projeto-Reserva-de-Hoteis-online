package application;

import java.util.Scanner;
import entities.ficha;
import entities.Frigobar;
import repositorio.RepositorioFichas;
import repositorio.RepositorioQuarto;
import repositorio.RepositorioServicoDeQuarto;
import repositorio.RepositorioTurismo;
import servicos.EscolherQuarto;
import servicos.ServicoDeQuarto;
import servicos.ServicoImprimirFicha;
import servicos.GuiaTuristico;
// Sistema de Reservas de Hotéis  online  : Gerencia reservas, clientes e quartos
public class program {
  public static void main(String[] asgr){
      Scanner sc = new Scanner(System.in);
      
      // construtores
      RepositorioFichas repositorioFichas = new RepositorioFichas();
      RepositorioServicoDeQuarto repositorioServicoDeQuarto = new RepositorioServicoDeQuarto();
      ServicoDeQuarto servicoDeQuarto = new ServicoDeQuarto(repositorioFichas, repositorioServicoDeQuarto);
      RepositorioQuarto repositorioQuarto = new RepositorioQuarto();
      Frigobar frigobar = new Frigobar();
      ServicoImprimirFicha imprimir = new ServicoImprimirFicha(repositorioFichas);
      RepositorioTurismo repositorioTurismo = new RepositorioTurismo();
      // variaveis
      double valorPagar = 0;
      boolean continuar = true;

      do{
        System.out.println
        ( "1- Check-in" 
        + "\n2- Consultar dados do cliente"
        + "\n3- Serviço de quarto"
        + "\n4- Comprar Comida"
        + "\n5- Guia Turistico"
        + "\n6- Sair");
        System.out.print(":");
        int navegacao = sc.nextInt();
        switch (navegacao) {
          
          // Opção de check-in
          case 1:
            // entrada de dados
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Sexo: ");
            char sexo = sc.next().charAt(0);
            System.out.print("CPF: ");
            String cpf = sc.next();
            System.out.print("Quantidade de Dias: ");
            int quantidadeDias = sc.nextInt();
            System.out.print("Quantidade de acompanhantes: ");
            int quantidadeAcompanhantes = sc.nextInt();
            
            // criando os objetos e o atributo de suporte
            ficha novaFicha = new ficha(nome, sexo, cpf, quantidadeDias, quantidadeAcompanhantes, true);
            EscolherQuarto escolherQuarto = new EscolherQuarto(novaFicha, "", repositorioQuarto);
            boolean suporte = true;
            
            
            // Escolha do quarto
            do{
                System.out.print("\nEscolha o seu quarto: "            
                + "\n1- Luxo R$ 100/dia"            
                +"\n2- Intermediario R$ 70/dia(MAX 4 Pessoas)"   
                +"\n3- Simples $50/dia(MAX 3 Pessoas)"
                +"\n: "
                );
              int quartoEscolhido = sc.nextInt();
              switch (quartoEscolhido) {
                case 1:
                    valorPagar = escolherQuarto.quartoLuxo() * quantidadeDias;
                    System.out.println("Quarto de luxo escolhido !\n");
                    suporte = false;
                    break;
                case 2:
                    if (quantidadeAcompanhantes > 4) {
                      System.out.println("Capacidade Maxima excedita, escolha outro quarto !\n");
                      break;
                    }else{
                      valorPagar = escolherQuarto.quartoIntermediario() * quantidadeDias;
                      System.out.println("Quarto de intermediario escolhido !\n");
                      suporte = false;
                      break;
                    }
                case 3:
                    if (quantidadeAcompanhantes > 3) {
                      System.out.println("Capacidade Maxima excedita, escolha outro quarto !\n");
                      break;
                    }else{
                      valorPagar = escolherQuarto.quartoSimples() * quantidadeDias;
                      System.out.println("Quarto de simples escolhido !\n");
                      suporte = false;
                      break;
                    }                  
                default:
                    System.out.println("Opção invalida, tente novamente.\n");
                    break;
              }
            }while (suporte == true);
            // colocando os dados no repositorio.
            novaFicha.setValorPagar(valorPagar);
            repositorioFichas.adicionarFicha(novaFicha);
            System.out.println("CADASTRO REALIZADO.");
            break;
                        
            // Opção de consulta por cpf
            case 2:
                System.out.print("\nDigite o CPF do cliente que deseja consultar: ");
                String consultarCpf = sc.next();
                imprimir.imprimirFicha(consultarCpf);
                break;
            
            // Opção de serviços de quarto
            case 3:
                boolean sup = true;
                do {
                  System.out.println("1- Limpeza de quarto" + "\n" + "2- Lavanderia");
                  navegacao = sc.nextInt();
                  switch (navegacao) {
                    case 1:
                        System.out.print("Digite o CPF do cliente para solicitar uma limpeza de quarto: ");
                        String cpfLimpeza = sc.next();
                        servicoDeQuarto.limpezaDeQuarto(cpfLimpeza);
                        sup = false;
                        break;
                    
                    case 2:
                        System.out.print("Digite o CPF do cliente para solicitar uma limpeza de quarto: ");
                        String cpfLavanderia = sc.next();
                        servicoDeQuarto.Lavanderia(cpfLavanderia);
                        sup = false;
                        break;
                    default:
                        System.out.println("Opção invalida, tente novamente.");
                        break;
                  }
                } while (sup == true);
                break; 
            
            // Comprar Comida
            case 4:
              System.out.print("Digite o CPF do cliente que deseja comprar: ");
              String cpfClienteComida = sc.next();
              ficha clienteComidaFicha = repositorioFichas.consultarCPF(cpfClienteComida);     
              if (clienteComidaFicha == null) {
                System.out.println("Cliente não encontrado.");
                break;
              }else{
                boolean comprar = true;
                do {
                    System.out.println("\nEscolha o que deseja comprar:");
                    System.out.println("1- Coca Cola: R$ " + frigobar.getPrecoCocaCola()   
                    + "\n2- Energetico: R$ " + frigobar.getPrecoEnergetico() 
                    + "\n3- Chocolate: R$ " + frigobar.getPrecoChocolate() 
                    + "\n4- Salgadinho: R$ " + frigobar.getPrecoSalgadinho()
                    + "\n5- Sair");
                    System.out.print(": ");
                    int comidaEscolhida = sc.nextInt();
                    double preco = 0;
                    switch (comidaEscolhida) {
                      case 1:
                        preco = frigobar.getPrecoCocaCola();
                        System.out.println("\nCoca Cola comprada por R$ " + preco);
                        clienteComidaFicha.setValorPagar(clienteComidaFicha.getValorPagar() + preco);
                        break;
                      
                      case 2:
                        preco = frigobar.getPrecoEnergetico();
                        System.out.println("\nEnergetico comprado por R$ " + preco);
                        clienteComidaFicha.setValorPagar(clienteComidaFicha.getValorPagar() + preco);
                        break;
                      
                      case 3:
                        preco = frigobar.getPrecoChocolate();
                        System.out.println("\nchocolate comprado por R$ " + preco);
                        clienteComidaFicha.setValorPagar(clienteComidaFicha.getValorPagar() + preco);
                        break;

                      case 4:
                        preco = frigobar.getPrecoSalgadinho();
                        System.out.println("\nSalgadinho comprado por R$ " + preco);
                        clienteComidaFicha.setValorPagar(clienteComidaFicha.getValorPagar() + preco);
                        break;

                      case 5:
                        System.out.println("\nVoltando...");  
                        comprar = false;
                        break;

                      default:
                        System.out.println("\nOpção invalida, tente novamente.");
                        break;
                    }
                } while (comprar == true);
              }
              break;
            case 5:
              System.out.print("Digite o CPF do cliente que deseja um guia turistico: ");
              String cpfClienteGuia = sc.next();
              ficha clienteFichaGuia = repositorioFichas.consultarCPF(cpfClienteGuia);
              if (clienteFichaGuia == null) {
                System.out.println("Cliente não encontrado.");
                break;
              } else {
                GuiaTuristico guiaTuristico = new GuiaTuristico(40, 50, 70, 100, repositorioTurismo);
                boolean contratar = true;
                do {
                  System.out.println(
                    "1- Praia: " + guiaTuristico.paraPraia()
                    + "\n2- Cachoeira:" + guiaTuristico.paraCachoeira()
                    + "\n3- Barco: " + guiaTuristico.paraBarco()
                    + "\n4- ilha: " + guiaTuristico.paraIlha()
                    + "\n5- voltar");
                  int lugaresGuia = sc.nextInt();
                  double preco = 0;
                  switch (lugaresGuia) {
                    case 1:
                        preco = guiaTuristico.paraPraia();
                        clienteFichaGuia.setValorPagar(clienteFichaGuia.getValorPagar() + preco);
                        System.out.println("Guia para praia contratado!");
                        contratar = false;
                        break;
                    case 2:
                        preco = guiaTuristico.paraCachoeira();
                        clienteFichaGuia.setValorPagar(clienteFichaGuia.getValorPagar() + preco);  
                        System.out.println("Guia para cachoeira contratado!");
                        contratar = false;
                        break;
                    case 3:
                        preco = guiaTuristico.paraBarco();
                        clienteFichaGuia.setValorPagar(clienteFichaGuia.getValorPagar() + preco); 
                        System.out.println("Guia para passeio em barco contratado!");
                        contratar = false;
                        break;
                    case 4:
                        preco = guiaTuristico.paraIlha();
                        clienteFichaGuia.setValorPagar(clienteFichaGuia.getValorPagar() + preco);
                        System.out.println("Guia para ilha contratado!");
                        contratar = false;
                        break;
                    case 5:
                        System.out.println("voltando...");
                        contratar = false;
                        break;
                    default:
                        System.out.println("Opção invalida, tente novamente.");
                      break;
                  }
                } while (contratar == true);
              }
              break;
            
              // ENCERRAR PROGRAMA
            case 6:
              System.out.println("Saindo...");
              continuar = false;
              break;
           // caso não selecione opção existente
            default:
              System.out.println("Opção invalida, tente novamente");
              break;
          }
      }while(continuar == true);
      sc.close();  
    }
}