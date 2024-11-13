import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int resp ;
        do{
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
                    break;
                case 2:
                    System.out.println(" ==> Subtracao <== ");
                    System.out.println(" ==> Insira um numero: ");
                    int sub1 = sc.nextInt();
                    System.out.println(" ==> Insira outro numero: ");
                    int sub2 = sc.nextInt();
                    System.out.println(" ==> Efectuar operacao: ");
                    System.out.println(" ==> "+ sub1 + " - " + sub2 + " = ");
                    int sub_resp = sub1 - sub2;
                    System.out.println(" ==> Resultado da operacao: ");
                    System.out.println(" ==> "+ sub1+ " - "+ sub2 + " = "+ sub_resp);
                    break;
                case 3:
                    System.out.println(" ==> Divisao <== ");
                    System.out.println(" ==> Insira um numero: ");
                    double div1 = sc.nextInt();
                    System.out.println(" ==> Insira outro numero: ");
                    double div2 = sc.nextInt();
                    if(div1 == 0){
                        System.out.println(" Math.error");
                        System.out.println(" Numero deve ser diferente de zero ");
                        System.exit(0);
                    }
                    double div_resp = div1 / div2;
                    System.out.println(" ==> Efectuar operacao: ");
                    System.out.println(" ==> "+ div1 + " / " + div2 + " = ");
                    System.out.println(" ==> Resultado da operacao: ");
                    System.out.println(" ==> "+ div1 + " / " + div2 + " = " + div_resp);
                    break;
                case 4:
                    System.out.println(" ==> Multiplicacao <== ");
                    System.out.println(" ==> Insira um numero: ");
                    double mul1 = sc.nextInt();
                    System.out.println(" ==> Insira outro numero: ");
                    double mul2 = sc.nextInt();
                    double mul_resp = mul1 * mul2;
                    System.out.println(" ==> Efectuar operacao: ");
                    System.out.println(" ==> "+ mul1 + " x " + mul2 + " = ");
                    System.out.println(" ==> Resultado da operacao: ");
                    System.out.println(" ==> "+ mul1 + " / " + mul2 + " = " + mul_resp);
                    break;
                case 5:
                    double pot = 1;
                    System.out.println(" ==> Potenciacao <== ");
                    System.out.println(" ==> Insira valor da base: ");
                    int base = sc.nextInt();
                    System.out.println(" ==> Insira valor do espoente: ");
                    int exp = sc.nextInt();
                    if(exp < 0){
                        System.out.println(" O expoente deve ser positivo");
                        System.exit(0);
                    }else {
                        for(int i = 0; i < exp; i++){
                            pot *= base;
                        }
                        System.out.println(" ==> Efectuar operacao: ");
                        System.out.println(" ==> "+ base+"^"+exp + " = ");
                        System.out.println(" ==> Resultado da operacao: ");
                        System.out.println(" ==> "+ base+"^"+exp + " = "+ pot);
                    }
                    break;
                default:
                    System.out.println(" ERROR");
                    System.out.println(" Escolha um numero entre [1] ate [5]");
                    System.exit(0);
            }
            System.out.println(" ========== ");
            System.out.println(" ==> Deseja efectuar mais operacoes? ");
            System.out.println(" [1] SIM");
            System.out.println(" [2] NAO");
            resp = sc.nextInt();
        }while (resp ==1 );
    }
}