package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();

        userMap.put("admin", "12345");
        userMap.put("user1", "1234");

        // Scanner to take input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Check login
        if (username.equals("admin") && password.equals(userMap.get("admin"))) {
            System.out.println("✅ Login Successful! Welcome, " + username);
        } else {
            System.out.println("❌ Invalid Username or Password. Try again.");
        }

        sc.close();
    }
}
