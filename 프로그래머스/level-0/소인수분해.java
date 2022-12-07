// 문제 설명
// 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 따라서 12의 소인수는 2와 3입니다.
// 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

// 제한사항
// 2 ≤ n ≤ 10,000

// 입출력 예
// n result
// 12 [2, 3]
// 17 [17]
// 420 [2, 3, 5, 7]

// 입출력 예 설명
// 입출력 예 #1
// 12를 소인수분해하면 2 * 2 * 3 입니다. 따라서 [2, 3]을 return합니다.

// 입출력 예 #2
// 17은 소수입니다. 따라서 [17]을 return 해야 합니다.

// 입출력 예 #3
// 420을 소인수분해하면 2 * 2 * 3 * 5 * 7 입니다. 따라서 [2, 3, 5, 7]을 return합니다.

class Solution {
    public int[] solution(int n) {
        int count = 0;
        for(int i=1; i<=n; i++){ //약수 개수 구하기
            if(n%i==0){
                count++;
            }
        }
        int[] temp = new int[count];
        int temp2=0;
        for(int i=1; i<=n; i++){ //배열에 약수값 넣기
            if(n%i==0){
                temp[temp2] = i;
                temp2++;
            }
        }
        int[] tempCount = new int[count];
        
        for(int i=0; i<temp.length; i++){ //약수의 약수개수 구하기
            for(int j=1; j<=temp[i]; j++){
                if(temp[i]%j==0){
                    tempCount[i]++;
                }    
            }
        }
        count=0;
        for(int i=0; i<tempCount.length; i++){ //약수가 2개라면 소수!
            if(tempCount[i]==2){
                count++;
            }
        }
        int[] answer = new int[count];
        count=0;
        for(int i=0; i<tempCount.length; i++){ //배열에 소인수값 넣기
            if(tempCount[i]==2){
                answer[count] = temp[i];
                count++;
            }
        }
        return answer;
    }
}
