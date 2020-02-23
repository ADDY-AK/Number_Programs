//practical question no 2

import java.util.Scanner;

public class Demo {
    int s = 0;

    public static void main(String[] args) {
        Integer arr[] = new Integer[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Demo d = new Demo();
        System.out.println(d.sum(arr));
        System.out.println(d.average(d.sum(arr), arr.length));

    }

    Integer sum(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        return s;
    }

    Double average(Integer sum, Integer numberOfElements) {
        Double avg = (double) sum / numberOfElements;
        return avg;
    }
}