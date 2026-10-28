# ManageCharacter
練習課題6 - 5  
  
あなたは、あるオンラインゲームの開発チームに所属するプログラマーです。  
現在、ゲーム内の「キャラクター(Character)」を管理するプログラムを作成しています。  
キャラクターデータが増えてきたため、以下の機能を実装するようチームリーダーから指示が出されました。  
1. 情報の可視化: キャラクター情報を文字列としてきれいに表示する。  
2. 重複チェック: 同一の ID を持つキャラクターかどうかを正確に判定する。  
3. ランキング表示: キャラクターを「レベルの高い順」に並べ替える。  
4. データの複製: キャラクターのバックアップ(複製)を安全に行えるようにする。  
提示されたクラス設計に従って、Character クラスおよび動作確認用の Main クラスを作成しなさい。  
  
【課題の仕様】  
1 Character クラスの実装  
以下のフィールド、インターフェース、メソッドを持つ Character クラスを作成してください。  
• フィールド (private)  
o int id : キャラクターID  
o String name : キャラクター名  
o int level : レベル  
• コンストラクタ  
o Character(int id, String name, int level)  
• 実装するインターフェース  
o Comparable<Character>  
o Cloneable  
• オーバーライドするメソッド  
1. public String toString()  
▪ 返り値の形式: `"ID: [id], Name: [name], Level: [level]"`  
2. public boolean equals(Object obj)  
▪ 判定条件: 引数のオブジェクトが Character 型であり、かつ idが一致していれば true、それ以外は false を返す。  
  
3. public int compareTo(Character other)  
▪ 比較条件: level の降順(レベルが高い順) で整列できるように実装する。  
4. public Character clone()  
▪ Cloneable インターフェースを有効化し、自分自身の複製(浅いコピー)を返せるように実装する。(try-catch でCloneNotSupportedException を処理する)  
  
2 Main クラスの実装 (main メソッド)  
作成した Character クラスを用いて、以下の操作を行う Main クラスを作成してく
ださい。  
1. リストの作成と追加  
o List<Character> を生成し、以下の 4 つのキャラクターオブジェクトを
追加する。
```
▪ ID: 101, Name: "Hero", Level: 50
▪ ID: 102, Name: "Warrior", Level: 80
▪ ID: 103, Name: "Mage", Level: 35
▪ ID: 104, Name: "Healer", Level: 60
```  
2. toString の確認  
o リスト内の各要素を拡張 for 文で順に出力し、toString が正しく機能し
ているか確認する。  
  
3. Collections.sort によるソートの確認  
o Collections.sort(list) を使用してリストをソートし、レベルが高い順に並び替えられていることを出力して確認する。
  
4. equals の確認  
o ID: 101 の新しいインスタンス(Name: "HeroCopy", Level: 50)を作成し、元の ID: 101(Hero)と equals で比較して true になることを確認する。  
5. clone の確認  
o ID: 102 (Warrior) の複製(クローン)を作成し、複製されたオブジェクトが出力されることを確認する。
   
【実行結果】   
```
=== 初期状態のキャラクター一覧 ===
ID: 101, Name: Hero, Level: 50
ID: 102, Name: Warrior, Level: 80
ID: 103, Name: Mage, Level: 35
ID: 104, Name: Healer, Level: 60
=== レベル降順でソート後 ===
ID: 102, Name: Warrior, Level: 80
ID: 104, Name: Healer, Level: 60
ID: 101, Name: Hero, Level: 50
ID: 103, Name: Mage, Level: 35
=== equals の検証 ===
ID: 101 の Hero と HeroCopy は同一 ID ですか?: true
=== clone の検証 ===
複製されたキャラクター: ID: 102, Name: Warrior, Level: 80
```