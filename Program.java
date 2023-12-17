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

        /*
         * Сотрировку не стал переписывать, так как дефолтная соответствует заданию
         */
        PhoneBook phoneBook = new PhoneBook(data);

        System.out.println(phoneBook.getPhoneBook());

        phoneBook.add("Васильев", 123);
        System.out.println(phoneBook.getPhoneBook());

        phoneBook.add("Васильев", 321456);
        System.out.println(phoneBook.getPhoneBook());

        phoneBook.removePerson("Васильев");
        System.out.println(phoneBook.getPhoneBook());

        phoneBook.removePhoneOfPerson("Иванов", 123456);
        System.out.println(phoneBook.getPhoneBook());
    }
}