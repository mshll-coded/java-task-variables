public class App {
    public static void main(String[] args) {
        String firstName = "Meshal";
        String lastName = "Almutairi";
        int age = 25;
        int amount = 444;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(amount);

        boolean married = false;
        System.out.println("Married? : " + married);

        double amount2 = 20;
        String deposit = "Deposit";
        String withdraw = "Withdraw";

        System.out.println("The amount is " + amount2 + "KD");
        System.out.println("Would you like to " + deposit + " or " + withdraw + " the amount?");

        int amount3 = 5;
        System.out.println(amount3 + " + " + amount3 + " makes " + (amount3+amount3));

        String fullName = "John doe";
        String fName = fullName.substring(0, fullName.indexOf(' '));
        String lName = fullName.substring(fullName.indexOf(' ')+1);
        System.out.println("My name is " + fName.toUpperCase() + " and my last name length is " + lName.length());

//        🌶
        System.out.println("Does my last name starts with 'd'?: " + (lName.charAt(0) == 'd'));




    }
}
