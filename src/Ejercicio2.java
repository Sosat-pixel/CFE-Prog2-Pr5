public class Ejercicio2 {
    public static void main(String[] arg) {
        int array[] = {1, 2, 3, 4, 5};
        esMayor(array);
    }

    public static void esMayor(int[] arrayComparar) {
        int elMayor = arrayComparar[0];
        for (int i = 1; i < arrayComparar.length; i++) {
            if (arrayComparar[i] > elMayor) {
                elMayor = arrayComparar[i];
            }
        }
        System.out.println("El número mayor es: " + elMayor);
    }









}
