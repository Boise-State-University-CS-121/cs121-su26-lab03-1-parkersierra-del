
public class AccountGenerator {
public static void main(String[] args)}
    Scanner in = new Scanner

    String userFirst;
    String userLast;
    String generated Username;

    // Promt for first name
    System.out.print("Enter Parker): ");
    String firstName = in.nextLine().trim();
        firstName = "Parker";

    // Promt for last name
    System.out.print("Enter Sierra");
    String lastName = in.nextline().trim();
        lastName = "Sierra";

    // First letter of first name ('p')
    String firstPart = firstName.substring(0,1);

    // First five letters of last name
    String secondPart = lastName.substring(0,5);

    //Generate a random number in the range 10 to 99
    int randomNumber = (int) (Math.random() * (99-10+1)) +10;

    //Combine parts and make lowercase
    String username = (firstPart + secondPart + randomNumber).toLowerCase();

    //Output the generated username
    System.out.println("Username: " + username);
 
    in.close();
