package fr.android.androidexercises;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BookItemView extends LinearLayout {

    private TextView textView_name;
    private TextView textView_price;
    private ImageView imageView;

    public BookItemView(Context context) {
        this(context, null);
    }

    public BookItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BookItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        // TODO findViewById()
        textView_name = (TextView) findViewById(R.id.nameTextView);
        textView_price = (TextView) findViewById(R.id.priceTextView);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void bindView(Book book) {
        // TODO setText()
        textView_name.setText(book.name);
        textView_price.setText(String.valueOf(book.price));
        imageView.setImageResource(R.drawable.ic_launcher);
    }
}
