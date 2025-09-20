package demo;

import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {
        // Default username and password
        String defaultUsername = "admin";
        String defaultPassword = "12345";

        // Scanner to take input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Check login
        if (username.equals(defaultUsername) && password.equals(defaultPassword)) {
            System.out.println("✅ Login Successful! Welcome, " + username);
        } else {
            System.out.println("❌ Invalid Username or Password. Try again.");
        }

        sc.close();
    }
}
