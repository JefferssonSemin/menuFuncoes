import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Integer contador = 1;

        Integer numerosDigitados[] = new Integer[11];
        Integer posicaoMaiorNumero =0;
        Integer maiorNumero =0;
        Integer somaImpares =0;

        Integer fatorial =0;
        int aux = 0;
        int i = 0;


        for (i = 1; i < 11; i++) {
            String numero = JOptionPane.showInputDialog("Digite seu número");
            numerosDigitados[i] =  Integer.parseInt(numero);
        }

        while (contador > 0){
            Integer opcao = lerOpcaoDoMenu();

            switch (opcao) {
            case 1:
                for(Integer j = 10; j> 0; j --){
                    System.out.println(numerosDigitados[j]);
                }
                break;
            case 2:
                for(Integer j = 1; j< 11; j ++){
                    Integer numero = numerosDigitados[j];
                    if (numero ==1)continue;
                        if (ehPrimo(numero))
                            System.out.println(numero);
                }
                break;
            case 3:
                for(Integer j = 1; j< 11; j ++){
                    Integer numero = numerosDigitados[j];
                    if(j % 2 != 0)
                        somaImpares = somaImpares + numero;
                }
                JOptionPane.showMessageDialog(null,"A soma das posições ímpares da coleção é "+ somaImpares);
                somaImpares = 0;
                break;
            case 4:
                for(i = 0; i<11; i++){
                    for(int j = 0; j<10; j++){
                        if(numerosDigitados[j]!= null) {
                            if (numerosDigitados[j] > numerosDigitados[j + 1]) {
                                aux = numerosDigitados[j];
                                numerosDigitados[j] = numerosDigitados[j + 1];
                                numerosDigitados[j + 1] = aux;
                            }
                        }
                    }
                }
                break;
            case 5:
                for(i = 0; i<11; i++){
                    for(int j = 0; j<10; j++){
                        if(numerosDigitados[j]!= null) {
                            if (numerosDigitados[j] < numerosDigitados[j + 1]) {
                                aux = numerosDigitados[j];
                                numerosDigitados[j] = numerosDigitados[j + 1];
                                numerosDigitados[j + 1] = aux;
                            }
                        }
                    }
                }
                break;
            case 6:
                Integer numeros = numerosDigitados[1];
                Integer num = 0;
                for (Integer j = numeros; j > 0 ; j--){
                        num = numeros * j;
                        numeros = num;
                }
                JOptionPane.showMessageDialog(null,"O fatorial do primeiro numero da coleção é "+ num/numerosDigitados[1]);

                break;
            case 7:
                for(Integer j = 0; j <11; j++){
                    if( numerosDigitados[j] != null) {
                        System.out.println(numerosDigitados[j]);
                    }
                }
                break;
            case 8:
                for(Integer j = 1; j <11; j++){
                        Integer numeroMaior = numerosDigitados[j];
                        if (numeroMaior > maiorNumero) {
                            maiorNumero = numeroMaior;
                            posicaoMaiorNumero = j;
                        }
                }
                JOptionPane.showMessageDialog(null,"A posição do maior número é "+posicaoMaiorNumero);
                posicaoMaiorNumero =0;
                break;
            case 9:
                JOptionPane.showMessageDialog(null,"Até mais :D");
                contador--;
                break;
            }
        }
    }

    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {

            if (numero % j == 0)
                return false;
        }
        return true;
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
