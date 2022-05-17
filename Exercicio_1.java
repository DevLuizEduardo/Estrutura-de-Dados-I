public class Exercicio_1 {

    //Qt1-Resolva a função com recursividade F(x) = 1/x!+(x*5)!

    public static void main(String[] args) {
        int calculo;
        int x = 1;

        calculo = (fatorial(x)*fatorial((x*5))+1);

        System.out.println(calculo+"/"+fatorial(x));


    }
    public static int fatorial(int x) {

        if (x == 0) {

            return 1;

        } else {

            return x * fatorial(x - 1);


        }


            }

}
