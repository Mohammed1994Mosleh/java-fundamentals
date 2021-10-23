package inheritance;

import java.util.ArrayList;

public class Review {
    String author;
    String body;
    int numOfstars;
    String movieNmae;
    public Review(String author,String body,int numOfstars){
        this.author=author;
        this.body=body;
        this.numOfstars=numOfstars;
    }
    public Review(String author,String body,int numOfstars,String movieNmae){
        this.author=author;
        this.body=body;
        this.numOfstars=numOfstars;
        this.movieNmae=movieNmae;

    }


    @Override
    public String toString() {
       String  movienamereview;
        if(movieNmae !=null){
            movienamereview=movieNmae;
        }else {
            movienamereview="";
        }

        return "Review{" +
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", numOfstars=" + numOfstars +
                '}'+movienamereview;
    }
}
