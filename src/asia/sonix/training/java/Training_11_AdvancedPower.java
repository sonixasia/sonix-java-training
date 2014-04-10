package asia.sonix.training.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training_11_AdvancedPower {

    /**
     * Training 11
     *  
     * aのn乗を出力してください。
     * Math.powメソッドは使用せずにロジックを考えてください。
     * 
     * a, nが0やマイナスであっても正しい計算結果が出るようにしてください。
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

        int a;
        int n;

        try {
            System.out.println("数字(a)を入力してください");
            System.out.print("> ");
            String str = input.readLine();
            a = Integer.parseInt(str);
                
            System.out.println("数字(n)を入力してください");
            System.out.print("> ");
                
            str = input.readLine();
            n = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください!!!!!!");
            return;
        } finally {
            input.close();
        }

        System.out.println("a = " + a);
        System.out.println("n = " + n);
            
        // aのn乗を出力する
        
    }
}
