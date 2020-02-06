import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Members part
        Member member1 = new Member(true, "Jens Jensen", "210292-1211");
        Member member2 = new Member(false, "Harald Mikaelsen", "120462-9217");
        Member member3 = new Member(false, "Hanne Pasovski", "151102-1304");

        ArrayList<Member> MemberList = new ArrayList<>();

        MemberList.add(member1);
        MemberList.add(member2);
        MemberList.add(member3);

        System.out.println("\nFITNESS MEMBERS\n");
        System.out.printf("%-20s%-15s%-15s%-15s\n", "Name", "CPR", "Member Type", "Fee");
        System.out.println("********************************************************");
        for (Member member : MemberList) {
            System.out.printf("%-20s%-15s%-15s%-15s\n", member.getName(), member.getCpr(), member.getMemberType(), member.monthlyFee()+",-");
        }
        System.out.println("========================================================\n");

        //Employees part
        Employee admin1 = new Administration("Morten Aggersen", "300382-1579", 5);
        Employee admin2 = new Administration("Isabella Mortensen", "171086-8902", 5);
        Employee admin3 = new Administration("Camilla Dak", "151282-5686", 5);
        Employee instructor1 = new Instructor("Henrik Larsen", "151272-1303", 22);
        Employee instructor2 = new Instructor("Katrine Bodilsen", "170492-1618", 54);
        Employee instructor3 = new Instructor("Anna Pihl", "260700-1802", 69);

        ArrayList<Employee> EmployeeList = new ArrayList<>();

        EmployeeList.add(admin1);
        EmployeeList.add(admin2);
        EmployeeList.add(admin3);
        EmployeeList.add(instructor1);
        EmployeeList.add(instructor2);
        EmployeeList.add(instructor3);

        System.out.println("\nFITNESS EMPLOYEES\n");
        System.out.printf("%-20s%-15s%-20s%-10s%-12s%-15s\n", "Name", "CPR", "Role", "Hours", "Salary", "Paid Vacation");
        System.out.println("**********************************************************************************************");
        for (Employee employee : EmployeeList) {
            System.out.printf("%-20s%-15s%-20s%-10s%-12s%-15s\n", employee.getName(), employee.getCpr(), employee.getClass().getName(),employee.getHour(), employee.getSalary()+",-", employee.getVacation()+" weeks pr. year");
        }
        System.out.println("==============================================================================================\n");

        //Employees and members part
        ArrayList<Person> PersonList = new ArrayList<>();

        PersonList.addAll(EmployeeList);
        PersonList.addAll(MemberList);

        System.out.println("\nEMPLOYEES & MEMBERS Name, CPR & Role\n");
        System.out.printf("%-20s%-15s%-15s\n", "Name", "CPR", "Role");
        System.out.println("**************************************************");
        for (Person person : PersonList) {
            System.out.printf("%-20s%-15s%-15s\n", person.getName(), person.getCpr(), person.getClass().getName());
        }
        System.out.println("==================================================");
    }
}
