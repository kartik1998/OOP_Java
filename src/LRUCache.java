import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class LRUCache {
    private Deque<Integer> q = new LinkedList<>();
    private int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if(q.contains(key)){
            update(key);
            System.out.println(key);
            return key;
        }else{
            System.out.println(-1);
            return -1;
        }
    }

    public void put(int key, int value) {
        if(q.contains(key)){
            update(key);
            q.removeLast();
            q.addLast(value);
        }else{
            if(q.size()<this.capacity) {
                q.addLast(value);
            }else{
                q.removeFirst();
                q.addLast(value);
            }
        }
    }

    public void update(int key){
        Stack<Integer> s = new Stack<>();
        while(q.peekLast()!=key){
            s.push(q.removeLast());
        }
        q.removeLast();
        while(!s.isEmpty()){
            q.addLast(s.pop());
        }
        q.addLast(key);
    }
}
class main{
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // returns 1
        cache.put(3, 3);    // evicts key 2
        cache.get(2);       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        cache.get(1);       // returns -1 (not found)
        cache.get(3);       // returns 3
        cache.get(4);
    }
}
