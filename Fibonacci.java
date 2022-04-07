public class Fibonacci {


    public int fibo(int n){
        if(n==0){
            return n;

        }else{
            if(n==1){
                return n;

            }else{

                return fibo(n-1)+fibo(n-2);
            }
        }

    }

    public static void main(String[] args) {
       // for (int i = 0,i==30 )

        Fibonacci f = new Fibonacci();

        for (int i = 0 ; i <=6;i++) {
            System.out.print("("+i+")"+f.fibo(i)+"\t");
        }
    }
}
