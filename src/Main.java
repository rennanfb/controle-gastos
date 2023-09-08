import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double saldoDisponivel = 2500.00;
        double valorRecebido = 0;
        double valorTransferir = 0;
        String nomeCliente = ("Rennan Fernandes");
        String tipoConta = ("Corrente");

        String dados = ("Dados iniciais do cliente:");
        String dadosNome =  ("Nome: " + nomeCliente);
        String dadosConta = ("Conta: " + tipoConta);
        String dadosSaldo = ("Saldo: R$ " + saldoDisponivel);

        System.out.println("*****************************");
        System.out.println(dados);
        System.out.println(dadosNome);
        System.out.println(dadosConta);
        System.out.println(dadosSaldo);
        System.out.println("*****************************");

        Scanner leitura = new Scanner (System.in);


        for (int operacao = 1; operacao != 0; operacao++) {
            System.out.println("""
                
                Operações
                
                1- Consultar valor
                2- Receber valor
                3- Transferir valor
                4- sair
                """);
            int opcaoSelecionada = leitura.nextInt();

            if (opcaoSelecionada == 1) {
                System.out.println("Saldo atual: R$ " + saldoDisponivel);
            }
            if (opcaoSelecionada == 2) {
                System.out.println("Qual o valor a ser recebido?");
                valorRecebido = leitura.nextDouble();
                saldoDisponivel += valorRecebido;
                System.out.println("Saldo atual: R$ " + saldoDisponivel);
            }
            if (opcaoSelecionada == 3) {
                System.out.println("Quanto será removido da conta?");
                valorTransferir = leitura.nextDouble();
                saldoDisponivel -= valorTransferir;
                System.out.println("Saldo atual: R$ " + saldoDisponivel);
            }
            if (opcaoSelecionada == 4) {
                System.out.println("Saldo atual: R$ " + saldoDisponivel);
                System.out.println("Obrigado por usar nossos serviços");
                break;

            } else {
                System.out.println("Opção inválida");
            }

        }
    }
}

