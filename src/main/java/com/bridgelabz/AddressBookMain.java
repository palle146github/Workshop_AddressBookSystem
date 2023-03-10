package com.bridgelabz;
import java.util.*;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        Map<String, Contacts> cityContacts = new HashMap<>();
        Map<String, Contacts> stateContacts = new HashMap<>();
        Map<String, AddressBook> addressBookMap = new HashMap<>();
        System.out.println("\t\t\t\tWelcome to Address Book System");
        Scanner s = new Scanner(System.in);
        int userOption = 0;
        while(userOption != 6) {
            System.out.println("Choose an option");
            System.out.println("1. Add new Address Book 2. Edit Address Book  3. Show Address Books  4. Show all Contacts  5. Show City Contact Map 6. Show State Contact Map 7. Write Address Book Data into txt file  8. Exit From main Menu");
            int useroption1 = s.nextInt();
            switch(useroption1) {
                case 1:
                    Scanner s1 = new Scanner(System.in);
                    System.out.println("Enter Address Name");
                    String companyName = s1.next();
                    AddressBook addressBook1 = new AddressBook();
                    addressBookMap.put(companyName, addressBook1);
                    System.out.println("Address Book Added Successfully");
                    break;
                case 2:
                    Scanner s2 = new Scanner(System.in);
                    int userOption2 = 0;
                    while(userOption2 != 3) {
                        System.out.println("");

                        System.out.println("Choose an option");
                        System.out.println("1. Add Contact   2. Show Contacts   3. Exit From Contact Menu  ");
                        int userOption3 = s2.nextInt();
                        System.out.println("Enter AddressBook Name to perform operation ");
                        String companyName1 = s2.next();
                        try {
                            AddressBook ab = addressBookMap.get(companyName1);
                            switch (userOption3) {
                                case 1:
                                    ab.addContactLisst();
                                    break;
                                case 2:
                                    ab.showContacts();
                                    break;
                                case 3:
                                    userOption2 = 3;
                                    break;
                                default:
                                    System.out.println("Choose Valid Option");
                                    break;
                            }

                        } catch (NullPointerException e) {
                            System.out.println(e.getMessage());
                        }
                    }break;
                case 3:
                    if (addressBookMap.size() != 0) {
                        System.out.println("List of AddressBooks");
                        for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
                            String k = entry.getKey();
                            System.out.println("Address Book : " + k );
                        }}
                    else {
                        System.out.println("No Address Book exist in the Record");
                    }
                    break;

                case 4:
                    for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
                        String k = entry.getKey();
                        System.out.println("Address Book " + k +" Contact list");
                        AddressBook v = entry.getValue();
                        v.showContacts();
                    }
                    break;
                case 5:
                    for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
                        String k = entry.getKey();
                        System.out.println("Address Book " + k +" Contact list");
                        AddressBook v = entry.getValue();
                        v.setCityContacts1();
                    }
                    break;
                case 6:
                    for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
                        String k = entry.getKey();
                        System.out.println("Address Book " + k +" Contact list");
                        AddressBook v = entry.getValue();
                        v.setCityContacts1();
                    }
                    break;
                case 7:
                    addressBook.writeData(addressBookMap);
                    break;
                case 8:
                    userOption = 6;
                    break;
                case 9:
                    break;

                default:
                    System.out.println("Enter Valid Option");
                    break;
            }
        }
        s.close();
    }
}
