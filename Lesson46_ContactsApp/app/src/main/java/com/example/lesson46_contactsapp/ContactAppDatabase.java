package com.example.lesson46_contactsapp;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Contact.class}, version = 1)
public abstract class ContactAppDatabase extends RoomDatabase {
    public abstract ContactDao getContactDao();
}
