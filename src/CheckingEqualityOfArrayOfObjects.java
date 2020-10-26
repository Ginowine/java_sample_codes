public class CheckingEqualityOfArrayOfObjects {

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
        return this.rollno == student.rollno && this.name == student.name && this.address == student.address;
    }
}
