import java.util.Arrays;

public class Select_Sort {
    public static void main(String[] args) {

        int [] n = {5,2,8,1,3,7,6,4};

        System.out.println("Lista Desordenada :"+ Arrays.toString(n));
        System.out.println("Lista Ordenada com Selection Sort :"+ Arrays.toString(selectionSort(n)));



    }
    public static int[] selectionSort (int[] lista){

        int n = lista.length;
        int aux;

        for (int posInicial = 0 ; posInicial < n-1; posInicial++){

            int menorNum = posInicial ;

            for (int i = posInicial; i < n;i++){

                if (lista[i]<lista[menorNum]){

                    menorNum = i;

                }
            }
            if(lista[posInicial]>lista[menorNum]){

                aux = lista[posInicial];
                lista[posInicial]=lista[menorNum];
                lista[menorNum] = aux;


            }


        }


        return lista;

    }



}
