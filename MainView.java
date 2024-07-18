public class MainView {
    public static void main(String[] args) {
        user userInstance = new user("jono", "aten");
        userInstance.checkUserLogin();
        userInstance.leaveApplication();
        userInstance.tesStop();
    }
}