package inheritance;

import java.util.ArrayList;

public class Theater extends Place{

   ArrayList <String > allMovies=new ArrayList<>();

   public Theater(String  name){
        super(name);
    }

    public void addMovie(String movieNmae){
       allMovies.add(movieNmae);
    }
    public void removeMovie(String movieName){
       allMovies.remove(movieName);
    }

    public void displayMovies(){
       for (String movie:allMovies){
           System.out.println(movie);
       }

   }

    public void addReview(String author1,String body1,int numOfstr1,String movieNmae){
       Review newreview1=new Review(author1,body1,numOfstr1,movieNmae);
       listreview.add(newreview1);
       this.setStars(numOfstr1);
   }
public void addReview(String author1,String body1,int numOfstr1){
    Review newreview1=new Review(author1,body1,numOfstr1);
    listreview.add(newreview1);
    this.setStars(numOfstr1);
}
    @Override  public String toString() {

        String newString="";
        for(Review reviww:listreview){
            newString+=reviww.toString();

        }
        return name+"{" +
                "name='" + name + '\'' + '}'+newString;

    }


    }
