package fr.android.androidexercises;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import timber.log.Timber;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        // Plant logger cf. Android Timber
        Timber.plant(new Timber.DebugTree());

        // TODO build Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://henri-potier.xebia.fr/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // TODO create a service
        HenriPotierService service = retrofit.create(HenriPotierService.class);

        // TODO listBooks()
        Call<List<Book>> books = service.listBooks();

        // TODO enqueue call and display book title
        books.enqueue(new Callback<List<Book>>() {
            @Override
            public void onResponse(Call<List<Book>> call, Response<List<Book>> response) {
                // TODO log books
                for (Book b : response.body()) {
                    Timber.i("Book Name : %s", b.getTitle());
                }
            }

            @Override
            public void onFailure(Call<List<Book>> call, Throwable t) {

            }
        });

        // TODO display book as a list
    }

}
