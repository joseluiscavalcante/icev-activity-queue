package icev.estruturadedados.filas.atendimento;

import java.util.Scanner;

public class ChatBot {
    public static int iniciarAtendimentoBot(Cliente cliente) {
        Scanner sc = new Scanner(System.in);

        System.out.println("(BOT): Qual tipo de atendimento você necessita, " + cliente.getNome() + "?");
        System.out.println("Atendimento prioritário...[Digite 1]");
        System.out.println("Atendimento comum.........[Digite 2]");
        return sc.nextInt();
    }
}
