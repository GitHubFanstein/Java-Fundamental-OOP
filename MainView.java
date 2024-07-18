public class MainView {
    public static void main(String[] args) {
       
      user user = new user(null, null);

      user.checkUserLogin();

    
      Employee employee = new Employee("Aten", "Aten123", "Roni");

      employee.checkUserLogin();
      employee.leaveApplication("11092");
      employee.leaveApplication("12333");

     
    }
}   