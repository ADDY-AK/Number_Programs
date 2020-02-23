//Fee calculation program of private members using getter setter method

import java.util.Scanner;

class Student {
    private int sub1, sub2;

    public Student(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public int getSub1() {
        return sub1;
    }

    public void setSub1(int sub1) {
        this.sub1 = sub1;
    }

    public int getSub2() {
        return sub2;
    }

    public void setSub2(int sub2) {
        this.sub2 = sub2;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of subject in first term");
        int s1 = sc.nextInt();
        System.out.println("enter the no of subject in second term");
        int s2 = sc.nextInt();
        Student s = new Student(s1, s2);
        s.setSub1(s1);
        s.setSub2(s2);
        int n = 0, n1 = 0;
        if (s.getSub1() > 6) {
            n = n + 10 + (s.getSub1() - 6) * 50 + (100 * s.getSub1());
        } else {
            n = n + 10 + (100 * s.getSub1());
        }
        if (s.getSub2() > 6) {
            n1 = n1 + 10 + (s.getSub2() - 6) * 50 + (100 * s.getSub2());
        } else {
            n1 = n1 + 10 + (100 * s.getSub2());
        }
        System.out.println("Total fee=" + (n + n1));
    }

}