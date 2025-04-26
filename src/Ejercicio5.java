public class Ejercicio5 {
    public static void main(String[] arg){
        System.out.println(factRec(5));
    }

    public static int factRec(int fact){

        if(fact == 0)
        {
            return 1;
        }
        return fact * factRec(fact - 1);
    }
}
