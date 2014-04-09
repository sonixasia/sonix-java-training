package asia.sonix.training.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training_04_LeapYear {

    /**
     * Training 04
     * 
     * うるう年の判定
     * 入力された整数がうるう年であるか判定し、結果を出力する
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        // 入力された年が代入されます
        int year;

        try {
            System.out.println("年(西暦)を数字で入力してください");
            System.out.print("> ");
            String str = input.readLine();
            year = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("数字で入力してください!!!!!!");
            return;
        } finally {
            input.close();
        }
            
        System.out.println("year = " + year);
        
        // うるう年かそうでないかを判定し、メッセージを出力する
        
    }
}
