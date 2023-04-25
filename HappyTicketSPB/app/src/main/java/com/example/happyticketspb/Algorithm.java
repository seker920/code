package com.example.happyticketspb;

public class Algorithm {

    public Algorithm() {
    }

    public static boolean isHappyStPetersburg(int x) {
        int s1 = 0, s2 = 0;
        for (int i = 0; i < 3; i++) {
            s1 += x % 10;
            x = x / 10;
            s2 += x % 10;
            x = x / 10;
        }
        if (s1 == s2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("Введите номер билета.");
        if (isHappyStPetersburg(a))
            System.out.println("Питерский счастливый билет.");
        if (!isHappyStPetersburg(a))
            System.out.println("Обычный билет.");
    }
}

