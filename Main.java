import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Integer> marks = new HashMap<>();
        marks.put(101, 85);
        marks.put(102, 90);
        marks.put(103, 78);
        marks.put(104, 92);
        marks.put(105, 88);
        System.out.println("Students: " + marks);
        marks.remove(103);
        System.out.println("Marks of 102: " + marks.get(102));
        System.out.println("After changes: " + marks);
    }
}