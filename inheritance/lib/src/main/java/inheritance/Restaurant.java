package inheritance;

import java.util.ArrayList;

public class Restaurant {
    String name;
    int stars;
    int price;
    ArrayList <Review> listreview = new ArrayList<>();



    public Restaurant(String name,int stars,int price){
        this.name=name;
        this.stars=stars;
        this.price=price;

    }
    public String getName() {
        return name;
    }

    public int stars() {
        return stars;
    }

    public int price() {
        return price;
    }

    public void setStars(int stars) {
       int sum=0;
        int avgStars=0;
        if(stars >=5){
            this.stars = 5;
        }else{
            for(Review revieww:listreview){
                sum+=revieww.numOfstars;
            }
            avgStars =sum/ listreview.size();
            this.stars = avgStars;
        }

    }

    @Override
    public String toString() {
        String newString="";
        for(Review reviww:listreview){
            newString+=reviww.toString();

        }
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price=" + price +
                '}'+newString;
    }
    public  void addReview(String author,String body,int numOfstr){
      Review newreview=new Review(author,body,numOfstr);
       listreview.add(newreview);

       this.setStars(numOfstr);
    }

//    public  void   printReview() {
//for (Review i:listreview){
//    System.out.println("hello from printviewer");
//    System.out.println(i.toString());
//}
//    }
}
