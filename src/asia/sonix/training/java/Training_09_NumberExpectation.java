package asia.sonix.training.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Training_09_NumberExpectation {

    /**
     * Training 09
     * 
     * 適当な数値を入力すると正解よりも大きいか小さいかを判定するゲームを作ります。
     */
    public static void main(String[] args) throws IOException {
        Random rnd = new Random();
        // 正解の値 (起動するたびに答えが変わります)
        int answer = rnd.nextInt(100);
        
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        // 入力した値を格納する
        int num;
        
        try {
            System.out.println("1〜100までの数字を入力してください");
            System.out.print("> ");
            String str = input.readLine();
            num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("1〜100までの数字を入力してください!!!!!!");
        }
    }

}
