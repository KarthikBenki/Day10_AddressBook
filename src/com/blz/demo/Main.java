package com.blz.demo;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    HashMap<Integer, AddressBook> addressbooks = new HashMap<>();

    public void addMultipleAddressBook() {
	while (true) {
	    System.out.println(
		    "please select the address book\n1)addressbook1" + "\n2)addressbook2\n3)addressbook3\n4)exit");
	    int selection = scanner.nextInt();
	    switch (selection) {

	    case 1:
		System.out.println("welcome to addressbook 1");
		AddressBook addressBook1 = new AddressBook();
		addressBook1.addMultiplePerson();
		addressbooks.put(1, addressBook1);
		break;

	    case 2:
		System.out.println("welcome to addressbook 2");
		AddressBook addressBook2 = new AddressBook();
		addressBook2.addMultiplePerson();
		addressbooks.put(2, addressBook2);
		break;

	    case 3:
		System.out.println("welcome to addressbook 3");
		AddressBook addressBook3 = new AddressBook();
		addressBook3.addMultiplePerson();
		addressbooks.put(3, addressBook3);
		break;

	    case 4:
		System.out.println("Exiting from multiple address books");
		System.exit(0);
		break;

	    default:
		System.out.println("invalid option select correct option");
		break;

	    }
	}
    }

    public static void main(String[] args) {
	System.out.println("Start with Displaying Welcome to Address Book Program in AddressBookMain class");
	Main main = new Main();
	main.addMultipleAddressBook();
    }

}
