package com.example.prank;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnYes, btnNO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnYes = findViewById(R.id.btnYes);
        btnNO = findViewById(R.id.btnNo);

        btnYes.setOnClickListener(view -> openDialog());



        btnNO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int random1 = new Random().nextInt(300);
                int random2 = new Random().nextInt(200);


                ViewGroup.MarginLayoutParams s = (ViewGroup.MarginLayoutParams) btnNO.getLayoutParams();
                s.setMargins(random2, random1, 0, 0);

                btnNO.setLayoutParams(s);

            }
        });
    }

    private void openDialog() {

        DialogBox dialogBox = new DialogBox();
        dialogBox.show(getSupportFragmentManager(), "LOL");

    }
}