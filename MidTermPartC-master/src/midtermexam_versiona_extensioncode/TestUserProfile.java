/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Bilson , 2023
 */
import java.util.Scanner;

public class TestUserProfile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display the list of available genres
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        System.out.println("Available Genres:");
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
        
        // Get user input for name and favorite genre
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Choose your favorite genre (enter the corresponding number): ");
        int genreChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character
        
        // Validate the genre choice
        if (genreChoice < 1 || genreChoice > genres.length) {
            System.out.println("Invalid genre choice!");
            return;
        }
        
        // Create the user profile
        String favoriteGenre = genres[genreChoice - 1];
        UserProfile userProfile = new UserProfile(name, favoriteGenre);
        
        // Display the created user profile
        System.out.println("User Profile created!");
        System.out.println("Name: " + userProfile.getUserID());
        System.out.println("Favorite Genre: " + userProfile.getGenre());
    }
}
