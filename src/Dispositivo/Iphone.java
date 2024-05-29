package Dispositivo;

import Dispositivo.AparelhoTelefonico.Discador;
import Dispositivo.NavegadorDeInternet.NavegadorInternet;
import Dispositivo.ReprodutorMusical.ReprodutorMusical;

public abstract class Iphone implements NavegadorInternet, Discador, ReprodutorMusical {
    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Aberta nova aba com url " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Página exibida " + url);
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendendo numero " + numero);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero "+ numero);
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {
        System.out.println("Você tem uma nova mensagem " + mensagem + " do destinatário " + destinatario);
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }
}

