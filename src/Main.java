public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа 1.10");


        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        System.out.println("Задача 2");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Данные ФИО сотрудника для заполнения отчета —  " + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        String newFullName = fullName.replace('ё', 'е');

        System.out.println("Данные ФИО сотрудника —  " + newFullName);
    }

}