// 문제 설명
// 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
// 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때,
// A를 밀어서 B가 될 수 있다면 몇 번 밀어야 하는지 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

// 제한사항
// 0 < A의 길이 = B의 길이 < 100
// A, B는 알파벳 소문자로 이루어져 있습니다.

// 입출력 예
// A B result
// "hello" "ohell" 1
// "apple" "elppa" -1

// 입출력 예 설명
// 입출력 예 #1
// "hello"를 오른쪽으로 한 칸 밀면 "ohell"가 됩니다.

// 입출력 예 #2
// "apple"은 몇 번을 밀어도 "elppa"가 될 수 없습니다.

class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String str = "";
        String[] str1 = A.split("");
        String[] str2 = B.split("");
        String[] temp = new String[str1.length];
        if(A.equals(B)){
            answer = 0;
        }
        for(int j=1; j<str1.length; j++){
            temp[0] = str1[str1.length-1];
            str += temp[0];
            for(int i=0; i<str1.length-1; i++){
                temp[i+1] = str1[i];
                str += temp[i+1];
            }
            System.out.println(str);
            if(str.equals(B)){
                answer = j;
            }
            for(int i=0; i<str1.length; i++){
                str1[i] = temp[i];
            }
            str="";
        }
        return answer;
    }
}
