public class Book {

    //describe a book, create all the variables we need
    //name, author, id, price in USD, availability
    //using convention rate, calculate EUR price of the book
    //using convention rate, calculate HRV price of the book
    //print all the book details including prices

    String euro = "EUR";
    String hrv = "HRV";

    public static void main(String[] args) {

//        String bookName = "Harry Potter";
//        String authorName = "J.K. Rowling";
//        int id = 1;
//        double priceInUSD = 10.5;
//        boolean isAvailable = true;

        Book book1 = new Book();
        book1.createNewBook("Harry Potter", "J.K. Rowling", 1, 10.5, false);
        book1.createNewBook("Taras Bulba", "T.G. Shevchenko", 2, 12.5, true);
    }

    public void createNewBook(String bookName, String authorName, int id, double priceInUSD, boolean isAvailable) {

        double priceInEUR = calculatetPrice(priceInUSD, euro);
        double priceInHRV = calculatetPrice(priceInUSD, hrv);

        System.out.println("Book name is: " + bookName);
        System.out.println("Book id is: " + id);
        System.out.println("Book price is: " + priceInUSD + " USD, " + priceInEUR + " EUR" + priceInHRV + "HRV");
        System.out.println("Book is available: " + isAvailable);
    }

    public double calculatetPrice(double priceInUSD, String currency) {
        double rate = 1;
        if (currency.equals(euro)) {
            rate = 1.1;
        } else if (currency.equals(hrv)) {
            rate = 40;
        } else {
            System.out.println("Error: unknown currency, USD price will be returned");
        }
        double priceAfterConversion = priceInUSD * rate;
        return priceAfterConversion;
    }
}
