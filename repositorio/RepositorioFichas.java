package repositorio;

import java.util.ArrayList;
import entities.ficha;

public class RepositorioFichas{
    private ArrayList<ficha> listaFichas;

    public RepositorioFichas(ArrayList<ficha> listaFichas) {
        this.listaFichas = listaFichas;
    }

    public RepositorioFichas() {
        this.listaFichas = new ArrayList<>();
    }

    public ArrayList<ficha> getListaFichas() {
        return listaFichas;
    }

    public void adicionarFicha(ficha ficha) {
        listaFichas.add(ficha);
    }

    public ficha consultarCPF(String cpf){
        for (ficha  ficha : listaFichas) {
            if (ficha.getCpf().equals(cpf)) {
                return ficha;
            }
        }
        return null;
    }
}
