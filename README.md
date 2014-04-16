# Sonix Java Training #1

Javaの基礎知識を身に付けるトレーニングです。

## 前提

このトレーニングを行うにあたって必要となるスキル
  1. IDE の使い方 (Eclipse)
    * 基本操作が分かれば大丈夫です。

## 主な目的
- Javaの基礎を覚える
- プログラミングに慣れる
- アルゴリズムを考える力を養う

## 演習課題

### 1. ループの練習

難易度 : ★

Hello World![改行]を5回出力してください。<br />
ただし、printlnメソッドは1回しか使用してはいけません。<br />
ループ構文(for,while等)を利用して実装します。

<pre>
System.out.println("Hello World!");
System.out.println("Hello World!");
System.out.println("Hello World!");
System.out.println("Hello World!");
System.out.println("Hello World!");
</pre>
というのはダメです。

#### 出力結果例
<pre>
Hello World!
Hello World!
Hello World!
Hello World!
Hello World!
</pre>

### 2. 条件分岐の練習

難易度 : ★

変数number が奇数か偶数か判定し、結果を画面に出力する。

#### 出力結果例
<pre>
10は偶数です
99999は奇数です
802832は偶数です
</pre>

### 3. FizzBuzz

難易度 : ★★

以下のルールに基づいた文字列を画面に出力する<br />
  1. 1〜100までの数を順番に表示する。
  2. その数が3で割り切れるなら "Fizz"、5で割り切れるなら "Buzz"、両方で割り切れるなら "FizzBuzz" と表示する

#### 出力結果例
<pre>
1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz (以下省略...)
</pre>

### 4. うるう年の判定

難易度 : ★★

入力された整数がうるう年であるか判定し、結果を出力する<br />

うるう年のルール<br />
  1. 4で割り切れる年はうるう年
  2. 4で割り切れるけど100でも割り切れる年はうるう年ではない
  3. 4で割り切れるし100でも割り切れるけど、400でも割り切れる年はうるう年

#### 出力結果例
<pre>
1888年はうるう年です
1900年はうるう年ではありません
1996年はうるう年です
2000年はうるう年です
2003年はうるう年ではありません
</pre>

### 5. 3の倍数と3のつく数字の時に

難易度 : ★★★

以下のルールに基づいた文字列を画面に出力する<br />
  1. 1〜100までの数を順番に表示する。
  2. その数が3の倍数、もしくは3のつく数字の時は "Aho" と表示する

#### 出力結果例
<pre>
1 2 Aho 4 5 Aho 7 8 Aho 10 11 Aho Aho 14 Aho 16 17 Aho 19 20 Aho 22 Aho Aho 25 26 Aho 28 29 Aho Aho Aho Aho Aho Aho Aho Aho Aho Aho 40 41 Aho Aho 44 ...
</pre>

### 6. 素数判定

難易度 : ★★★

与えられた数が素数であるかを判定し、結果を画面に出力する。<br />

素数とは
  - 1とその数でしか割り切れない数です。
  - ただし 1は素数としては扱いません。

#### 出力結果例
<pre>
17 は素数です
20 は素数ではありません
99 は素数ではありません
1023 は素数です
</pre>

### 7. 十二支判定

難易度 : ★★★

与えられた数の年(西暦)の十二支を表示する<br />

