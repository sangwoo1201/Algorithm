// 문제 설명
// 문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.

// 제한사항
// 1 ≤ my_string의 길이 ≤ 100
// my_string에는 숫자가 한 개 이상 포함되어 있습니다.
// my_string은 영어 소문자 또는 0부터 9까지의 숫자로 이루어져 있습니다. - - -

// 입출력 예
// my_string result
// "hi12392" [1, 2, 2, 3, 9]
// "p2o4i8gj2" [2, 2, 4, 8]
// "abcde0" [0]

// 입출력 예 설명
// 입출력 예 #1
// "hi12392"에 있는 숫자 1, 2, 3, 9, 2를 오름차순 정렬한 [1, 2, 2, 3, 9]를 return 합니다.

// 입출력 예 #2
// "p2o4i8gj2"에 있는 숫자 2, 4, 8, 2를 오름차순 정렬한 [2, 2, 4, 8]을 return 합니다.

// 입출력 예 #3
// "abcde0"에 있는 숫자 0을 오름차순 정렬한 [0]을 return 합니다.

import java.util.*;

class Solution {
    public int[] solution(String my_string) { // 숫자의 개수 확인
        int count=0;
        String[] str = my_string.split("");
        for(int i=0; i<str.length; i++){
            if(str[i].equals("0")||str[i].equals("1")||str[i].equals("2")||str[i].equals("3")||
               str[i].equals("4")||str[i].equals("5")||str[i].equals("6")||str[i].equals("7")||
               str[i].equals("8")||str[i].equals("9")){
                count++;
            }
        }
        int[] answer = new int[count];
        int j = 0;
        for(int i=0; i<str.length; i++){ // 배열에 숫자 값 넣기
            if(str[i].equals("0")||str[i].equals("1")||str[i].equals("2")||str[i].equals("3")||
               str[i].equals("4")||str[i].equals("5")||str[i].equals("6")||str[i].equals("7")||
               str[i].equals("8")||str[i].equals("9")){
                answer[j] = Integer.parseInt(str[i]);
                j++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
