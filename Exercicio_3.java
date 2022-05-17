public class Exercicio_3 {

    public static void main(String[] args) {

        //Qt3 - Some todos os números primos de um vetor e imprima o total

        int [ ] num ={2,4,7,8,5};

        System.out.println(soma(num,0));



    }

    public static int soma (int[] lista,int qtd){

        if(qtd >= 0 && qtd<lista.length){

            int x = lista[qtd];
            if(numPrimo(x)){

                return x + soma(lista,qtd+1);

            }else { return soma(lista,qtd+1);

            }


        }return 0;








    }


    private static boolean numPrimo(int num){

        if (num == 2){
            return true;
        }
        if(num % 2 == 0){

            return false;
        }else{
            return true;
        }



    }
}
