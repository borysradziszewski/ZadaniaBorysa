package Task2;

public class Task2Main {
    public static void main(String[] args) {
        Person student1 = new Student("John", "BC 43", "IT", 1, 1000);
        Person staff = new Staff("Computer Programming", 4500f);
        Person student2 = new Student("Boro", "Pob39b", "Management",3,5);
        System.out.println(student1);
        System.out.println(staff);
        System.out.println(student2);
    }
}
