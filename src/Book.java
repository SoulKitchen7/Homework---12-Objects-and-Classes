public class Book {
    private String titleOfTheBook;
    public int yearOfPublication;

    public Book(String titleOfTheBook, int yearOfPublication) {
        this.titleOfTheBook = titleOfTheBook;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitleOfTheBook() {
        return this.titleOfTheBook;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
