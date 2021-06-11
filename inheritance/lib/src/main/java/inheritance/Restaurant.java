package inheritance;

import java.util.ArrayList;
import java.util.List;


public class Restaurant implements ReviewAble {
    String name;
    String price;
    int rating;

    List<Review> reviewList = new ArrayList<>();

    public Restaurant(String name, String price){
        this.name = name;
        this.rating = 5;
        this.price = price;
    }

    public String toString(){
        return String.format("Restaurant: Name: %s, Price: %s, Rating: %d", name, price, rating);
    }

    @Override
    public int addReview(String body, String author, int stars) {
        Review review =  new Review(body, author, stars);
        review.body = body;
        review.author = author;
        review.stars = stars;
        reviewList.add(review);
        int numStars = 0;
        int counter = 0;
        for(Review reviews : reviewList){
            numStars += reviews.stars;
            counter ++;
        }
        this.rating = numStars/counter;
        return this.rating;
    }

    @Override
    public void printReview() {
        for(Object element : this.reviewList){
            System.out.println(element.toString());
        }
    }

}
