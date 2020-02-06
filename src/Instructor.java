public class Instructor extends Employee {

    public Instructor(String name, String cpr, int hour) {
        super(name, cpr);

        int hourlyrate = 456;

        setSalary(hour* hourlyrate);
        setHour(hour);
    }
}