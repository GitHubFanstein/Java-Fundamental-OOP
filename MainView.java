public class MainView {
    public static void main(String[] args) {
       
      user user = new user("Kami", "Kami123");

    //   user.login();

        

    //  Employee employee = new Employee(user.getUserName(), user.getUserPassword(), "Child", "IT");
     Employee employee2 = new Employee(user.getUserName(), user.getUserPassword(), "TIm", "Finance");

    

    //     employee.login();  

    //   employee.leaveApplication("11092");

    employee2.leaveApplication2("9000", "Annual Leave", "2024-07-20", "2024-07-30", "Pending", "Vacation", "10", "Aten");
    
    employee2.leaveApplication2("10101", "Annual Leave", "2024-07-20", "2024-07-30", "Accept", "Vacation", "10", "Rifa");
    
    }
}   