package zajecia.ostattnie;

/**
 * Created by RENT on 2017-02-16.
 */
public interface MyInterfaceList {
    void put(int index, int value);
    void add(int index, int value);
    int get(int index);
    void add(int value);
    void delete(int index);
    MyList clone();

    int getSize();
}
