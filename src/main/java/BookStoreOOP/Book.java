package BookStoreOOP;

public abstract class Book {

    String bookName;
    String authorName;
    int id;
    double usdPrice;

    String euro = "EUR";
    String hrv = "HRV";

    //Constructor
    public Book(String name, String authorName, int id, double price, boolean isAvailable) {
        this.bookName = name;
        this.authorName = authorName;
        this.id = id;
        this.usdPrice = price;
        this.isAvailable = isAvailable;

    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    //Get
    public double getUsdPrice() {
        return usdPrice;
    }

    //Set
    public void setUsdPrice(double usdPrice) {
        this.usdPrice = usdPrice;
    }

    //Get
    public int getId() {
        return id;
    }

    //Set
    public void setId(int id) {
        this.id = id;
    }

    //Get
    public String getAuthorName() {
        return authorName;
    }

    //Set
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    //Get
    public String getBookName() {
        return bookName;
    }

    //Set
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    boolean isAvailable;

    public double convertPrice(String currency) {
        double rate = 1;
        if (currency.equals(euro)) {
            rate = 1.1;
        } else if (currency.equals(hrv)) {
            rate = 40;
        } else {
            System.out.println("Error: unknown currency, USD price will be returned");
        }
        double priceAfterConversion = usdPrice * rate;
        return priceAfterConversion;
    }

    public void printBookDetails() {
        System.out.println("***********************************");
        System.out.println("Book name is: " + bookName);
        System.out.println("Book id is: " + id);
        System.out.println("Book price is: " + usdPrice + " USD,  " + convertPrice(euro) + " EUR,  " + convertPrice(hrv) + " HRV");
        System.out.println("Book is available: " + isAvailable);

    }



}
