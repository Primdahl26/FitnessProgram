public class Administration extends Employee {

    public Administration(String name, String cpr, int vacation){
        super(name, cpr);
        setVacation(vacation);
        setSalary(23000);
        setHour(37*4);
    }

    public Administration(){
    }
}