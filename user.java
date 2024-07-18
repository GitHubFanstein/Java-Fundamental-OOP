
public class user implements JavaOOPInterface {
    private String userName;
    private String userPassword;


    public user(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public void checkUserLogin(){
        if(this.userName == null && this.userPassword == null  ){
            System.out.println("gagal");
        }else{
            System.out.println("sukses");
        }
    }

    public static String[][] leaveApplication(String[][] inputData ) {

        int numberOfApplication = inputData.length;
        String[][] applicationMessage = new String[numberOfApplication][8];

        String[] labels = {"Employee ID: ", "Jenis Cuti: ", "Tanggal Awal Cuti: ", "Tanggal Akhir Cuti: ", "Status: ", "Keterangan Cuti: ", "Jumlah Pengajuan Cuti: " , "Nama : " };

        for (int i = 0; i < numberOfApplication; i++) {
            for (int o = 0; o < labels.length; o++) {
                applicationMessage[i][o] = labels[o] + inputData[i][o];
            }
        }
        return applicationMessage;
    }

    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserPassword() {
        return userPassword;
    }


    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public void tesStop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tesStop'");
    }

    @Override
    public void leaveApplication() {
        String[][] inputdata = {
            {"123", "Annual Leave", "2024-07-20", "2024-07-30", "Pending", "Vacation", "10", userName} 
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

    