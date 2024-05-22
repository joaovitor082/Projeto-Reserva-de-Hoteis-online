package servicos;

import repositorio.RepositorioFichas;
import entities.ficha;

public class ServicoImprimirFicha {
    private RepositorioFichas repositorioFichas;

    public ServicoImprimirFicha(RepositorioFichas repositorioFichas) {
        this.repositorioFichas = repositorioFichas;
    }

    public void imprimirFicha(String cpf) {
        ficha ficha = repositorioFichas.consultarCPF(cpf);
        if (ficha != null) {
            ficha.imprimirFicha();
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}