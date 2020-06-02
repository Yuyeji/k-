import java.util.*;

public class Main {

    public static void main(String[] args){

    }

    class Solution{
        public int[] solution(int[] array, int[][] commands){
            int[] answer = new int[commands.length];    //commnads의 길이 만큼 반환 값 설정
            /*for(int i = 0 ; i < commands.length ; i++){
                int temp[] = new int[commands[i][1] - commands[i][0] + 1];
                for(int j = 0 ; j < temp.length ; j++)
                    temp[j] = array[commands[i][0] - 1 + j];
                Arrays.sort(temp);
                answer[i] = temp[commands[i][2]];
            }*/
            for(int i = 0 ; i < commands.length ; i++){
                int temp[] = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);   //copyOfRange(배열, 시작인덱스, 종료인덱스) 메소드는 시작인덱스는 포함하고, 종료인덱스는 포함하지 않는다.
                Arrays.sort(temp);
                answer[i] = temp[commands[i][2]-1];
            }

            return answer;
        }
    }
}

