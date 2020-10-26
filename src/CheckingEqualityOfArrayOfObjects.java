import java.util.Arrays;

public class CheckingEqualityOfArrayOfObjects {

    public static void main(String[] args){
        Student[] array1 = {new Student(11, "Gino", "13 kolokuma street"),
                new Student(345, "Eseosa", "19 kalakuta drive"),
                new Student(345, "Eghosa", "mason drive Canada")};

        Student[] array2 = {new Student(111, "Gino", "13 kolokuma street"),
                new Student(345, "Eseosa", "19 kalakuta drive"),
                new Student(345, "Eghosa", "mason drive Canada")};

        System.out.println(Arrays.equals(array1, array2));
    }
}

class Student{
    int rollno;
    String name, address;

    public Student(int rollno, String name, String address){
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return this.rollno == student.rollno && this.name.equals(student.name) && this.address.equals(student.address);
    }
}
