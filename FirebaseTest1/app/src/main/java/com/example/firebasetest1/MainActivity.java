package com.example.firebasetest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance(); //get an instance of firebase database
    private DatabaseReference myRef = database.getReference("messageTwo"); //get a specific reference called message

    private EditText keyEditText;
    private EditText valueEditText;
    private TextView keyTextView;
    private TextView valueTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        myRef.setValue("this is the String we are storing in the database again");
//        myRef = database.getReference("Messages");
//        myRef.child("My ID").setValue("I love OOP");
//
//
//        DatabaseReference personRef = database.getReference("People");
//        personRef.setValue(new Person("Manjun",22,true));
//        personRef.push().setValue(new Person("Nigel",35,true));
//        personRef.child("I NAME THE ID").setValue(new Person("Lily",16,true));


        keyEditText = findViewById(R.id.key_edit_text_field);
        valueEditText = findViewById(R.id.value_edit_text_field);
        //keyTextView = findViewById(R.id.key_edit_text_field);
        //keyEditText = findViewById(R.id.key_edit_text_field);
    }

    public void readFromCloud(View view) {
        myRef = database.getReference(keyEditText.getText().toString());
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again whenever data at this location is updated.
                if (dataSnapshot.exists()) {
                    String loadedData = dataSnapshot.getValue(String.class);
                    valueEditText.setText(loadedData);
                }else{
                    Toast.makeText(MainActivity.this, "Cannot find the key", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(MainActivity.this, "Error loading Firebase", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void writeToCloud(View view) {
        myRef = database.getReference(keyEditText.getText().toString());
        myRef.setValue(valueEditText.getText().toString());

    }
}
