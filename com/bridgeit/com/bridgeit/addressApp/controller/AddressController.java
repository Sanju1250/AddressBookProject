package com.bridgeit.addressApp.controller;

import java.util.*;

import com.bridgeit.addressApp.service.AddressBookInter;
import com.bridgeit.addressApp.service.ImplementationAddress;

public class AddressController {
	AddressBookInter addressBookInter = new ImplementationAddress();

	public void add(String addressBookName) {
		addressBookInter.add(addressBookName);
	}

	public void delete(String addressBookName) {
		addressBookInter.delete(addressBookName);
	}

	public void edit(String addressBookName) {
		addressBookInter.edit(addressBookName);
	}

	public void sorti(String addressBookName) {
		addressBookInter.sorti(addressBookName);
	}
    public void display(String addressBookName)
    {
    	addressBookInter.display(addressBookName);
    }

}
