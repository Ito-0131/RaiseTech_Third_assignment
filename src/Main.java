import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        // String型のListを作成
        List<String> list = new ArrayList<>();

        // 要素を追加
        list.add("apple");
        list.add("watermelon");
        list.add("orange");

        try {
            // 要素を取得
            System.out.println(list.get(0)); // 出力: "apple"
            System.out.println(list.get(1)); // 出力: "watermelon"
            System.out.println(list.get(2)); // 出力: "orange"
            System.out.println(list.get(3)); // 例外発生：IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println("指定されたインデックスが存在しません。");
        }
    }
}
