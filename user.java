
public class user implements JavaOOPInterface  {
    private String userName;
    private String userPassword;

    

    public user(String nameEmployees, String passEmployees) {
        this.userName = nameEmployees;
        this.userPassword = passEmployees;
    }

    public void checkUserLogin() {
        String[] userNames = {"Aten","jono"};
        String[] userPasswords = {"aten"};

        Employee employee = new Employee(userPassword, userName, userNames, userPasswords);

        for (int i = 0; i < employee.getUserName().length; i++) {
            if (employee.getUserName()[i] == this.userName && employee.getUserPassword()[i] == this.userPassword) {
                System.out.println("Username dan Password Benar");
                return;
            }
        }
        System.out.println("Password dan Username Salah");
    }

    public static String[][] leaveApplication(String[][] inputData ) {

        int numberOfApplication = inputData.length;
        String[][] applicationMessage = new String[numberOfApplication][7];

        String[] labels = {"Employee ID: ", "Jenis Cuti: ", "Tanggal Awal Cuti: ", "Tanggal Akhir Cuti: ", "Status: ", "Keterangan Cuti: ", "Jumlah Pengajuan Cuti: "};

        for (int i = 0; i < numberOfApplication; i++) {
            for (int o = 0; o < labels.length; o++) {
                applicationMessage[i][o] = labels[o] + inputData[i][o];
            }
        }
        return applicationMessage;
    }

    public void  tesStop(){
        System.out.println("Exit Program");
    }


    @Override
    public void leaveApplication() {
        String[][] inputdata = {
            {"E12345", "Annual Leave", "2024-07-20", "2024-07-30", "Pending", "Vacation", "10"},
            {"E12346", "Sick Leave", "2024-08-01", "2024-08-05", "Approved", "Flu", "5"},
            {"E12347", "Maternity Leave", "2024-09-01", "2024-12-01", "Pending", "Childbirth", "90"},
            {"E12348", "Annual Leave", "2024-10-15", "2024-10-20", "Pending", "Family Trip", "5"},
            {"E12349", "Sick Leave", "2024-11-01", "2024-11-10", "Approved", "Surgery", "10"},
            {"E12350", "Annual Leave", "2024-12-15", "2024-12-25", "Pending", "Holiday", "10"}
          };

          String[][] applicationResult = user.leaveApplication(inputdata);

    for(int i = 0; i < applicationResult.length; i++){
        for (int j = 0; j < applicationResult[i].length; j++) {
            System.out.println(applicationResult[i][j]);
        }
        System.out.println();
}
    }
    

}