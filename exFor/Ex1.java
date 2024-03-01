package exFor;

public class Ex1 {
    public static void main(String[] args) {
        int limit = 200;
        System.out.println("Os números ímpares entre 100 e " + limit + " são: " );
        for (int begin = 100; begin <= limit; begin++) {
            int result = begin % 2;
            if (result > 0) {
                System.out.println(begin);
            }
        }
    }
}
