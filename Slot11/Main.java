package Slot11;

public class Main {
    public static void main(String[] args) {
        News news = new News();

        news.setID(1);
        news.setTitle("News");
        news.setPublishDate("2023-11-27");
        news.setAuthor("Reporter");
        news.setContent("This is a breaking news article!!!");

        news.InputRate();

        news.display();
    }
}
