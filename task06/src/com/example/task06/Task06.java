package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int i = 0, sum = x + y;

        if (sum == 0) return 1;

        while (sum != 0) {
            i++;
            sum /= 10;
        }

        return i;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
