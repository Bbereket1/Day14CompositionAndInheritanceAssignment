import java.util.ArrayList;

public class Employee extends User{
    private ArrayList<Book> isCheckedOut;
    private int ptoDays;
    private String username;
    private String password;


    public Employee(String firstName, String lastName, String email, int userId, boolean isCheckedOut,
                    double balanceUnpaid, boolean isCheckedOut1, int ptoDays, String username, String password) {
        super(firstName, lastName, email, userId, isCheckedOut, balanceUnpaid);
        isCheckedOut1 = false;
        this.ptoDays = ptoDays;
        this.username = username;
        this.password = password;
        balanceUnpaid+=0.1;


    }

    public int getPtoDays() {
        return ptoDays;
    }

    public void setPtoDays(int ptoDays) {
        this.ptoDays = ptoDays;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void overduePayments(int numberOfDaysOverdue) {
        //super.overduePayments(numberOfDaysOverdue);
        this.setBalanceUnpaid(0.1+getBalanceUnpaid());
        System.out.println(getBalanceUnpaid());

    }

}
