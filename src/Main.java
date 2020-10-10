public class Main {
    /*
    We're going to take our Library application to the next step. Use what we have learned about composition
    and inheritance to create an application that models a library.

    Start with a Library class with the following fields:

        An ArrayList of Book objects
        An ArrayList of Employee objects
        An ArrayList of User objects

    Add a constructor, getters and setters.



    Create a Book class with the following fields:

        String title
        String author
        int numberOfPages

   Add a constructor, getters and setters.



    Create a User class with the following fields

        String firstName
        String lastName
        String email
        int userId
        ArrayList of Book objects that have been checked out
        double balanceUnpaid

    Add a constructor, getters and setters. Add an additional method called overduePayments()
    that takes an int for the number of days overdue. For each day, add 50 cents to the balanceUnpaid.



    Create an Employee class that is an instance of the User class. (Employees will also have books
    that they check out). Add the following fields:

    int ptoDays
    String username
    String password
    Add a constructor, getters and setters. Add an override the overduePayments() method so that it only increases
    balanceUnpaid by 10 cents per day.


     */

    public static void main(String[] args) {
        User libraryUser = new User ("Bereket", "Bekele", "bere@gmail", 343478, true, 10.4 );
        Employee libraryEmployee = new Employee ("Matt", "Skillman", "mattski@gmail",
                343478, true, 8, false, 5, "Matt21", "Skillman!");

        libraryUser.overduePayments(2);
        libraryEmployee.overduePayments(6);


    }
}

