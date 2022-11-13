// 문제 설명
// 문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

// 제한사항
// 1 ≤ str1의 길이 ≤ 100
// 1 ≤ str2의 길이 ≤ 100

// 입출력 예
// str1 str2 result
// "ab6CDE443fgh22iJKlmn1o" "6CD" 1
// "ppprrrogrammers" "pppp" 2

// 입출력 예 설명
// 입출력 예 #1
// "ab6CDE443fgh22iJKlmn1o" str1에 str2가 존재하므로 1을 return합니다.

// 입출력 예 #2
// "ppprrrogrammers" str1에 str2가 없으므로 2를 return합니다.

class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        String str3="";
        String[] st = str1.split("");
        for(int i=0; i<st.length-str2.length()+1; i++){ // 방법1
            for(int j=i; j<i+str2.length(); j++){
                str3 += st[j];
                if(str3.equals(str2)){
                    answer=1;
                }
            }
            System.out.println(str3);
            str3 = "";
        }
        // indexOf() 는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며 만약 찾지 못했을 경우 "-1"을 반환합니다.
        // int result = str1.indexOf(str2); 방법2
        // if(result>=0){
        //     answer = 1;
        // }
        return answer;
    }
}
