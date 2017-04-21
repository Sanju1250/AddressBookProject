package com.bridgeit.addressApp.service;

public interface AddressBookInter {
	void add(String addressBookName);

	void delete(String addressBookName);

	void edit(String addressBookName);

	void sorti(String addressBookName);
	
	void display(String addressBookName);

}
