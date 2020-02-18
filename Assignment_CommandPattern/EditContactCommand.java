package com.example.sharingapp;

import android.content.Context;

public class EditContactCommand extends Command {
    private ContactList contactList;
    private Contact newContact;
    private Contact oldContact;
    private Context context;

    public EditContactCommand(ContactList contactList1  ,Contact oldContact1 , Contact newContact1, Context context1)
    {
        this.contactList = contactList1;
        this.newContact = newContact1;
        this.oldContact = oldContact1;
        this.context = context1;
    }

    @Override
    public void execute() {

        this.contactList.deleteContact(this.oldContact);
        this.contactList.addContact(this.newContact);
        setIsExecuted(this.contactList.saveContacts(this.context));
    }
}
