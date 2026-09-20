package com.example.powitanie;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private Button buttonGreet;
    private TextView textViewGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        buttonGreet = findViewById(R.id.buttonGreet);
        textViewGreeting = findViewById(R.id.textViewGreeting);

        buttonGreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString().trim();

                if (name.isEmpty()) {
                    Toast.makeText(MainActivity.this, R.string.empty_name, Toast.LENGTH_SHORT).show();
                    textViewGreeting.setText("");
                } else {
                    String greeting = getString(R.string.greeting, name);
                    textViewGreeting.setText(greeting);
                }
            }
        });
    }
}