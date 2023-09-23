package com.example.lesson23_adaptersapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter {

    private Context context;
    private String[] items; //Data Source

    public MyCustomAdapter(Context context, String[] items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length; // Returns the number of items in your data Source
    }

    @Override
    public Object getItem(int i) {
        return items[i]; // Returns the data item at the given position
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if (view == null) {
            // convertView/View: is a recycled View that you can reuse to
            //        improve the performance of your list.

            view = LayoutInflater.from(context).inflate(R.layout.my_list_item,viewGroup,false);
            holder=new ViewHolder();
            holder.textView = view.findViewById(R.id.text1);
            view.setTag(holder);
        }else {
            // Reusing the View (that's recycled)
            holder= (ViewHolder) view.getTag();
        }
        holder.textView.setText(items[i]);

        return view; // Displays the data at a position in the data set
    }

    static class ViewHolder{
        // Holds references to the views within an item layout

        TextView textView;
    }
}
