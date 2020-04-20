package com.example.ludenswishlist;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private List<Game> games;
    private GamesAdapter gamesAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Games");
        getIntent();

        initialData();

        RecyclerView recyclerView =(RecyclerView)findViewById(R.id.Recycler_View);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        gamesAdapter = new GamesAdapter(games, this);
        recyclerView.setAdapter(gamesAdapter);
    }

    private void initialData() {
        games = new ArrayList<>();
        games.add(new Game("Darksiders: Genesis", "Action", "PS4, XB1, PC", "THQ Nordic", "2.14.2020", R.drawable.ic_class_black_24dp));
    }


    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.Home:
                Toast.makeText(this,"This is the homepage", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Wishlist:
                Intent i = new Intent(this, WishListActivity.class);
                startActivity(i);
                return true;
            case R.id.News:
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.android.com"));

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }


                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }




}
