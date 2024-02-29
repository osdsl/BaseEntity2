import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Определение класса Main, который содержит метод main в качестве точки входа
public class Main {
    private static final List<Person> entities = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add new item");
            System.out.println("2. Remove item by index");
            System.out.println("3. Display all items");
            System.out.println("4. Compare two items");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
//объект Scanner для считывания ввода пользователя из консоли
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    displayItems();
                    break;
                case 4:
                    compareItems();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
//метод addItem запрашивает у пользователя 
//данные для создания объекта класса Student, добавляет этот объект в 
//список и выводит сообщение об успешном добавлении
    private static void addItem() {
        // Пример добавления объекта класса Student
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter unique field value for Student: ");
        double uniqueField1 = scanner.nextDouble();

        Person entity = new Student(id, name, uniqueField1);
        entities.add(entity);
        System.out.println("Item added successfully.");
    }

    private static void removeItem() {
        System.out.print("Enter index of item to remove: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < entities.size()) {
            entities.remove(index);
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void displayItems() {
        if (entities.isEmpty()) {
            System.out.println("No items to display.");
        } else {
            for (int i = 0; i < entities.size(); i++) {
                System.out.println(i + ": " + entities.get(i));
            }
        }
    }

    private static void compareItems() {
        System.out.print("Enter index of first item to compare: ");
        int firstIndex = scanner.nextInt();
        System.out.print("Enter index of second item to compare: ");
        int secondIndex = scanner.nextInt();

        if (firstIndex >= 0 && firstIndex < entities.size() &&
                secondIndex >= 0 && secondIndex < entities.size()) {
            Person firstEntity = entities.get(firstIndex);
            Person secondEntity = entities.get(secondIndex);

            if (firstEntity.equals(secondEntity)) {
                System.out.println("Items are equal.");
            } else {
                System.out.println("Items are not equal.");
            }
        } else {
            System.out.println("Invalid indexes.");
        }
    }
}
