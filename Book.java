import javax.swing.JOptionPane;

public class Book {

    static String[] booksName = {"python", "c", "java", "c++"};

    public static void main(String[] args) {

        Print1("If you want to buy a book, \"Click OK\" and Go to the next step.", "WELCOME TO OUR BOOKS STORE");

        try {

            String userChoice = JOptionPane.showInputDialog(null, "Which book do you want?\nPython, C, Java, C++");

            if (booksName[0].equals(userChoice.toLowerCase())) {
                Print2("You have liked the " + booksName[0] + " programming book.\nClick OK \nGo to the next step");
                calculatePrice(booksName[0]);
            } else if (booksName[1].equals(userChoice.toLowerCase())) {
                Print2("You have liked the " + booksName[1] + " programming book.\nClick OK \nGo to the next step");
                calculatePrice(booksName[1]);
            } else if (booksName[2].equals(userChoice.toLowerCase())) {
                Print2("You have liked the " + booksName[2] + " programming book.\nClick OK \nGo to the next step");
                calculatePrice(booksName[2]);
            } else if (booksName[3].equals(userChoice.toLowerCase())) {
                Print2("You have liked the " + booksName[3] + " programming book.\nClick OK \nGo to the next step");
                calculatePrice(booksName[3]);
            } else {
                Print2("Sorry! You haven't liked any programming book.");
            }

        } catch (NullPointerException e) {
            Print2("You don't want to shopping.");

        }

    }

    static void calculatePrice(String bookName) {
        try {
            String answer = JOptionPane.showInputDialog(null, "Are you a Student, Teacher or Others");
            double price = 450.00;
            if (answer.toLowerCase().equals("student")) {
                price = price - (price * 0.3);
                Print3("Total price 450.00\n30% Discoun for Students", price, -1);
            } else if (answer.toLowerCase().equals("teacher")) {
                price = price - (price * 0.4);
                Print3("Total price 450.00\n40% Discount for Teachers ", price, -1);
            } else {
                Print3("Total price 450.00\nSorry! No Discount", price, -1);
            }

        } catch (NullPointerException e) {
            Print2("You don't want to shopping.");

        }

    }

    static void Print1(String y, String z) {
        JOptionPane.showMessageDialog(null, y, z, -1);

    }

    static void Print2(String x) {
        JOptionPane.showMessageDialog(null, x);

    }

    static void Print3(String a, double b, int c) {
        JOptionPane.showMessageDialog(null, a + "\nTotal Pay = $" + b + "\n\n\n-------THANK YOU FOR SHOPPING FROM OUR BOOK STORE-------", "PAYMENT RECEIPT", c);
    }

}