package com.example.actionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Second Activity");
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.second_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.share:
                Toast.makeText(this,"Your file is shared", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.save:
                Toast.makeText(this,"Your file is saved", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Recycler_View:
                Intent i = new Intent(this, Recycler.class);
                startActivity(i);
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }

    }
}
