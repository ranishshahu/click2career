
public class Account {
    private  int accno;
    private  static  int saccno=1001;
    private  String name;
    private String address;
    private int bal;
    private int phoneNumber;
    private String email;

    public Account(String name, String address, int bal,  int phoneNumber,String email){
        this.accno=saccno++;
        this.name = name;
        this.address = address;
        this.bal = bal;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    // now using getter and setter
    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public static int getSaccno() {
        return saccno;
    }

    public static void setSaccno(int saccno) {
        Account.saccno = saccno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public  int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accno=" + accno +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", bal=" + bal +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
