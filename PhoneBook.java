import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public PhoneBook(String[] initialData) {
        fill(initialData);
    }

    public PhoneBook() {
    }

    public void fill(String[] data) {
        for (String person : data) {
            String[] personData = person.split(" ");
            add(personData[0], Integer.parseInt(personData[1]));
        }
    }

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(phoneNum);
            phoneBook.put(name, list);
        }
    }

    public ArrayList<Integer> find(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<Integer>());
    }

    public HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
}
