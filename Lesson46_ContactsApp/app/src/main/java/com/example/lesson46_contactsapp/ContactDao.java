package com.example.lesson46_contactsapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ContactDao {

    @Insert
    void insert(Contact contact);

    @Query("SELECT * FROM contacts")
    List<Contact> getAllContacts();

    @Delete
    void delete(Contact contact);

}
