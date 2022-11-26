// 문제 설명
// 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
// 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
// 모스부호는 다음과 같습니다.

// morse = { 
//     '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
//     '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
//     '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
//     '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
//     '-.--':'y','--..':'z'
// }

// 제한사항
// 1 ≤ letter의 길이 ≤ 1,000
// return값은 소문자입니다.
// letter의 모스부호는 공백으로 나누어져 있습니다.
// letter에 공백은 연속으로 두 개 이상 존재하지 않습니다.
// 해독할 수 없는 편지는 주어지지 않습니다.
// 편지의 시작과 끝에는 공백이 없습니다.

// 입출력 예
// letter result
// ".... . .-.. .-.. ---" "hello"
// ".--. -.-- - .... --- -." "python"

// 입출력 예 설명
// 입출력 예 #1
// .... = h
// . = e
// .-.. = l
// .-.. = l
// --- = o
// 따라서 "hello"를 return 합니다.

// 입출력 예 #2
// .--. = p
// -.-- = y
// - = t
// .... = h
// --- = o
// -. = n
// 따라서 "python"을 return 합니다.
// a ~ z에 해당하는 모스부호가 순서대로 담긴 배열입니다.
// {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] arr = letter.split(" ");
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(".-")){
                answer += "a";
            }
            if(arr[i].equals("-...")){
                answer += "b";
            }
            if(arr[i].equals("-.-.")){
                answer += "c";
            }
            if(arr[i].equals("-..")){
                answer += "d";
            }
            if(arr[i].equals(".")){
                answer += "e";
            }
            if(arr[i].equals("..-.")){
                answer += "f";
            }
            if(arr[i].equals("--.")){
                answer += "g";
            }
            if(arr[i].equals("....")){
                answer += "h";
            }
            if(arr[i].equals("..")){
                answer += "i";
            }
            if(arr[i].equals(".---")){
                answer += "j";
            }
            if(arr[i].equals("-.-")){
                answer += "k";
            }
            if(arr[i].equals(".-..")){
                answer += "l";
            }
            if(arr[i].equals("--")){
                answer += "m";
            }
            if(arr[i].equals("-.")){
                answer += "n";
            }
            if(arr[i].equals("---")){
                answer += "o";
            }
            if(arr[i].equals(".--.")){
                answer += "p";
            }
            if(arr[i].equals("--.-")){
                answer += "q";
            }
            if(arr[i].equals(".-.")){
                answer += "r";
            }
            if(arr[i].equals("...")){
                answer += "s";
            }
            if(arr[i].equals("-")){
                answer += "t";
            }
            if(arr[i].equals("..-")){
                answer += "u";
            }
            if(arr[i].equals("...-")){
                answer += "v";
            }
            if(arr[i].equals(".--")){
                answer += "w";
            }
            if(arr[i].equals("-..-")){
                answer += "x";
            }
            if(arr[i].equals("-.--")){
                answer += "y";
            }
            if(arr[i].equals("--..")){
                answer += "z";
            }
        }
        return answer;
    }
}
