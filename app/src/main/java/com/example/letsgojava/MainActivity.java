package com.example.letsgojava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtView;
    private TextView submitBtn;
    private TextView nameText;
    private RelativeLayout parentElement;
    private FloatingActionButton fab;

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
         fab = findViewById(R.id.fab);
        parentElement = findViewById(R.id.parentElement);
      fab.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              showSnack();
          }
      });
    }

    public void showSnack(){
        Snackbar.make(parentElement,"An error occurred!.",Snackbar.LENGTH_INDEFINITE)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Retrying....", Toast.LENGTH_LONG).show();
                    }
                })
                .show();
    }


}