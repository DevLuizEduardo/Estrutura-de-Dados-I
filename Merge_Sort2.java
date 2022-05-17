import java.util.Arrays;

public class Merge_Sort2 {
    public static void main(String[] args) {
        int [] a = {5,2,8,1,7,4,6};
        int[] aux = new int[a.length];

        System.out.println("Lista Desordenado :" + Arrays.toString(a));
        mergeSort(a,aux,0,a.length-1);

        System.out.println(Arrays.toString(a));
    }

    private static void mergeSort(int[] lista,int[] aux,int inicio ,int fim){

        if(inicio<fim){
            int meio = (inicio+fim)/2;
            mergeSort(lista,aux,inicio,meio);
            mergeSort(lista,aux,meio+1,fim);
            intercalar(lista,aux,inicio,meio,fim);
        }


    }

    private static void intercalar(int[] lista, int[] aux, int inicio, int meio, int fim) {





        int esq = inicio;
        int dir = meio + 1;

        for (int i = inicio; i < fim; i++) {

            if (aux[esq] < aux[dir]) {
                aux[i] = lista[esq];
                esq++;
            } else {
                aux[i] = lista[dir];
                dir++;

            }
            if (esq < meio) {
                aux[i] = lista[dir++];
            }
            if (dir < fim) {
                aux[i] = lista[esq++];
            }

        }

    }


}
