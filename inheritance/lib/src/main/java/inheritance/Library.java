/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        Restaurant falafel=new Restaurant("falafel",6,1);
        Restaurant shaWarma=new Restaurant("shaWarma",3,2);
        Restaurant manSaf=new Restaurant("manSaf",4,5);
        falafel.addReview("mohammed","its good resturent",4);
        falafel.addReview("Doa'a","not bad",2);
        falafel.addReview("reema","bad",0);
        falafel.addReview("audai","good",6);
        //falafel.printReview();
        Restaurant testResturantt=new Restaurant("kabab",5,10);
        System.out.println(testResturantt.toString());

        System.out.println( falafel.toString());
        Review testReviw=new Review("Mohammed","good",5);
        System.out.println(testReviw.toString());
//        System.out.println( shaWarma.toString());
//        System.out.println( manSaf.toString());

      //  Review newReview=new Review("mohammed","its good resturent",5);
     //   System.out.println(newReview.toString());


    }
}
