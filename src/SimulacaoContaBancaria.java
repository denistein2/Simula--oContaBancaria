import java.util.Scanner;
import java.text.DecimalFormat;

public class SimulacaoContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    double depositado = scanner.nextDouble();
                    if(depositado>0){
                    saldo += depositado;
                    System.out.println("Saldo atual: " + decimalFormat.format(saldo));
                    }else{
                      System.out.println("Valor inválido.");
                    }
                    break;
                case 2:
                   double saque = scanner.nextDouble();
                    if(saque>saldo){
                    System.out.println("Saldo insuficiente.");
                    
                    }
                    else{
                      saldo = saldo - saque;
                        
                    System.out.println("Saldo atual: " + decimalFormat.format(saldo));
                    }
                      
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
            }
        }
        scanner.close();
    }
}