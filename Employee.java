/**
 * Employee
 */
import java.util.ArrayList;

 class Employee extends user{
    private String nameEmployee;
    private String departemenEmployee;

   

   public Employee(String userName, String userPassword, String nameEmployee, String departemenEmployee) {
        super(userName, userPassword);
        this.nameEmployee = nameEmployee;
        this.departemenEmployee = departemenEmployee;
    }

    public String getDepartemenEmployee() {
        return departemenEmployee;
    }

    public void setDepartemenEmployee(String departemenEmployee) {
        this.departemenEmployee = departemenEmployee;
    }



    public String getNameEmployee() {
        return nameEmployee;
    }


    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

@Override
    public void login(){

      if(super.getUserName() == getUserName() && super.getUserPassword() == getUserPassword()){
        System.out.println("Welcome " + nameEmployee + " To Departement " + departemenEmployee);
      } else{
        System.out.println("You are not  " + nameEmployee + "From Departement " + departemenEmployee);
      }
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

    // array List 
  public void leaveApplication2(String EmpID, String typeOfLeave, String starDate, String endDate, String status, String description, String numberofLeavveApplication, String name ){
    // create an ArrayLIst
    ArrayList<String> storeData = new ArrayList<>();

    // insert element to the ArrayList
    storeData.add("Employee ID : " + EmpID) ;
    storeData.add("Cuti Tahunan : " + typeOfLeave);
    storeData.add("Tanggal Awal Cuti : " + starDate);
    storeData.add("Tanggal Akhir Cuti : " + endDate);
    storeData.add("Status : " + status);
    storeData.add("Keterangan : " + description);
    storeData.add("Jumlah Pengajuan Cuti : " + numberofLeavveApplication);
    storeData.add("Nama Employee : " + name);

    System.out.println( "\n" + "Leave Employe : " + storeData + "\n");

    // access element index with get method
    String element = storeData.get(0);
    String element2 = storeData.get(7);

    System.out.println(element + " dan " + element2 + "\n");

    // Stream
    storeData.stream()
        .filter(e -> e.contains("Status"))
        .forEach(x -> System.out.println(x));
    System.out.println("\n");

    //using the lambda expression
    storeData.forEach((e) -> { 
        System.out.println(e);
    });
    System.out.println("\n");
  }  
    
}