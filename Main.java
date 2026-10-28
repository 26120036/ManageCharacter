import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<Character>();
        Character chara1 = new Character(101, "Hero", 50);
        Character chara2 = new Character(102, "Warrior", 80);
        Character chara3 = new Character(103, "Mage", 35);
        Character chara4 = new Character(104, "Haeler", 60);      
        
        list.add(chara1);
        list.add(chara2);
        list.add(chara3);
        list.add(chara4);

        // toStringの動作確認
        // リスト内の各要素を拡張 for 文で順に出力し、toString が正しく機能しているか確認する。
        System.out.println("=== 初期状態のキャラクター一覧 ===");
        for(Character c: list) {
            System.out.println(c);
        }

        // Collections.sortの確認
        // Collections.sort(list) を使用してリストをソートし、レベルが高い順に
        // 並び替えられていることを出力して確認する。
        Collections.sort(list);
        System.out.println("=== レベル降順でソート後 ===");
        for(Character c: list) {
            System.out.println(c);
        }

        // equalsの確認。
        // ID: 101 の新しいインスタンス(Name: "HeroCopy", Level: 50)を作成し、
        //  元の ID: 101(Hero)と equals で比較して true になることを確認する。
        Character chara5 = new Character(101, "HeroCopy", 50);
        System.out.println("=== equals の検証 ===");
        System.out.println("ID: 101 の Hero と HeroCopy は同一 ID ですか?: " + chara5.equals(chara1));

        // cloneの確認
        // ID: 102 (Warrior) の複製(クローン)を作成し、複製されたオブジェクトが出力されることを確認する。

        Character chara2Clone = chara2.clone();
        System.out.println("=== clone の検証 ===");
        System.out.println("複製されたキャラクター:" + chara2Clone);
    }
}
