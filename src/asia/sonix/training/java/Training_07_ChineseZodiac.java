package asia.sonix.training.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training_07_ChineseZodiac {

    /**
     * Training 07
     * 
     * 与えられた数の年(西暦)の十二支を表示する
     * 
     * 十二支の求め方
     * (西暦 + 9) / 12 の余りを算出
     *      => (2014年なら (2014 + 9) / 12 = 167 余り 7
     * 余りの数値によって十二支が算出される
     * 
     * あまり  干支
     * --------------
     * 0 ...... 亥
     * 1 ...... 子
     * 2 ...... 丑
     * 3 ...... 寅
     * 4 ...... 卯
     * 5 ...... 辰
     * 6 ...... 巳
     * 7 ...... 午
     * 8 ...... 未
     * 9 ...... 申
     * 10 ..... 酉
     * 11 ..... 戌
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
        
        // 十二支を判定し、メッセージを出力する
        // ただし、if文で12通りの分岐をすべて判定するような実装は禁止です。
        // もう少しシンプルな実装にしましょう。
        
        
    }
}
