package Hashing;


import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Hash {

    public static void main(String[] args){
        HashMap<String, Integer> student = new HashMap<>();
        student.put("Priya", 3 );
        student.put("Dewa", 8);
        student.put("yawya", 6 );
        student.put("Nawya", 4 );

        Set<String> student_keys = student.keySet();
        for (String i : student_keys){
            System.out.println(student.get(i));
        }

        Set<Map.Entry<String, Integer> > data_set = student.entrySet();
        for (Map.Entry<String, Integer> i: data_set){
            System.out.println(i.getKey()+ " " + i.getValue());
        }
    }
}
