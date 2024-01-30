package JAVAOOS;
import java.util.Arrays;

class Student {
    private String name;
    private int rollNo;
    private String[] subjects;

    public Student(String name, int rollNo, String[] subjects) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
}

class TabulationSheet {
    private int[] rollNos;
    private int[] marks;

    public TabulationSheet() {
        this.rollNos = new int[0];
        this.marks = new int[0];
    }

    public void addMarks(int rollNo, int mark) {
        int index = indexOf(rollNo);
        if (index == -1) {
            int len = rollNos.length;
            rollNos = Arrays.copyOf(rollNos, len + 1);
            marks = Arrays.copyOf(marks, len + 1);
            rollNos[len] = rollNo;
            marks[len] = mark;
        } else {
            marks[index] = mark;
        }
    }

    private int indexOf(int rollNo) {
        for (int i = 0; i < rollNos.length; i++) {
            if (rollNos[i] == rollNo) {
                return i;
            }
        }
        return -1;
    }

    public void printTabSheet() {
        for (int i = 0; i < rollNos.length; i++) {
            System.out.println("Roll No: " + rollNos[i] + " Marks: " + marks[i]);
        }
    }
}

class MarkSheet {
    private String studentName;
    private int[] marks;

    public MarkSheet(String studentName) {
        this.studentName = studentName;
        this.marks = new int[0];
    }

    public void addMarks(int mark) {
        int len = marks.length;
        marks = Arrays.copyOf(marks, len + 1);
        marks[len] = mark;
    }

    public void printMarkSheet() {
        System.out.println("Student: " + studentName);
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}

public class q12 {
    public static void main(String[] args) {
        Student s1 = new Student("John", 101, new String[]{"Math", "Physics", "Chem", "English", "History"});
        Student s2 = new Student("Alice", 102, new String[]{"Math", "Physics", "Chem", "English", "History"});
        Student s3 = new Student("Bob", 103, new String[]{"Math", "Physics", "Chem", "English", "History"});

        TabulationSheet tMath = new TabulationSheet();
        TabulationSheet tPhysics = new TabulationSheet();
        TabulationSheet tChemistry = new TabulationSheet();
        TabulationSheet tEnglish = new TabulationSheet();
        TabulationSheet tHistory = new TabulationSheet();

        MarkSheet m1 = new MarkSheet(s1.getName());
        MarkSheet m2 = new MarkSheet(s2.getName());
        MarkSheet m3 = new MarkSheet(s3.getName());

        tMath.addMarks(s1.getRollNo(), 90);
        tMath.addMarks(s2.getRollNo(), 85);
        tMath.addMarks(s3.getRollNo(), 92);

        tPhysics.addMarks(s1.getRollNo(), 85);
        tPhysics.addMarks(s2.getRollNo(), 88);
        tPhysics.addMarks(s3.getRollNo(), 75);

        tChemistry.addMarks(s1.getRollNo(), 78);
        tChemistry.addMarks(s2.getRollNo(), 80);
        tChemistry.addMarks(s3.getRollNo(), 95);

        tEnglish.addMarks(s1.getRollNo(), 92);
        tEnglish.addMarks(s2.getRollNo(), 87);
        tEnglish.addMarks(s3.getRollNo(), 90);

        tHistory.addMarks(s1.getRollNo(), 85);
        tHistory.addMarks(s2.getRollNo(), 92);
        tHistory.addMarks(s3.getRollNo(), 88);

        m1.addMarks(90);
        m1.addMarks(85);
        m1.addMarks(78);
        m1.addMarks(92);
        m1.addMarks(85);

        m2.addMarks(85);
        m2.addMarks(88);
        m2.addMarks(80);
        m2.addMarks(87);
        m2.addMarks(92);

        m3.addMarks(92);
        m3.addMarks(75);
        m3.addMarks(95);
        m3.addMarks(90);
        m3.addMarks(88);

        System.out.println("Mark Sheet 1:");
        m1.printMarkSheet();

        System.out.println("\nMark Sheet 2:");
        m2.printMarkSheet();

        System.out.println("\nMark Sheet 3:");
        m3.printMarkSheet();

        System.out.println("\nTabulation Sheet - Math:");
        tMath.printTabSheet();

        System.out.println("\nTabulation Sheet - Physics:");
        tPhysics.printTabSheet();

        System.out.println("\nTabulation Sheet - Chemistry:");
        tChemistry.printTabSheet();

        System.out.println("\nTabulation Sheet - English:");
        tEnglish.printTabSheet();

        System.out.println("\nTabulation Sheet - History:");
        tHistory.printTabSheet();
    }
}
