import javax.swing.*;

import static java.lang.Integer.*;

public class Trabalho3 {
    public static void main(String[] args) {

        int numeroColecao = parseInt(JOptionPane.showInputDialog("Digite o tamanho da colecao"));
        int[] colecao = new int[numeroColecao];
        boolean repetido = false;

        for (int i = 0; i< numeroColecao; i++){
            colecao[i] = parseInt(JOptionPane.showInputDialog("Digite um numero"));
        }

        int menu = lerOpcaoDoMenu();

        switch (menu){

            case 1:

                break;


            case 2:

                break;

            case 3:

                break;

            case 4:
                for (int i = numeroColecao; i != 0; i--) {
                    System.out.println(colecao[i]);
                }
                    break;

            case 5:
                for (int i = 0; i< numeroColecao; i++){
                    for (int j = 1; i< numeroColecao; i++){
                        if (colecao[i] == colecao[j]){
                            repetido = true;
                        }
                    }
                }
                System.out.println(repetido);

                break;

            case 6:
                if (true){

                }else{
                    System.out.println(colecao[0]);
                }
                break;

            case 7:
                for (int i = 0; i< numeroColecao; i++){
                    System.out.println(colecao[i]);
                }
                break;

            case 8:
                System.out.println("Adeus");
                break;
        }
    }

    private static Integer lerOpcaoDoMenu(){
        String menu = "[-------- Menu ---------]";
        menu += "\n[1] - Primos";
        menu += "\n[2] - Pares na frente";
        menu += "\n[3] - Fatorial primeiro";
        menu += "\n[4] - Inverte";
        menu += "\n[5] - Tem repetido";
        menu += "\n[6] - Quem mais";
        menu += "\n[7] - Mostra";
        menu += "\n[8] - Vaza";
        menu += "\n[ ------------------------- ]";
        menu += "\nInforme sua opcao: ";

        String strOpcao = JOptionPane.showInputDialog(null,menu);

        return Integer.parseInt(strOpcao);
    }

}
