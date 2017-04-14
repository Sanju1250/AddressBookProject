package com.bridgeit.addressApp.tester;

import java.util.Scanner;
import com.bridgeit.addressApp.controller.AddressController;
import com.bridgeit.addressApp.model.Person;
import com.bridgeit.addressApp.service.ImplementationAddress;

public class MainClassAddressBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AddressController addressConroller = new AddressController();
		int number;
		System.out.println("Hi welcome to AddressBook");
		do {
			System.out.println("Enter the AddressBook name");
			String addressBookName = scanner.next();
			System.out.println("Enter the following choice");
			System.out.println("1 for add");
			System.out.println("2 for delete");
			System.out.println("3 for edit");
			System.out.println("4 for sort ");
			System.out.println("5 for display");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addressConroller.add(addressBookName);
				break;
			case 2:
				addressConroller.delete(addressBookName);
				break;
			case 3:
				addressConroller.edit(addressBookName);
				break;
			case 4:
				addressConroller.sorti(addressBookName);
				break;
			case 5:addressConroller.display(addressBookName);
			       break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("To continue this press 1");
			number = scanner.nextInt();
		} while (number == 1);

	}

}
