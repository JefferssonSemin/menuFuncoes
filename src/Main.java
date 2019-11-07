import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Integer numerosDigitados[] = new Integer[10];
        Integer maiorNumero =0;
        Integer fatorial =0;


        for (Integer i = 0; i < 10; i++) {
            String numero = JOptionPane.showInputDialog("Digite seu número");
            numerosDigitados[i] =  Integer.parseInt(numero);
          }



        Integer opcao = lerOpcaoDoMenu();

        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null,"[Programa será encerado!]");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"[Programa será encerado!]");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"[Programa será encerado!]");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"[Programa será encerado!]");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"[Programa será encerado!]");
                break;
            case 6:
                Integer numeros = numerosDigitados[0];
                Integer num = 0;
                for (Integer j = numeros; j != 0; j--){
                    num += numeros * j;
                }
                System.out.println(num/numeros);

                break;
            case 7:
                for(Integer j = 0; j <10; j++){
                    System.out.println(numerosDigitados[j]);
                }
                break;
            case 8:
                for(Integer j = 0; j <10; j++){
                    Integer numeroMaior = numerosDigitados[j];
                    if (numeroMaior > maiorNumero)
                        maiorNumero = numeroMaior;
                }
                System.out.println(maiorNumero);

                break;
            case 9:
                JOptionPane.showMessageDialog(null,"Até mais :D");
                break;
        }

    }

    private static Integer lerOpcaoDoMenu(){
        String menu = "[-------- Menu ---------]";
        menu += "\n[1] - Inverte";
        menu += "\n[2] - Primos";
        menu += "\n[3] - Soma ímpares";
        menu += "\n[4] - Oderna crescente";
        menu += "\n[5] - Ordena descrescente";
        menu += "\n[6] - Fatorial";
        menu += "\n[7] - Mostra";
        menu += "\n[8] - Maior";
        menu += "\n[9] - Sair";
        menu += "\n[ ------------------------- ]";
        menu += "\nInforme sua opcao: ";

        String strOpcao = JOptionPane.showInputDialog(null,menu);

        return Integer.parseInt(strOpcao);
    }
}
