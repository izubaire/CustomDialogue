package com.example.customdialogue;



import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(v->{
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(R.string.message)
                    .setTitle(R.string.title)
                    .setPositiveButton(R.string.positive_res, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            textView = findViewById(R.id.textView);
                            textView.setText(R.string.save_message);
                        }
                    })
                    .setNegativeButton(R.string.negative_res, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            textView = findViewById(R.id.textView);
                            textView.setText(R.string.lost_message);
                        }
                    });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        });

    }
}