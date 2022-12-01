public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println( " Задание 1 ");
        int [] numbers = new int [3] ;
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        System.out.println( numbers[0] );
        System.out.println( numbers[1] );
        System.out.println(numbers[2]);

        double [] numbers1 = { 1.57, 7.654, 9.986};
        System.out.println( numbers1[0] );
        System.out.println( numbers1[1] );
        System.out.println(numbers1 [2]);


        long [] numbers2 = new long [5];
        numbers2 [0] = 7_000_000_000L ;
        numbers2 [1] = 8_000_000_000L ;
        numbers2 [2] = 9_000_000_000L ;
        numbers2 [3] = 9_500_000_000L ;
        numbers2 [4] = 10_500_000_000L ;
        System.out.println( numbers2[0] );
        System.out.println( numbers2[1] );
        System.out.println(numbers2 [2]);
        System.out.println(numbers2 [3]);
        System.out.println(numbers2 [4]);

        //Задание 2
        System.out.println( " Задание 2 ");

        int [] numbers3 = new int [3];
        numbers3 [0] = 1;
        numbers3 [1] = 2;
        numbers3 [2] = 3;
        System.out.print( numbers3[0] + " , ");
        System.out.print( numbers3[1] + " , ");
        System.out.print(numbers3[2]+ " ; ");

        System.out.println();

        double [] numbers4 = { 1.57, 7.654, 9.986};
        System.out.print( numbers4[0] + " , ");
        System.out.print( numbers4[1] + " , ");
        System.out.print(numbers4 [2] + " ; ");

        System.out.println();

        long [] numbers5 = new long [5];
        numbers5 [0] = 7_000_000_000L ;
        numbers5 [1] = 8_000_000_000L ;
        numbers5 [2] = 9_000_000_000L ;
        numbers5 [3] = 9_500_000_000L ;
        numbers5 [4] = 10_500_000_000L ;
       

        //Задание 3
        System.out.println( " Задание 3 ");

        int [] numbers6 = new int [3];
        numbers6 [0] = 1;
        numbers6 [1] = 2;
        numbers6 [2] = 3;
        for (int i = numbers6.length - 1; i >= 0 ; i--) {
            System.out.print(numbers6 [i] );
            if ( i != 0 ) {
                System.out.print (" , ");
            }
        }

        System.out.println();

        double [] numbers7 = { 1.57, 7.654, 9.986};
        for (int i = numbers7.length - 1; i >= 0 ; i--) {
            System.out.print(numbers7[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }

        System.out.println();

        long [] numbers8 = new long [5];
        numbers8 [0] = 7_000_000_000L ;
        numbers8 [1] = 8_000_000_000L ;
        numbers8 [2] = 9_000_000_000L ;
        numbers8 [3] = 9_500_000_000L ;
        numbers8 [4] = 10_500_000_000L ;
        for (int i = numbers8.length - 1; i >= 0 ; i--) {
            System.out.print(numbers8[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }

        //Задание 4
        System.out.println( " Задание 4 ");

        int [] numbers9 = new int [3];
        numbers9 [0] = 1;
        numbers9 [1] = 2;
        numbers9 [2] = 3;
        for (int i = 0; i < numbers9.length ; i++) {
            if (numbers9[i] % 2 != 0) {
                numbers9 [i]= numbers9[i] + 1;

            }
            System.out.print( numbers9 [i]);
        }




    }
}