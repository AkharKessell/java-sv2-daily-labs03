package Day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Journal {
    private List<String> students = new ArrayList<>();

    public boolean addStudent(String name) {
        String trimmedName = name.trim();
        int whiteSpaceIndex = trimmedName.indexOf(" ");

        if (whiteSpaceIndex > -1) {
            students.add(trimmedName);
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Journal journal = new Journal();
        Scanner sc = new Scanner(System.in);

        System.out.println("Add full name:");
        String name = sc.nextLine();

        System.out.println(journal.addStudent(name) ? "Name Ok" : "Full name pls!");
        System.out.println(journal.students.toString());
    }
}