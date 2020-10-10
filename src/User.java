import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int userId;
    private ArrayList<Book> isCheckedOut;
    private double balanceUnpaid;

    public User(String firstName, String lastName, String email, int userId, boolean isCheckedOut, double balanceUnpaid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userId = userId;
        isCheckedOut = true;
        this.balanceUnpaid = balanceUnpaid;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ArrayList<Book> getIsCheckedOut() {
        return isCheckedOut;
    }

    public void setIsCheckedOut(ArrayList<Book> isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    public double getBalanceUnpaid() {
        return balanceUnpaid;
    }

    public void setBalanceUnpaid(double balanceUnpaid) {
        this.balanceUnpaid = balanceUnpaid;
    }

    public void overduePayments(int numberOfDaysOverdue){
        //this.balanceUnpaid += 0.1*balanceUnpaid;
        this.balanceUnpaid += 0.5;
        System.out.println(balanceUnpaid);

    }
//    public void overduePayments(){
//        this.balanceUnpaid += 0.1;
//        System.out.println(balanceUnpaid);
//    }



}
