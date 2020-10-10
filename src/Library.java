import java.util.ArrayList;

public class Library {

    private ArrayList<Book> newBook;
    private ArrayList<Employee> newEmployee;
    private ArrayList<User> newUser;

    public Library(ArrayList<Book> newBook, ArrayList<Employee> newEmployee, ArrayList<User> newUser) {
        this.newBook = newBook;
        this.newEmployee = newEmployee;
        this.newUser = newUser;
    }

    public ArrayList<Book> getNewBook() {
        return newBook;
    }

    public void setNewBook(ArrayList<Book> newBook) {
        this.newBook = newBook;
    }

    public ArrayList<Employee> getNewEmployee() {
        return newEmployee;
    }

    public void setNewEmployee(ArrayList<Employee> newEmployee) {
        this.newEmployee = newEmployee;
    }

    public ArrayList<User> getNewUser() {
        return newUser;
    }

    public void setNewUser(ArrayList<User> newUser) {
        this.newUser = newUser;
    }
}

