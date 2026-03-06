package Main;

import entities.Iphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Iphone 18 criado! ");

        Iphone iphone18 = new Iphone();
        System.out.println("Testando funcionalidade telefônica dos Iphone 18");
        System.out.print("Digite um número de telefone para fazer a ligação: ");
        String numeroTelefone = teclado.next();
        iphone18.ligar(numeroTelefone);
        iphone18.atender();
        System.out.print("Deseja ouvir o correio de voz (sim/não): ");
        String repostaCorreio = teclado.next();
        if (repostaCorreio.equalsIgnoreCase("sim")) {
            iphone18.iniciarCorreioVoz();
        } else {
            System.out.println("Obrigado por usar nossos serviços!");
        }
        teclado.nextLine();
        System.out.println();
        System.out.println("Testando funcionalidade do reprodutor músical");
        System.out.print("Selecione uma música para ouvir: ");
        String musica = teclado.nextLine();
        iphone18.selecionarMusica(musica);
        System.out.print("Deseja tocar a música selecionada (sim/não): ");
        String repostaTocar = teclado.next();
        if (repostaTocar.equalsIgnoreCase("sim")) {
            iphone18.tocar();
        }
        System.out.print("Deseja pausar a música (sim/não):");
        String repostaPausar = teclado.next();
        if (repostaPausar.equalsIgnoreCase("sim")) {
            iphone18.pausar();
        }
        System.out.println();
        System.out.println("Testando funcionalidades do navegador de internet ");
        System.out.print("Digite o endereço da página que deseja acessar: ");
        String url = teclado.next();
        iphone18.exibirPagina(url);
        System.out.print("Deseja atualizar a página (sim/não): ");
        String repostaAtualizarPagina = teclado.next();
        if (repostaAtualizarPagina.equalsIgnoreCase("sim")) {
            iphone18.atualizarPagina();
        }
        System.out.print("Deseja adicionar nova aba (sim/não):");
        String repostaAdicionaAba = teclado.next();
        if (repostaAdicionaAba.equalsIgnoreCase("sim")) {
            iphone18.adicionarNovaAba();
        }
        teclado.close();
    }
}
