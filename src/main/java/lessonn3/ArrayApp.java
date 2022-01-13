package lessonn3;

import java.util.Arrays;

public class ArrayApp {

    public static void main(String[] args) {
        invertArray();
        oneHundredArray();
        multiplyOnTwo();
        Diagonal();
        lenInitialValue(5,6);
        MinMax();
        //Summ();
        shift();
    }

        public static int[] invertArray() {
            int[] arr = {1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1};
            System.out.println(Arrays.toString(arr));


            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;

                }
            }
            System.out.println(Arrays.toString(arr));
       return arr; }

    public static void oneHundredArray() {
        int[] arr = new int[100];
       for ( int i=0; i < arr.length; i++)  {
           arr[i] = i+1;
           System.out.print(arr[i]);
       }
        System.out.println();

    }

    public static void multiplyOnTwo()  {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for ( int i =0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        System.out.println();
   }

   public static void Diagonal() {
       int [][] table = new int [5][5];
       int counter = 1;
    for (int i = 0; i < 5; i++) {

        int j;
        for (j = 0; j < table[i].length; j++) {
            table[i][j] = counter;
            counter++;
            if (table[i] == table[j]) {
                counter = 1;
            }

            System.out.print(table[i][j] + " ");
        }
        System.out.println();


    } System.out.println();

    }


    public static int[] lenInitialValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = initialValue; i < len; i++) {
            arr[i] = i;
        }
        System.out.println(arr);
        System.out.println();
        return arr;

    }

    public static void MinMax() {

        int arr[] = {5, 2, 6, 7, 23, 5, 17, 32, 23};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
                     if (arr[i] > max) {
                         max = arr[i];
                            } else if (arr[i] < min) {
                         min = arr[i];
                     }
        }  System.out.println(max + " это максимальное значение массива");
      System.out.println(min + " это миниальное значение массива");
    }
  public static boolean Summ() {
    int[] arr = new int[6];
    int sum = 0;
    int i;
    for (i = 0; i < arr.length; i++) {
        arr[i] = i;
        System.out.print(arr[i]);
    }
    sum += arr[i];
    if (sum % 2 == 0) {
        System.out.println(true);
        return true;
    }  else {
        System.out.println(false);
        return false;
    }



}

    public static void shift() {
        int[] arr = new int[3];
        int n = 1;
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] +  "  ;");

        if (arr[i] == n) {
            arr[i+n] = arr[i];

            if (n>arr.length) {
                n = 0;
            }  n = arr[i+n];
            System.out.print(arr[i] + "  :");}
        }
        }

}

