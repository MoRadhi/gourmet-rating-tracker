# Gourmet Rating Tracker 🍽️

A lightweight Java console application designed to track and manage food ratings. This program allows users to maintain a list of gourmet dishes, rate them on a scale of 1-10, and perform basic data analysis such as finding the highest/lowest rated items and cleaning up low-rated entries.

## 🚀 Features

* **Add Food Items:** Input dish names with automatic capitalization formatting.
* **Input Validation:** Ensures ratings stay within the 1-10 range and prevents empty entries.
* **View All Ratings:** Displays a formatted list of all stored food items and their scores.
* **Top & Bottom Performers:** Quickly identify the highest and lowest-rated dishes.
* **Smart Cleanup:** Automatically removes all food items with a rating lower than 5.
* **Robust Logic:** Uses backward-iteration to safely remove items from the list without indexing errors.

## 🛠️ Technology Stack

* **Language:** Java 8 or higher
* **Core Concepts:** `ArrayList` management, `Scanner` input handling, and basic algorithms.

## 📖 How to Use

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/moradhi/GourmetRatingTracker.git]
    ```
2.  **Compile the program:**
    ```bash
    javac GourmetRatingTracker.java
    ```
3.  **Run the application:**
    ```bash
    java GourmetRatingTracker
    ```

## 📋 Example Menu

When you run the program, you will interact with the following interface:

```text
Menu:
1. Add Food Item
2. Display All Food Items
3. Check Food with Highest Rating
4. Check Food with Lowest Rating
5. Remove Food Items with Rating Below 5
6. Exit
Enter your choice:
