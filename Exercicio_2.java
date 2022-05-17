public class Exercicio_2 {

    //Qt2-Imprima o mesmo vetor de forma normal e inversa usando recursividade

    public static void main(String[] args) {
        String a[] = {"A","B","C","D","E"};
        int fim = 0;


        System.out.println("Inicio ----->Fim");
        imprimir(a,fim,false);
        System.out.println("\n Fim ----->Inicio");
        imprimir(a,fim,true);
    }

    public static String imprimir(String [] a,int fim , boolean marchaRe){

        if (fim < 0 || fim == a.length){
            return null;

        }

if(marchaRe == true) {

    int v = a.length-1;


                System.out.print("\t"+a[v - fim]);
            return imprimir(a,fim+1, marchaRe);


}else {

    System.out.print("\t"+a[fim]);

    return imprimir(a,fim+1, marchaRe);


}

    }
}
