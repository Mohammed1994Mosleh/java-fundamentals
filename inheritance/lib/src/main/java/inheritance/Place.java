package inheritance;

import java.util.ArrayList;

public abstract class Place {
    String name;
    int stars;
    int price;
    ArrayList<Review> listreview = new ArrayList<>();

    public Place(String name){
       this.name=name;
    }

    public void addReview(String author,String body,int numOfstr){
        Review newreview=new Review(author,body,numOfstr);
        listreview.add(newreview);

        this.setStars(numOfstr);
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

    @Override  public String toString() {
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
}
