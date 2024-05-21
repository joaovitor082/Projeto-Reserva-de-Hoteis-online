package servicos;

import entities.servico;
import entities.ficha;
import repositorio.RepositorioFichas;
import repositorio.RepositorioServicoDeQuarto;

public class ServicoDeQuarto {
    private RepositorioFichas repositorioFichas;
    private RepositorioServicoDeQuarto repositorioServicoDeQuarto;
   
    // construtor com sobrecarga
    public ServicoDeQuarto(RepositorioFichas repositorioFichas, RepositorioServicoDeQuarto repositorioServicoDeQuarto) {
      this.repositorioFichas = repositorioFichas;
      this.repositorioServicoDeQuarto = repositorioServicoDeQuarto;
    }

    // enviar servico para o quarto
    public void enviarServicoParaQuarto(String cpf, String tipoServico) {
        ficha cliente = repositorioFichas.consultarCPF(cpf);
        if (cliente != null) {
          servico NovoServico = new servico(cliente, tipoServico);
          repositorioServicoDeQuarto.adicionarServico(NovoServico);  
          System.out.println("Serviço de " + tipoServico + " enviado para o quarto de: " + cliente.getNome());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
    
    // limpeza de quarto
    public void limpezaDeQuarto(String cpf) {
        enviarServicoParaQuarto(cpf, "limpeza");
    }

    // Lavanderia
    public void Lavanderia(String cpf){
      enviarServicoParaQuarto(cpf, "Lavanderia");
    }
}
