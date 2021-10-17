package inheritance;

public class Restaurant {
    String name;
    int stars;
    int price;

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

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price=" + price +
                '}';
    }

    public Restaurant getRestaurant(){
        return
    }
}
