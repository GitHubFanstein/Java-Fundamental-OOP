/**
 * Employee
 */

public class Employee extends user{
    private String nameEmployee;

    public Employee(String userName, String userPassword, String nameEmployee) {
        super(userName, userPassword);
        this.nameEmployee = nameEmployee;
    }


    @Override
    public void checkUserLogin(){

      if(Employee.super.getUserPassword() == "Aten123" && Employee.super.getUserName() == "Aten"){
        System.out.println("berhasil Login " + nameEmployee);
      } else{
        System.out.println("gagal Login " + nameEmployee);
      }
    }

    

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public void leaveApplication(String empID) {
        String[][] inputdata = {
            {empID, "Annual Leave", "2024-07-20", "2024-07-30", "Pending", "Vacation", "10", nameEmployee} 
          };

          String[][] applicationResult = user.leaveApplication(inputdata);

    for(int i = 0; i < applicationResult.length; i++){
        for (int j = 0; j < applicationResult[i].length; j++) {
            System.out.println(applicationResult[i][j]) ;
        }
        System.out.println();
}
    }
}