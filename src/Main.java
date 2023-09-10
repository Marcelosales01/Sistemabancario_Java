import java.util.Scanner;
public class Main {
    private static double saldo = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = sc.nextLine();

        while (true) {
            System.out.println("Bem-vindo "+nome+"!");
            System.out.println("Menu:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = sc.nextInt();

            switch (escolha) {
                        case 1:
                            consultarSaldo();
                        break;
                        case 2:
                            depositar(sc);
                        break;
                        case 3:
                            sacar(sc);
                            break;
                        case 4:
                            transferir(sc);
                            break;
                        case 5:
                            System.out.println("Saindo... Obrigado por usar nosso sistema!");
                            sc.close();
                            System.exit(0);
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                }
            }

            private static void consultarSaldo() {
                System.out.println("Saldo atual: R$" + saldo);
            }

            private static void depositar(Scanner sc) {
                System.out.print("Digite o valor a ser depositado: R$");
                double valor = sc.nextDouble();

                if (valor > 0) {
                    saldo += valor;
                    System.out.println("Depósito efetuado com sucesso!");
                } else {
                    System.out.println("Valor inválido. O valor deve ser maior que zero.");
                }
            }

            private static void sacar(Scanner sc) {
                System.out.print("Digite o valor a ser sacado: R$");
                double valor = sc.nextDouble();

                if (valor > 0 && valor <= saldo) {
                    saldo -= valor;
                    System.out.println("Saque efetuado com sucesso!");
                } else {
                    System.out.println("Saldo insuficiente ou valor inválido.");
                }
            }

            private static void transferir(Scanner sc) {
                System.out.print("Digite o valor a ser transferido: R$");
                double valor = sc.nextDouble();

                if (valor > 0 && valor <= saldo) {
                    System.out.print("Digite o número da conta de destino: ");
                    int contaDestino = sc.nextInt();

                    // Simplesmente uma simulação, já que não estamos realmente transferindo para outra conta.
                    saldo -= valor;
                    System.out.println("Transferência de R$" + valor + " para a conta " + contaDestino + " efetuada com sucesso!");
                } else {
                    System.out.println("Saldo insuficiente ou valor inválido.");
                }
            }
        }
