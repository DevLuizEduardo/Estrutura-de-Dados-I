import java.util.Arrays;

public class Insertion_Sort {

    public static void main(String[] args) {
        int [] n = {5,2,8,1,3,7,6,4};

        System.out.println("Lista Desordenado :" + Arrays.toString(n));

        System.out.println("Lista Ordenado com Insertion Sort" + Arrays.toString(insertionSort(n)));
    }


     public static int [] insertionSort(int[] lista){

          int aux,j;

          for (int i = 1;i<lista.length;i++){

              aux = lista[i];

            j = i-1;
              while (j >=0 && lista[j] > aux ){

                  lista[j+1] = lista[j];
                  lista[j] = aux;

                  j--;

              }



          }


        return lista;
    }
}
