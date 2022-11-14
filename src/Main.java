import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name,address,email;  //global variable decleared
        int amt, accno ,phoneNumber;   //global variable decleared

        ArrayList<Account> list = new ArrayList<>();
        list.add(new Account("Ranish Shahu","Bhaktapur",5000,981888888,"ranish@gmail.com"));
        list.add(new Account("Raju Shrestha","Kathmandu",10000,98184588,"raju@gmail.com"));




        System.out.println("Select Operation");
        System.out.println("1. Open Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check Balance");
        System.out.println("5. List All ");
        System.out.println("6. Exit");


        int choice;
        do {
            System.out.print("Enter Choose Here: ");
            choice = sc.nextInt();
            boolean found;
            switch (choice) {
                case 1:  //Open Account
                    System.out.println("---Account Open---");
                    System.out.print("Enter FullName: ");
                    name=sc.next();

                    System.out.println("Enter Address ");
                    address = sc.nextLine();
                    sc.next();



                    System.out.print("Enter Amount: ");
                    amt = sc.nextInt();
                    System.out.print("Enter PhoneNo.: ");
                    phoneNumber =sc.nextInt();
                    System.out.println("Enter Email: ");
                    email = sc.nextLine();

                    Account acc = new Account(name,address,amt,phoneNumber,email); //making Object Account
                    list.add(acc);
                    System.out.println("..Account Opened..!!");
                    break;
                case 2: //Deposit Amount
                    System.out.println("---Deposit---");
                    found=false;
                    System.out.println("Enter Acc.no: ");
                    accno = sc.nextInt();
                    for (Account ac: list){
                        if(accno==ac.getAccno()){
                            found=true;
                            System.out.println("Customer Name: "+ac.getName());
                            System.out.println("Address: "+ ac.getAddress());
                            System.out.println("Account Balance: "+ ac.getBal());

                            System.out.println("\n Enter Amount to Deposit");
                            amt=sc.nextInt();
                            ac.setBal(ac.getBal()+amt);
                            System.out.println("Deposit Successfully..!!");
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Invalid Account Number");
                    }
                    break;
                case 3: //Withdraw Amount
                    System.out.println("---Withdraw---");

                    found=false;
                    System.out.println("Enter Acc.no: ");
                    accno = sc.nextInt();
                    for (Account ac: list){
                        if(accno==ac.getAccno()){
                            found=true;
                            System.out.println("Customer Name: "+ac.getName());
                            System.out.println("Address: "+ ac.getAddress());
                            System.out.println("Account Balance: "+ ac.getBal());

                            System.out.println("\nEnter Amount to Withdraw");
                            amt=sc.nextInt();
                            if(amt<=ac.getBal()){
                                ac.setBal(ac.getBal()-amt);
                                System.out.println("..Withdraw Successfully..!!");
                            }else {
                                System.out.println("..Insufficient Balance..!!");
                            }


                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Invalid Account Number");
                    }


                    break;
                case 4:
                    System.out.println("---Check Balance---");
                    found=false;
                    System.out.println("Enter Acc.no: ");
                    accno = sc.nextInt();
                    for (Account ac: list){
                        if(accno==ac.getAccno()){
                            found=true;
                            System.out.println("Customer Name: "+ac.getName());
                            System.out.println("Address: "+ ac.getAddress());
                            System.out.println("Account Balance: "+ ac.getBal());

                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Invalid Account Number");
                    }
                    break;
                case 5:
                    System.out.println("---List of All Account---");
                    for (Account ac:list){
                        System.out.println(ac);
                    }
                    break;
                case 6:
                    System.out.println("---Thanks for visiting us --Exit---");
                    break;
                default:
                    System.out.println("---Invalid Choice---");
                    break;
            }
            }while (choice != 6);







    }
}