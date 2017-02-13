package zajecia.dziesiate;


import zajecia.dziewiate.Address;

public class Client {
    private String firstName;
    private String lastName;
    private Address Address;
    private String phoneNumber;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Client(String firstName, String lastName, Address Address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Address = Address;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return Address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(Address address) {
        this.Address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "[" + firstName + " " + lastName + "," + phoneNumber + "]";
    }
}
