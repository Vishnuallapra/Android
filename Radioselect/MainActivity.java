
package com.example.newex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void radioHandle(View view){
        boolean selected = ((RadioButton)view).isChecked();
        switch (view.getId())
        {
            case R.id.r1:
                if(selected)
                    Toast.makeText(this,"Male is selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.r2:
                if(selected)
                    Toast.makeText(this,"Female is selected",Toast.LENGTH_SHORT).show();
                break;
        }

    }

}