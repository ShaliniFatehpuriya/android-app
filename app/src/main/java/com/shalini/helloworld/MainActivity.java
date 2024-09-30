package com.shalini.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //R is a special class in java which gives us the access to all out resources

    }
    public void onBtnClick(View view){
        TextView firstName = findViewById(R.id.viewFirstName);
        TextView lastName = findViewById(R.id.viewLastName);
        TextView email = findViewById(R.id.viewEmail);
        EditText editFName = findViewById(R.id.editFirstName);
        EditText editLName = findViewById(R.id.editLastName);
        EditText editEmail = findViewById(R.id.editEmail);
        firstName.setText("First Name :"+editFName.getText().toString());
        lastName.setText("Last Name :"+editLName.getText().toString());
        email.setText("Email :"+editEmail.getText().toString());
    }

}