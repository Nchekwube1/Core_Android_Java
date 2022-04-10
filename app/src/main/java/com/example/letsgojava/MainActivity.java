package com.example.letsgojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtView;
    private TextView submitBtn;
    private TextView nameText;
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.submitBtn:
                Toast.makeText(this, "Helllllo! from mofuckin' toast", Toast.LENGTH_SHORT).show();
                txtView.setText(nameText.getText().toString());
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         txtView = findViewById(R.id.textView);
         submitBtn  = findViewById(R.id.submitBtn);
         nameText = findViewById(R.id.nameText);
         submitBtn.setOnClickListener(this);

    }


}