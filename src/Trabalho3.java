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
                for (int i = 0; i < numeroColecao; i++)
                {
                    boolean ePrimo = true;
                    int numero = colecao[i];
                    for (int j = 2; j < numero; j++)
                    {
                        if (numero % i == 0)
                        {
                            ePrimo = false;
                        }
                    }

                    if (ePrimo)
                    {
                        System.out.println(colecao[i] + " é primo posição " + i);
                    }
                }
                break;


            case 2:

                for (int i = 0; i < numeroColecao; i++)
                {
                    for (int j = i; j < numeroColecao; j++)
                    {
                        if (colecao[i] % 2 == 1)
                        {
                            if (colecao[j] % 2 == 0)
                            {
                                int valorImpar = colecao[i];
                                colecao[i] = colecao[j];
                                colecao[j] = valorImpar;
                            }
                        }
                    }
                }

                for (int i = 0; i < numeroColecao; i++)
                {
                    System.out.println(colecao[i]);
                }

                break;

            case 3:
                int fatorial = 1;
                for (int n = 1; n <= colecao[0]; n++)
                {
                    fatorial *= n;
                }
                System.out.println(fatorial);

                break;

            case 4:

                for (int i = 0; i < numeroColecao / 2; i++)
                {
                    int tmp = colecao[i];
                    colecao[i] = colecao[numeroColecao - i - 1];
                    colecao[numeroColecao - i - 1] = tmp;
                }

                for (int i = 0; i < numeroColecao; i++)
                {
                    System.out.println(colecao[i]);
                }
                    break;

            case 5:
                for (int i = 0; i < numeroColecao; i++)
                {
                    for (int j = 0; j < numeroColecao; j++)
                    {
                        if (i != j)
                        {
                            if (colecao[i] == colecao[j])
                            {

                                System.out.println("Tem repetido");
                                break;
                            }else
                                System.out.println("Não tem repetido");

                        }
                    }
                }

                break;

            case 6:
                int numeroRepetiuMais = 0;
                int quantidadeRepetiuMais = 0;
                for (int i = 0; i < numeroColecao; i++)
                {
                    int repeticao = 0;
                    for (int j = 0; j < numeroColecao; j++)
                    {
                        if (i != j)
                        {
                            if (colecao[i] == colecao[j])
                            {
                                repeticao++;
                            }
                        }
                    }

                    if (repeticao > quantidadeRepetiuMais)
                    {
                        numeroRepetiuMais = colecao[i];
                        quantidadeRepetiuMais = repeticao;
                    }
                }
                System.out.println("O numero " + numeroRepetiuMais + " e repetiu " + quantidadeRepetiuMais);

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
