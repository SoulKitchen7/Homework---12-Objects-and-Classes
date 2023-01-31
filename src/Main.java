public class Main {
    public static void main(String[] args) {

        Author erichRemarque = new Author("Эрих", "Ремарк");
        System.out.println("Имя - " +erichRemarque.getName());
        System.out.println("Фамилия - " +erichRemarque.getSurname());
        Book threeLoads = new Book("Три товарища", 1936);
        System.out.println("Название книги - " + threeLoads.getTitleOfTheBook()+ " Год издания - " + threeLoads.getYearOfPublication());

        System.out.println("");

        Author mikhailBulgakov = new Author("Михаил", "Булгаков");
        System.out.println("Имя - " +mikhailBulgakov.getName());
        System.out.println("Фамилия - " +mikhailBulgakov.getSurname());
        Book theMasterAndMargarita = new Book("Мастер и Маргарита", 1967);
        System.out.println("Название книги - " + theMasterAndMargarita.getTitleOfTheBook()+ " Год издания - " + theMasterAndMargarita.getYearOfPublication());
        theMasterAndMargarita.setYearOfPublication(1940);
        System.out.println("Название книги - " + theMasterAndMargarita.getTitleOfTheBook()+ " Год издания - " + theMasterAndMargarita.getYearOfPublication());
    }
}