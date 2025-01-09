package PS001;

public class Employee {
    int id;
    String firstname;
    String lastname;
    String address;
    public class Main{
            public static void getFullName(String firstname,String lastname){
                    System.out.println(firstname+" "+lastname);
        
            }

    }
    public static void main(String[] args) {
        Employee employee = new Employee();
        Main obj = employee.new Main();
        obj.getFullName("sai","charan");
    }
}