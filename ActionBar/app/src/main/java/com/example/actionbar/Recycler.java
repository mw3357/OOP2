package com.example.actionbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Recycler extends AppCompatActivity {

    private List<Person> persons;
    private PersonsAdapter personsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        setTitle("Presidents");
        getIntent();

        initialData();

        RecyclerView recyclerView =(RecyclerView)findViewById(R.id.Recycler_View);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        personsAdapter = new PersonsAdapter(persons, this);
        recyclerView.setAdapter(personsAdapter);
    }
    private void initialData() {
        persons = new ArrayList<>();
        persons.add(new Person("Bill Clinton", "1993-2001", R.drawable.two));
        persons.add(new Person("George W. Bush", "2001-2009", R.drawable.one));
        persons.add(new Person("Barack Obama", "2009-2017", R.drawable.three));
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.recycle_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add:
                persons.add(getRandomPerson());
                personsAdapter.notifyDataSetChanged();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
    private Person getRandomPerson() {
        int num = (int) (Math.random() * 3);
        if (num == 0)
            return new Person("Bill Clinton", "1993-2001", R.drawable.two);
        else if (num == 1)
            return new Person("George W. Bush", "2001-2009", R.drawable.one);
        else
            return new Person("Barack Obama", "2009-2017", R.drawable.three);
    }
}
