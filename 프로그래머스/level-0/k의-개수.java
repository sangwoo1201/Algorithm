// 문제 설명
// 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
// 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.

// 제한사항
// 1 ≤ i < j ≤ 100,000
// 0 ≤ k ≤ 9

// 입출력 예
// i j k result
// 1 13 1 6
// 10 50 5 5
// 3 10 2 0

// 입출력 예 설명
// 입출력 예 #1
// 본문과 동일합니다.

// 입출력 예 #2
// 10부터 50까지 5는 15, 25, 35, 45, 50 총 5번 등장합니다. 따라서 5를 return 합니다.

// 입출력 예 #3
// 3부터 10까지 2는 한 번도 등장하지 않으므로 0을 return 합니다.

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strK = Integer.toString(k); //int K를 String으로 변환
        for(int temp=i; temp<=j; temp++){
            String temp2 = Integer.toString(temp);
            String[] str = temp2.split("");
            for(int temp3=0; temp3<str.length; temp3++){
                if(str[temp3].equals(strK)){
                    answer++;
                }
            }
        }
        return answer;
    }
}
