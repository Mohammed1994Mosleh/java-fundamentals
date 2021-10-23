package inheritance;

import java.util.ArrayList;

public class Restaurant extends Place {


    public Restaurant(String name,int stars,int price){
      super(name);
        this.stars=stars;
        this.price=price;

    }


    @Override
    public String toString() {
        String newString="";
        for(Review reviww:listreview){
            newString+=reviww.toString();

        }
        return name+"{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price=" + price +
                '}'+newString;
    }
//    public  void addReview(String author,String body,int numOfstr){
//      Review newreview=new Review(author,body,numOfstr);
//       listreview.add(newreview);
//
//       this.setStars(numOfstr);
//    }
}
