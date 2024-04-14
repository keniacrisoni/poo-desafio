package aparelhos.impl;

import aparelhos.interfaces.AparelhoTelefonico;
import aparelhos.interfaces.NavegadorDeInternet;
import aparelhos.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {

    public void ligar() {
        System.out.println("Ligando");
    }

    public void atender() {
        System.out.println("Atendendo o telefone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina() {
        System.out.println("Exibindo pagina da internet");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    public void tocar() {
        System.out.println("Tocando música");
    }

    public void selecionarMusica() {
        System.out.println("Selecionar  música");
    }

    public void pausar() {
        System.out.println("Pausando a música");
    }
}
