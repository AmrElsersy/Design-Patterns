package com.example.sharingapp;

import android.content.Context;

public class DeleteContactCommand extends Command {
    private ContactList contactList;
    private Contact contact;
    private Context context;

    public DeleteContactCommand(ContactList contactList, Contact contact , Context context)
    {
        this.contact = contact;
        this.contactList = contactList;
        this.context = context;
    }

    @Override
    public void execute() {
        this.contactList.deleteContact(this.contact);
        setIsExecuted(this.contactList.saveContacts(context));
    }
}
