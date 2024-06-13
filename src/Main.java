import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int days = 10;
        int[][] meetings = {{5,7},{1,3},{9,10}};
        int i = countDays(days, meetings);
        System.out.println(i);

    }
    public static int countDays(int days, int[][] meetings) {
        int[] temp = new int[days + 1];
        int count = 0;
        for(int i = 0;i<=days;i++){
            temp[i] = 0;
        }
        int len = meetings.length;
        for(int i = 0;i<len;i++){
            for(int j = meetings[i][0]; j <= meetings[i][1];j++){
                temp[j-1]++;
            }
        }
        for(int i = 0;i<=days;i++){
            if(temp[i] == 0)count++;

        }
        return count - 1;
    }


}