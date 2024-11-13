import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" ==> Maquina Calculadora <== ");
        System.out.println(" ==> Escolha uma operacao: ");
        System.out.println(" [1] Adicao: ");
        System.out.println(" [2] Subtracao: ");
        System.out.println(" [3] Divisao: ");
        System.out.println(" [4] Multiplicacao: ");
        System.out.println(" [5] Potenciacao: ");
        int escolha = sc.nextInt();
        switch(escolha){
            case 1:
                System.out.println(" ==> Adicao <== ");
                System.out.println(" ==> Insira um numero: ");
                int ad1 = sc.nextInt();
                System.out.println(" ==> Insira outro numero: ");
                int ad2 = sc.nextInt();
                System.out.println(" Efectuar operacao: ");
                System.out.println(" ==> "+ ad1 + " + " + ad2 + " = ");
                int ad_resp= ad1 + ad2;
                System.out.println(" ==> Resultado da operacao: ");
                System.out.println(" ==> "+ ad1 + " + " + ad2 + " = " + ad_resp);
        }

    }
}