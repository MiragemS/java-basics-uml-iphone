import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Iphone cell = new Iphone();

        cell.ligar();
        cell.atender();
        cell.iniciarCorreioDeVoz();
        System.out.println("\n--------------------\n");
        
        cell.exibirPagina("www.google.com");
        cell.adicionarNovaAba();
        cell.atualizarPagina();
        System.out.println("\n--------------------\n");

        cell.selecionarMusica("Mona Lisa - Dominic Fike");
        cell.tocar();
        cell.pausar();
    }

}