public class Ejercicio6 {
    public static void main(String[] arg){
        onetoN(1,6);
    }

    public static void onetoN (int i, int n){

        if(i > n)
        {
            return;
        }
        System.out.print(i);
        onetoN(i + 1, n);
    }



}
