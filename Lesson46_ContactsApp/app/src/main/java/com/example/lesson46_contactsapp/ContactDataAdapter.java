package com.example.lesson46_contactsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson46_contactsapp.databinding.ContactListItemBinding;

import java.util.ArrayList;

public class ContactDataAdapter extends RecyclerView.Adapter<ContactDataAdapter.ContactViewHolder> {
    private ArrayList<Contact> contacts;

    public ContactDataAdapter(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View itemView = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.contact_list_item, parent, false);
//        return new ContactViewHolder(itemView);

        ContactListItemBinding contactListItemBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.contact_list_item, parent, false);

        return new ContactViewHolder(contactListItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactDataAdapter.ContactViewHolder holder, int position) {
        Contact currentContact = contacts.get(position);

//        holder.name.setText(currentContact.getName());
//        holder.email.setText(currentContact.getEmail());

        holder.contactListItemBinding.setContact(currentContact);
    }

    @Override
    public int getItemCount() {
        if (contacts != null) {
            return contacts.size();

        }else {
            return 0;
        }
    }

    public void setContacts(ArrayList<Contact> contacts){
        this.contacts = contacts;
        notifyDataSetChanged();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder{
        private ContactListItemBinding contactListItemBinding;

//        private TextView name, email;


        public ContactViewHolder(@NonNull ContactListItemBinding contactListItemBinding) {  //(@NonNull View itemView
            super(contactListItemBinding.getRoot());    //super(itemView);

            this.contactListItemBinding = contactListItemBinding;

//            this.name = itemView.findViewById(R.id.tvName);
//            this.email = itemView.findViewById(R.id.tvEmail);
        }
    }
}
