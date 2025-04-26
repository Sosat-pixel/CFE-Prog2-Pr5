public class Ejercicio8 {
    public static void main(String[] arg){
        System.out.println(validarPassword("2e323213133"));

    }

    public static boolean validarPassword(String clave){

        if(clave.length() >= 8 && clave.length() <= 14)
        {
            return true;
        }else
        {
            return false;
        }

    }

}
