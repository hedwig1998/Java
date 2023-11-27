package Slot11;
import java.util.Scanner;
public class News implements lNews {
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    private int[] RateList = new int[5];

    public int getID(){
        return ID;
    }
    public void setID(int i){
        this.ID = ID;
    }
    public String getTitle(){
        return Title;
    }
    public void setTitle(String breakingNews){
        this.Title = Title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String date) {
        this.PublishDate = PublishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String reporter) {
        this.Author = Author;
    }
    public String getContent(){
        return Content;
    }
    public void setContent(String s){
        this.Content = Content;
    }
    public float getAverageRate(){
        return AverageRate;
    }

    @Override
    public void display() {
        System.out.println("Title: "+ Title);
        System.out.println("PublishDate: "+ PublishDate);
        System.out.println("Author:" + Author);
        System.out.println("Average Rate:" + AverageRate);
    }

    public void calculate(){
        float n = 0;
        for(float rate : RateList){
            n += rate;
        }
        AverageRate = n/RateList.length;
    }

    public void InputRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao danh gia cua ban: ");
        for (int i = 0; i < RateList.length; i++){
            System.out.print("Rate " + (i + 1) + ": ");
            RateList[i] = scanner.nextInt();
        }
        scanner.close();
        calculate();
    }
}
