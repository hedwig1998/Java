package Slot11;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng News
        News news = new News();

        // Thiết đặt các thuộc tính
        news.setID(1);
        news.setTitle("News");
        news.setPublishDate("2023-11-27");
        news.setAuthor("Reporter");
        news.setContent("This is a breaking news article!!!");

        // Nhập đánh giá và tính AverageRate
        news.InputRate();

        // Hiển thị thông tin tin tức
        news.display();
    }
}
