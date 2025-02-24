public class Iphone implements ReprodutorMusical, AparelhoTelefonico, ExplorarInternet{

    @Override
    public void tocar() {
        System.out.println("Música tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando: " + musica);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida!");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Escutando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Carregado: " + url + "...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Recarregando página");
    }
}
