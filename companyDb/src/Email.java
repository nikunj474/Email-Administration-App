//package emailapp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int defaultPasswordLength = 8;
    private String department;
    public String companyName = "xyzco.com";
    private int mailBoxCapacity = 1000;
    private String alernateEmail;

    //Constructor to recieve the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Your Email Id is :" + this.firstName + "." + this.lastName);

        //Calling a Method to get the department
        this.department = setDepartment();
        //System.out.println("Your Department is: " + this.department);

        //Calling a method to generate a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //Combine elements to generate Email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyName;
        //System.out.println("Your Email is " + this.email);
    }

    //Method to set Department
    private String setDepartment() {
        System.out.println("Department Codes:\n1 Sales\n2 Operations\n3 Marketing\n4 HR \n0 Others \nPlease Enter your Department");
        Scanner in = new Scanner(System.in);
        //this.department = setDepartment();
        int depChoice = in.nextInt(); {
        // switch (depChoice) {
        //     case 1:
        //         return "Sales";
        //     case 2:
        //         return "Operations";
        //     case 3:
        //         return "Marketing";
        //     case 4:
        //         return "HR";
        //     default:
        //         return "Others";
        //         break

        if (depChoice == 1) { return "Sales"; }
        else if (depChoice == 2) { return "Operations"; }
        else if (depChoice == 3) { return "Marketing"; }
        else if (depChoice == 4) { return "HR"; }
        else {return "Others";}
        }
    }

    //Method of generating a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
        char[] password = new char[length];
        for(int i=0;i<length;i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
            //System.out.println(rand);
            //System.out.println(passwordSet.charAt(rand));
        }
        return new String(password);
    }

    //Set MailBox Capacity
    public void setMailboxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alernateEmail = altEmail;
    }

    //Change the Password
    public void changePassword(String password) {
        this.password = password;
    }

    //Get Methods
    public int getMailboxCapacity() { return mailBoxCapacity; }
    public String getAltEmail() { return alernateEmail; }
    public String getPassword() { return password; }

    public String showInfo() {
        return "Display Name: " + firstName + " " + lastName +
                "\nCompany Email: " + email +
                "\nMailbox Capacity: " + mailBoxCapacity + " mb";
    }

    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Email em1 = new Email("John", "Smith");
        System.out.println(em1.showInfo());
        Email em2 = new Email("Nikunj", "Agrawal");
        System.out.println(em2.showInfo());
    }
}
