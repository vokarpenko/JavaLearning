package styd;
import java.util.ArrayList;
import java.util.Comparator;

public class StudentList {
    ArrayList<styd> sl;

    StudentList() {
        sl = new ArrayList<styd>();
    }

    void add(styd s) {
        sl.add(s);
    }

    void del(String s) {
        int n = -1;
        for (int i = 0; i < sl.size(); i++) {
            if (sl.get(i).getFio().equalsIgnoreCase(s)) {
                n = i;
            }
            if (n == -1) System.out.println("Такого нет");
            else sl.remove(n);
        }
    }

    void print() {
        for (int i = 0; i < sl.size(); i++)
            System.out.println(sl.get(i).toString());
    }
    void sort ()
    {
        sl.sort(new Comparator<styd>() {
            @Override
            public int compare(styd o1, styd o2) {
                if (o1.getAge()==o2.getAge())
                return 0;
                else if (o1.getAge()<o2.getAge())
                    return -1;
                else
                    return 1;
        }
        });
    }
}

