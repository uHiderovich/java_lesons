public class Program {
    public static void main(String[] args) {
        String[] data = {
                "Иванов 123456",
                "Васильев 321456",
                "Петрова 234561",
                "Иванов 234432",
                "Иванов 654321",
                "Петрова 654321"
        };

        PhoneBook phoneBook = new PhoneBook(data);

        System.out.print(phoneBook.getPhoneBook());
    }
}