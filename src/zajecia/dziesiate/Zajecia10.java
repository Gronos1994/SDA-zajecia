package zajecia.dziesiate;

import zajecia.dziewiate.Address;
import zajecia.dziewiate.User;

import java.util.HashMap;

/**
 * Created by RENT on 2017-02-13.
 */
public class Zajecia10 {
    public static void main(String[] args) {
        Product product = new Product("tomato", "from Italy", 2.5);
//        Address address = new Address("Poznan", "Owsiana", 21, "61-666", "Poland");
//        Client client = new Client("Lukasz", "Gronowski");
//        client.setPhoneNumber("785478562");
        Product product1 = new Product("orange", "from Brazil", 5.50);
        Product product2 = new Product("Kiwi", "addsa", 10.0);
        HashMap<Product, Integer> products = new HashMap<>();
        Warehouse warehouse = new Warehouse(products);
        products.put(product, 500);
        products.put(product1, 1500);
        products.put(product2, 1000);
        HashMap<Product, Integer> productIntegerHashMap = warehouse.get(product, 600);
//        Order order = new Order(client,products);
//        System.out.println("Total price for this order is " +order.getPrice());
        //System.out.println();


    }

    public static void mapDemo() {
        HashMap<String, User> map = new HashMap<>();
        map.put("12312312", new User("Lukasz", "Gronowski", "1321231"));
        map.put("2132131235423", new User("Agnieszka", "Wojt", "123123", new Address()));
        User user = map.get("12312312");
        map.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
            System.out.println();
        });
    }
}
