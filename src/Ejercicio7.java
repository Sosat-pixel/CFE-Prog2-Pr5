public class Ejercicio7 {
    public static void main(String[] arg){
        onetoNsuma(0,1,5);
    }

    public static void onetoNsuma (int suma,int i, int n){

        if(i > n)
        {
            return;
        }
        suma = suma + i;
        onetoNsuma(suma,i+1,n);
        System.out.println(suma);
    }

}

