public class HeapItem<Key, Value> {

    public final Key key;
    public Value val;

    public HeapItem(Key key, Value val) {
        this.key = key;
        this.val = val;
    }

}