#### 十二支の求め方
  - (西暦 + 9) / 12 の余りを算出 (2014年なら (2014 + 9) / 12 = 167 余り 7
  - 余りの数値によって十二支が算出される

0 ... 亥<br />
1 ... 子<br />
2 ... 丑<br />
3 ... 寅<br />
4 ... 卯<br />
5 ... 辰<br />
6 ... 巳<br />
7 ... 午<br />
8 ... 未<br />
9 ... 申<br />
10 .. 酉<br />
11 .. 戌<br />

#### 出力結果例
<pre>
1980年は 申年です
1921年は 酉年です
2012年は 辰年です
</pre>

### 8. 累乗

難易度 : ★★★

aのn乗を出力してください。
ただし、Math.powメソッドは使用禁止とします。

#### 出力結果例

<pre>
2の2乗は4です
3の4乗は81です
128の4乗は268435456です
</pre>

### 9. 数当て

難易度 : ★★★★

適当な数値を入力すると正解よりも大きいか小さいかを判定するゲームを作る。<br />

#### ゲームのルール
  - 1〜100の任意の数字を入力します。
  - 正解の数字と入力した数字が一緒であればゲームは終了となります。
  - 正解ではない場合、メッセージを出力します。
    - 誤差が5以下 =>  "少しだけ小さいです!" or "少しだけ大きいです!" と出力
    - 誤差が5より大きい =>  "小さいです..." or "大きいです..." と出力
  - 正解の場合、何か正解っぽいメッセージを出力し、ゲームを終了します。

#### 出力結果例 (ここでは正解を 70 とする)
<pre>
1〜100までの数字を入力してください
> 39
小さいです...
1〜100までの数字を入力してください
> 90
大きいです...
1〜100までの数字を入力してください
> 67
少しだけ小さいです!
1〜100までの数字を入力してください
> 71
少しだけ大きいです!
1〜100までの数字を入力してください
> 70
正解です!!!!!!!!!!!!
</pre>

### 10. あいさつ

難易度 : ★★

このプログラムを実行した時刻に合わせてあいさつを画面に表示する

  - 02:00 〜 06:59 - いい加減寝てください。。
  - 07:00 〜 11:59 - おはようございます！
  - 12:00 〜 12:59 - もうすぐ昼休みだし頑張りましょう
  - 13:00 〜 13:59 - 昼休み中...
  - 14:00 〜 16:59 - 眠いけど頑張りましょう
  - 17:00 〜 18:59 - もう一息頑張りましょう
  - 19:00 〜 22:59 - 今日も一日お疲れさまでした!
  - 23:00 〜 01:59 - おやすみなさい

### 11. 累乗 その2

難易度 : ★★★

aのn乗を出力してください。<br />
Math.powメソッドは使用せずにロジックを考えてください。<br />
a, nが0やマイナスであっても正しい計算結果が出るようにしてください。<br />

#### 出力結果例

<pre>
3の2乗は9です
2の0乗は1です
10の-2乗は0.01です
</pre>

### 12. 3の倍数と3のつく数字の時に その2

難易度 : ★★★

以下のルールに基づいた文字列を画面に出力する<br />
  1. 1〜50までの数を順番に表示する。
  2. その数が3の倍数、もしくは3のつく数字の時はアホっぽく数字をひらがなで表示する

#### 出力結果例
<pre>
1 2 さぁ〜ん！ 4 5 ろぉ〜く!! 7 8 きゅうううう! 10 11 ...
</pre>

アホっぽさの表現は(良識の範囲内で)ご自由にどうぞ。

### 13. じゃんけん

難易度 : ★★★★

コンピュータ2人とじゃんけんをします。
 
勝ち負けがついた時は誰が勝ったか(2人勝ちの時は両方の名前)を画面に表示し終了します。<br />
あいこの場合は決着がつくまでじゃんけんを繰り返します。<br />
コンピュータ2人が何を出すかはもちろんランダムです。<br />

グー、チョキ、パーはそれぞれ

    - グー    ... 1
    - チョキ  ... 2
    - パー    ... 3

とします。

#### 出力結果例

<pre>
グー: 1　チョキ: 2　パー: 3 のいずれかを入力してください。
> 1

You : グー
CPU1: チョキ
CPU2: パー

あいこです。

グー: 1　チョキ: 2　パー: 3 のいずれかを入力してください。
> 2

You : チョキ
CPU1: チョキ
CPU2: グー

CPU2 の勝ちです。
</pre>

### 14. 基数変換 #1

難易度 : ★★★

入力された10進数 n を 2進数に変換し出力してください。<br />
Integer.toBinaryStringメソッドの使用は禁止します。

#### 出力結果例

<pre>
10進数 3   => 2進数 11
10進数 13  => 2進数 1101
10進数 255 => 2進数 11111111
</pre>

### 15. 九九

難易度 : ★★

九九を出力してください。ループを使わずに力技で実装するのはダメです。<br />
mainメソッド内は目安としては10行以内で収まるようにしてください。

#### 出力結果例

<pre>
1x1 = 1 1x2 = 2 1x3 = 3 1x4 = 4 ...
2x1 = 2 2x2 = 4 2x3 = 6 2x4 = 8 ...
...
9x1 = 9 9x2 = 18 ... 9x9 = 81
</pre>

### 16. 完全数

難易度 : ★★★

入力された数値が完全数であるか判定し、結果を画面に出力してください。<br />
完全数については、[こちら](http://ja.wikipedia.org/wiki/%E5%AE%8C%E5%85%A8%E6%95%B0)を参照のこと。

#### 出力結果例

<pre>
6は完全数です。
18は完全数ではありません。
28は完全数です。
496は完全数です。
</pre>

### 17. 星座

難易度 : ★★★

入力された月日に該当する星座を判定し、結果を画面に出力してください。<br />
月日の入力方法について特に制限事項はありません。<br />
"12/24"のように文字列で入力してもいいですし、月、日を2回に分けて入力し受け取っても良いです。<br />
8 31 のように半角スペース区切りで入力するのでもよいです。ご自由にどうぞ。<br />

|星座名|誕生日|
|:-:|:-:|
|牡羊座|3月21日  〜 4月20日生まれ|
|牡牛座|4月21日  〜 5月20日生まれ|
|双子座|5月21日  〜 6月21日生まれ|
|蟹座|6月22日  〜 7月23日生まれ|
|獅子座|7月24日  〜 8月23日生まれ|
|乙女座|8月24日  〜 9月23日生まれ|
|天秤座|9月24日  〜 10月23日生まれ|
|蠍座|10月24日 〜 11月22日生まれ|
|射手座|11月23日 〜 12月22日生まれ|
|山羊座|12月23日 〜 1月20日生まれ|
|水瓶座|1月21日  〜 2月19日生まれ|
|魚座  |2月20日  〜 3月20日生まれ|

#### 出力結果例

<pre>
1月25日 生まれのあなたは水瓶座です。
3月24日 生まれのあなたは牡羊座です。
12月11日 生まれのあなたは射手座です。
</pre>

### 18. クイズ

難易度 : ★★★★

クイズを行うプログラムを作成してください。仕様は以下の通りとします。

    - 問題はあらかじめ用意されています
    - すべて三択クイズです
    - 用意された問題から、ランダムに1問出題します
    - 1回の起動中に同じ問題が複数回出題されてはいけません
    - ユーザーは正解だと思う番号を入力します
    - 入力後、正解不正解を判定し、その旨を出力します
    - 正解、不正解どちらであっても次の問題へ進みます
    - 5問終わった時点でクイズは終了とし、正解数を出力してプログラムは終了となります

#### 出力結果例

<pre>
Q1. 次のうち、Javaの予約語でないのは？ 1. class 2. do 3. function
> 1
不正解です。

Q2. xxxxx
> 2
正解です!
...
...
これでクイズは終了です。5問中 2問正解でした。
</pre>
