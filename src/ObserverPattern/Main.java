package ObserverPattern;

import java.util.Scanner;

public class Main {
    private static Scanner scan;

    public static void main( String[] args ) {
        Group grp = new Group("DesignPatternGroup");

        scan = new Scanner(System.in);
        User u = new User("");

        for (int i = 1; i <= 4; i++) { //takes input of four users
            System.out.print("\nEnter a user name: ");
            String name = scan.nextLine();
            u = new User(name);
            u.Subscribe(grp); //all the users subscribe to designpattern group
        }
        System.out.print("\nEnter a new Post: ");
        grp.newPost(scan.nextLine()); //this post will be notified to 4 users

        u.unSubscribe(grp); // the last user unSubscribe group

        System.out.print("\nEnter another Post: ");//take another new post
        grp.newPost(scan.nextLine()); // now 3 subscribed users will get notification
    }
}