/**
 * Employee
 */

public class Employee extends user{
    String userName[];
    String userPassword[];
    
    public Employee(String nameEmployee, String passEmployee, String[] userName, String[] userPassword) {
        super(nameEmployee, passEmployee);
        this.userName = userName;
        this.userPassword = userPassword;
    }
    public String[] getUserName() {
        return userName;
    }
    public void setUserName(String[] userName) {
        this.userName = userName;
    }
    public String[] getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String[] userPassword) {
        this.userPassword = userPassword;
    }
    
    

    
}