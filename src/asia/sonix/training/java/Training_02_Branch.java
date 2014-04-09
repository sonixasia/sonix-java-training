package asia.sonix.training.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training_02_Branch {

    /**
     * Training 02
     * 
     * 変数number が奇数か偶数か判定し、結果を画面に出力する。
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        int number;

        try {
            System.out.println("数字を入力してください");
            System.out.print("> ");
            String str = input.readLine();
            number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください!!!!!!");
            return;
        } finally {
            input.close();
        }
        
        System.out.println("number = " + number);
        
        // numberが奇数か偶数かに応じて出力するメッセージを変更する
        
    }
}
