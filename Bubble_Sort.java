import java.util.Arrays;

public class Bubble_Sort {

    public static void main(String[] args) {
        int [] n = {5,2,8,1,3,7,6,4};



        System.out.println("Lista Desordenado :" + Arrays.toString(n));

        System.out.println("Lista Ordenado com Bubble Sort" + Arrays.toString(bubbleSort(n)));
    }


    public static int[] bubbleSort(int [] lista){

        int aux;
        boolean controle;//Para parar o comando de repetição quando o vetor estiver ordenado

        for (int i = 0; i< lista.length;i++){

                controle = true;
            //"lista.length-1" é utilizado para que o "j+1" não vá buscar um índice que não existe
            for (int j = 0; j< lista.length -1;j++){
                if (lista[j]>lista[j+1]){
                    aux = lista[j];
                    lista[j]=lista[j+1];
                    lista[j+1] = aux;
                    controle = false;

                }

            }
            if (controle){
                break;
            }

        }

        return lista;

    }
}
