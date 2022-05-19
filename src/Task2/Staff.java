package Task2;

public class Staff extends Person{
    private String profession;
    private float salary;


    public Staff(String profession, float salary) {
        this.profession = profession;
        this.salary = salary;
    }

    public Staff(String name, String address, String profession, float salary) {
        super(name, address);
        this.profession = profession;
        this.salary = salary;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", profession='" + profession + '\'' +
                ", salary=" + salary +
                '}';
    }
}
