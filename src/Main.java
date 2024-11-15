import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int resp, totA =0, totS=0,totD=0,totM=0,totP=0;
        int respA, respS, respD, respM, respP;
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
                    do{
                        System.out.println(" ==> Adicao <== ");
                        System.out.println(" ==> Insira um numero: ");
                        int ad1 = sc.nextInt();
                        System.out.println(" ==> Insira outro numero: ");
                        int ad2 = sc.nextInt();
                        int ad_resp= ad1 + ad2;
                        System.out.println(" ==> Resultado da operacao: ");
                        System.out.println(" ==> "+ ad1 + " + " + ad2 + " = " + ad_resp);
                        totA++;
                        System.out.println(" =============== ");
                        System.out.println(" ==> [1] Continuar na Funcao: Adicionar  ");
                        System.out.println(" ==> [2] Voltar para o Menu principal ");
                        respA = sc.nextInt();
                    }while(respA == 1);
                    break;
                case 2:
                    do{
                        System.out.println(" ==> Subtracao <== ");
                        System.out.println(" ==> Insira um numero: ");
                        int sub1 = sc.nextInt();
                        System.out.println(" ==> Insira outro numero: ");
                        int sub2 = sc.nextInt();
                        int sub_resp = sub1 - sub2;
                        System.out.println(" ==> Resultado da operacao: ");
                        System.out.println(" ==> "+ sub1+ " - "+ sub2 + " = "+ sub_resp);
                        totS++;
                        System.out.println(" =============== ");
                        System.out.println(" ==> [1] Continuar na Funcao: Subtracao  ");
                        System.out.println(" ==> [2] Voltar para o Menu principal ");
                        respS = sc.nextInt();
                    }while(respS == 1);
                    break;
                case 3:
                    do{
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
                        System.out.println(" ==> Resultado da operacao: ");
                        System.out.println(" ==> "+ div1 + " / " + div2 + " = " + div_resp);
                        totD++;
                        System.out.println(" =============== ");
                        System.out.println(" ==> [1] Continuar na Funcao: Divisao ");
                        System.out.println(" ==> [2] Voltar para o Menu principal ");
                        respD = sc.nextInt();
                    }while(respD == 1);
                    break;
                case 4:
                    do{
                        System.out.println(" ==> Multiplicacao <== ");
                        System.out.println(" ==> Insira um numero: ");
                        double mul1 = sc.nextInt();
                        System.out.println(" ==> Insira outro numero: ");
                        double mul2 = sc.nextInt();
                        double mul_resp = mul1 * mul2;
                        System.out.println(" ==> Resultado da operacao: ");
                        System.out.println(" ==> "+ mul1 + " x " + mul2 + " = " + mul_resp);
                        totM++;
                        System.out.println(" =============== ");
                        System.out.println(" ==> [1] Continuar na Funcao: Multiplicacao ");
                        System.out.println(" ==> [2] Voltar para o Menu principal ");
                        respM = sc.nextInt();
                    }while(respM == 1);
                    break;
                case 5:
                    do{
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
                            System.out.println(" ==> Resultado da operacao: ");
                            System.out.println(" ==> "+ base+"^"+exp + " = "+ pot);
                        }
                        totP++;
                        System.out.println(" =============== ");
                        System.out.println(" ==> [1] Continuar na Funcao: Potenciacao ");
                        System.out.println(" ==> [2] Voltar para o Menu principal ");
                        respP = sc.nextInt();
                    }while(respP == 1);
                    break;
                default:
                    System.out.println(" ERROR");
                    System.out.println(" Escolha um numero entre [1] ate [5]");
                    System.exit(0);
            }
            System.out.println(" ========== ");
            System.out.println(" ==> Deseja efectuar mais operacoes? ");
            System.out.println(" [1] Menu Principal");
            System.out.println(" [2] Sair do Programa");
            resp = sc.nextInt();
        }while (resp ==1 );
        int TOTAL = totA + totD + totM + totP + totS;
        System.out.println(" ============ ");
        System.out.println(" ==>  Estatisticas de utilizacao <== ");
        System.out.println(" ==> Total de vezes usada para somar: "+ totA);
        System.out.println(" ==> Total de vezes usada para subtrair: "+ totS);
        System.out.println(" ==> Total de vezes usada para Dividir: "+ totD);
        System.out.println(" ==> Total de vezes usada para Multiplicar: "+ totM);
        System.out.println(" ==> Total de vezes usada para Potencializar: "+ totP);
        System.out.println(" ==> Total de Vezes usada: "+ TOTAL);
        if(TOTAL <= 1){
            System.out.println(" ==> Uso: Baixo");
        } else if (TOTAL <= 3) {
            System.out.println(" ==> Uso: Moderado");
        } else if (TOTAL <= 5) {
            System.out.println(" ==> Uso: Alto");
        }else {
            System.out.println(" ==> Uso: Extremo");
        }
        System.out.println();
        System.out.println(" =====> FIM <===== ");
        System.out.println(" ==> Araozinx Dev <== ");
    }
}