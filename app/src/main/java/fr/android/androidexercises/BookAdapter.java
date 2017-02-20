package fr.android.androidexercises;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class BookAdapter extends BaseAdapter {

    private final List<Book> books;

    private final LayoutInflater layoutInflater;

    public BookAdapter(Context context, List<Book> books) {
        this.books = books;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        // TODO
        return books.size();
    }

    @Override
    public Book getItem(int position) {
        return books.get(position);
    }

    @Override
    public long getItemId(int position) {
        return books.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BookItemView view;
        if (convertView == null) {
            view = (BookItemView) layoutInflater.inflate(R.layout.custom_view_item_book, parent, false);
        } else {
            view = (BookItemView) convertView;
        }

        view.bindView(getItem(position));

        return  view;
    }

}
