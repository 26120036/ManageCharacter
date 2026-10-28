public class Character implements Comparable<Character>, Cloneable {
    private int id;
    private  String name;
    private int level;

    // コンストラクタ
    public Character(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    // ID, Name, Levelを返す
    @Override 
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Level: " + level; 
    }

    // 引数のオブジェクトがCharacter型であり、かつidが一致していればtrue、それ以外はfalseを返す。
    public boolean equals(Object obj) {
        if (!(obj instanceof Character)){
            return false;
        }

        Character othercCharacter = (Character) obj; // Carオブジェクトにしてから比較
        return this.id == othercCharacter.id;
    }

    // levelが高い順(降順)で整列
    public int compareTo(Character other) {
        int result = Integer.compare(other.level, this.level);
        return result;
    }

    // Characterの複製
    public Character clone() {
        try {
            Character character = (Character) super.clone();
               return character;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
