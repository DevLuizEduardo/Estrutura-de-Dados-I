import java.util.Arrays;

public class Merge_Sort {

    public static void main(String[] args) {
        int [] n = {5,2,4,7,3,6,8,1};

        System.out.println("Lista Desordenado :" + Arrays.toString(n));
        mergeSort(n);
        System.out.println("Lista Ordenada com Merge Sort :"+ Arrays.toString(n));



    }
    public static  void mergeSort(int [] lista){

        int tamanho = lista.length ;

        if(tamanho < 2){

            return;
        }

        int meioIndex = tamanho/2;
        int[]eMeio = new int[meioIndex];
        int[]dMeio = new int[tamanho - meioIndex];

        for(int i = 0; i<meioIndex;i++){
            eMeio[i]=lista[i];

        }

        for(int i = meioIndex; i <tamanho;i++){
            dMeio[i - meioIndex] = lista[i];

        }
        mergeSort(eMeio);
        mergeSort(dMeio);

       organizar(lista,eMeio,dMeio);



    }

    private static void organizar(int[] lista , int[]eMeio,int[] dMeio) {

        int tamanhoE = eMeio.length;
        int tamanhoD = dMeio.length;

        int i =0,j=0,k=0;

        while(i<tamanhoE && j < tamanhoD) {
            if (eMeio[i] < dMeio[j]) {
                lista[k] = eMeio[i];
                i++;

            } else {

                lista[k] = dMeio[j];
                j++;
            }
            k++;
        }
        while (i < tamanhoE){

            lista[k] = eMeio[i];
            i++;
            k++;
        }
        while (j < tamanhoD){

            lista[k] = dMeio[j];
            j++;
            k++;
        }
    }
}
