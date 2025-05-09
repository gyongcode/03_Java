/* 홀수인 양의 정수를 입력 받아 입력 받은 크기 만큼의 정수형 배열을 할당하고
* 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
* 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값 넣어 출력하세요
* 단, 홀수인 양의 정수를 입력하지 않은 경우에는 "양수 혹은 홀수만 입력해야 합니다."를 출력하세요
* -- 입력 예시 --
* 홀수인 양의 정수를 입력하세요 : 7
* -- 출력 예시 --
* 1 2 3 4 3 2 1
* -- 입력 예시 --
* 홀수인 양의 정수를 입력하세요 : 8
* -- 출력 예시 --
* 양수 혹은 홀수만 입력해야 합니다.
3을 입력 받으면 1 2 1        -> 2
5을 입력 받으면 1 2 3 2 1     -> 3
7을 입력 받으면 1 2 3 4 3 2 1   -> 4
9을 입력 받으면 1 2 3 4 5 4 3 2 1  -> 5                */
package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        // 홀수 양의 정수 입력 받기
        System.out.print("홀수인 양의 정수를 입력하세요: ");
        int n = sc.nextInt();

        // 입력 값이 홀수이자 양의 정수인지 확인
        if (n > 0 && n % 2 != 0) {
            int[] arr = new int[n];

            // 배열의 중간까지 오름차순으로 채우기
            int mid = n / 2; // 중간 인덱스
            for (int i = 0; i <= mid; i++) {
                arr[i] = i + 1; // 1부터 시작해서 1씩 증가
            }

            // 배열의 중간 이후부터 내림차순으로 채우기
            for (int i = mid + 1; i < n; i++) {
                arr[i] = n - i; // 내림차순
            }

            // 배열 출력
            for (int i : arr) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
        }

        sc.close(); // Scanner 자원 닫기
    }
}
