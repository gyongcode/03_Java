package com.ohgiraffers.section04.comparison;

public class Application1 {
    public static void main(String[] args) {

        // 정수형 비교
        int inum1 = 10;
        int inum2 = 20;
        System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2));
        System.out.println("inum1과 inum2가 같지 않은지 비교 : " + (inum1 != inum2));
        System.out.println("inum1이 inum2보다 큰지 비교 : " + (inum1 > inum2));
        System.out.println("inum1이 inum2보다 크거나 같은지 비교 : " + (inum1 >= inum2));
        System.out.println("inum1이 inum2보다 작은지 비교 : " + (inum1 < inum2));
        System.out.println("inum1이 inum2보다 작은거나 같은지 비교 : " + (inum1 <= inum2));


        // 문자값의 비교는 결국 숫자갑 비교와 동일
        char ch1 = 'a';
        char ch2 = 'A';
        System.out.println("ch1과 ch2가 같은지 비교 : " + (ch1 == ch2));
        System.out.println("ch1과 ch2가 같지 않은지 비교 : " + (ch1 != ch2));
        System.out.println("ch1이 ch2보다 큰지 비교 : " + (ch1 > ch2));
        System.out.println("ch1이 ch2보다 크거나 같은지 비교 : " + (ch1 >= ch2));
        System.out.println("ch1이 ch2보다 작은지 비교 : " + (ch1 < ch2));
        System.out.println("ch1이 ch2보다 작은거나 같은지 비교 : " + (ch1 <= ch2));


        // 논리값 비교
        /* ==과 !=은 비교 가능하지만 대소비교는 불가능하다. */
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("============== 논리값 비교 ===============");
        System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2));
        System.out.println("bool1과 bool2가 같지 않은지 비교 : " + (bool1 != bool2));
        //System.out.println("bool1이 bool2보다 큰지 비교 : " + (bool1 > bool2));
        //System.out.println("bool1이 bool2보다 크거나 같은지 비교 : " + (bool1 >= bool2));
        //System.out.println("bool1이 bool2보다 작은지 비교 : " + (bool1 < bool2));
        //System.out.println("bool1이 bool2보다 작은거나 같은지 비교 : " + (bool1 <= bool2));


        // 문자열 비교
        /* 문자열도 ==과 !=은 비교 가능하지만 대소 비교는 불가능하다. */
        String str1 = "java";
        String str2 = "java";
        System.out.println("============== 문자값 비교 ===============");
        System.out.println("str1과 str2가 같은지 비교 : " + (str1 == str2));  // 문자열과 문자열의 비교로 보이지만 주소값과 주소값의 비교임 (true)
        System.out.println("str1과 str2가 같지 않은지 비교 : " + (str1 != str2));
        //System.out.println("str1이 str2보다 큰지 비교 : " + (str1 > str2));
        //System.out.println("str1이 str2보다 크거나 같은지 비교 : " + (str1 >= str2));
        //System.out.println("str1이 str2보다 작은지 비교 : " + (str1 < str2));
        //System.out.println("str1이 str2보다 작은거나 같은지 비교 : " + (str1 <= str2));

    }
}
