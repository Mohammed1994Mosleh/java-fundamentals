package inheritance;

public class Review {
    String author;
    String body;
    int numOfstars;


    public Review(String author,String body,int numOfstars){
        this.author=author;
        this.body=body;
        this.numOfstars=numOfstars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", numOfstars=" + numOfstars +
                '}';
    }
}
