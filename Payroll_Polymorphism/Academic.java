
public class Academic extends PayRoll {
    private String name;
    private int salary;

    Academic() {}

    public Academic(String name, int salary) {
        this.name = name;
        this.salary = salary;
        super.adjustSalary(salary);
    }

    public void giveLecture() {
        System.out.println("Giving lecture");
    }
}