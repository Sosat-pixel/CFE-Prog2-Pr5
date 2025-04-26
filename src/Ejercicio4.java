public class Ejercicio4 {
    public static void main(String[] arg){
        entImp(6);


    }

    public static void entImp(int num){
        for(int i = 1;i <= num;i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(i + "-");
            }
        }
        System.out.print(num);
    }

}
