package zajecia.dziewiate;

/**
 * Created by RENT on 2017-02-13.
 */

public class Zajecia9 {
    public static void main(String[] args) {
        User user = new User("Szymon", "Nowak", "1.1.1875");
        Address address = new Address("Poznan", "Poznanska", 30, "12-345", "Poland");
        user.address = address;
        address.print();
        user.print();
    }

    public static void printUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i].print();
        }
    }
}
