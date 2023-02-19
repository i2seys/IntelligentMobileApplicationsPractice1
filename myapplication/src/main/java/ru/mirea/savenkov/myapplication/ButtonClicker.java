package ru.mirea.savenkov.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonClicker extends AppCompatActivity {

    private TextView textViewOut;
    private Button btnWhoAmI;
    private Button btnItIsNotMe ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_clicker);

        textViewOut = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewOut.setText("Мой номер по списку №22");
            }
        };


        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }
    public void btnItIsNotMeClickListener(View view){
        textViewOut.setText("Это не я сделал.");
    }
}