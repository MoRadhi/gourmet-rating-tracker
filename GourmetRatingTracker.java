import java.util.ArrayList;
import java.util.Scanner;

public class GourmetRatingTracker {
    // ArrayLists to store food names and their ratings
    private static ArrayList<String> foodItems = new ArrayList<>();
    private static ArrayList<Integer> ratings = new ArrayList<>();

    // Function to add a new food item and its rating
    public static void addFoodItem(String food, int rating) {
      if (food == null || food.trim().isEmpty()) {
        System.out.println("Error: Food name cannot be empty.");
        return;
    }
    if (rating < 1 || rating > 10) {
        System.out.println("Error: Rating must be between 1 and 10.");
        return;
    }
        String formattedFood = food.substring(0, 1).toUpperCase() + food.substring(1).toLowerCase(); // Capitalize the first letter and make the rest lowercase
        foodItems.add(formattedFood); // Add the formatted food name to the list
        ratings.add(rating); // Add the rating to the ratings list
        System.out.println("Added " + formattedFood + " with rating " + rating);
    }

    // Function to display all food items and their ratings
    public static void displayFoodItems() {
        System.out.println("\nFood Items and Ratings:");
        for (int i = 0; i < foodItems.size(); i++) {
          System.out.println("Item: " + foodItems.get(i) + ", Rating: " + ratings.get(i));
        }
    }

    // Function to get the food with the highest rating
    public static void foodWithHighestRating() {
        if (foodItems.isEmpty()) {
            System.out.println("No food items in the list.");
            return;
        }
        int maxRating = 0;
        for (int rating : ratings) {
            if (rating > maxRating) {
                maxRating = rating;
            }
        }
        for (int i = 0; i < foodItems.size(); i++) {
            if (ratings.get(i) == maxRating) {
                System.out.println("Item: " + foodItems.get(i) + ", Rating: " + ratings.get(i));
            }
        }
    }

    // Function to display food items with min ratings
    public static void foodWithLowRating() {
      if (foodItems.isEmpty()) {
            System.out.println("No food items in the list.");
            return;
        }  

      int minRating = 10; // Initialize to maximum possible rating
        for (int rating : ratings) {
            if (rating < minRating) {
                minRating = rating;
            }
        }
        for (int i = ratings.size() - 1; i >= 0; i--) {
          if (ratings.get(i) == minRating) {
            System.out.println("Item: " + foodItems.get(i) + ", Rating: " + ratings.get(i));
          }
        }
    }

    // Function to remove food items with ratings below 5
    public static void removeLowRatedFoods() {
        for (int i = ratings.size() - 1; i >= 0; i--) {
          if (ratings.get(i) < 5) {
            System.out.println("Removed " + foodItems.get(i) + " with rating " + ratings.get(i)); // Print the removed item and its rating first so its not out of bounds
            foodItems.remove(i); // Remove the food item at index i
            ratings.remove(i); // Remove the rating at index i
          }
        }
    }

    // Main function to run the Food Rating System
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Food Item");
            System.out.println("2. Display All Food Items");
            System.out.println("3. Check Food with Highest Rating");
            System.out.println("4. Check Food with Lowest Rating");
            System.out.println("5. Remove Food Items with Rating Below 5");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter food name: ");
                    String food = scanner.nextLine();
                    System.out.print("Enter rating (1-10): ");
                    int rating = scanner.nextInt();
                    if (rating < 1 || rating > 10) {
                        System.out.println("Invalid rating. Please enter a rating between 1 and 10.");
                    } else {
                        addFoodItem(food, rating);
                    }
                    break;

                case 2:
                    displayFoodItems();
                    break;

                case 3:
                    foodWithHighestRating();
                    break;
                case 4:
                    foodWithLowRating();
                    break;
                case 5:
                    removeLowRatedFoods();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.print("-".repeat(45)); // Print a dash before the input for better formatting
        } while (choice != 6);

        scanner.close();
    }
}