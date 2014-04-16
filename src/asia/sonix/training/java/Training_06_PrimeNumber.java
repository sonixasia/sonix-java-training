package asia.sonix.training.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training_06_PrimeNumber {

    /**
     * Training 06
     * 
     * 与えられた数が素数であるかを判定し、結果を画面に出力する。
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        long number;
        
        try {
            System.out.println("数字を入力してください");
            System.out.print("> ");
            String str = input.readLine();
            number = Long.parseLong(str);
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください!!!!!!");
            return;
        } finally {
            input.close();
        }
    }

}
