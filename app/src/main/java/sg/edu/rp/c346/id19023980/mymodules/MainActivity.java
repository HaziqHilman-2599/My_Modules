package sg.edu.rp.c346.id19023980.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tvC346;
TextView tvC349;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.textViewC346);
        tvC349 = findViewById(R.id.textViewC349);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Modules.class);
                intent.putExtra("Type",1);
                intent.putExtra("Code","C346");
                intent.putExtra("Name","Android Programming");
                intent.putExtra("Year",2020);
                intent.putExtra("Semester",1);
                intent.putExtra("Credit",4);
                intent.putExtra("Venue","W66M");
                startActivity(intent);
            }
        });

        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Modules.class);
                intent.putExtra("Type2",2);
                intent.putExtra("Code2","C349");
                intent.putExtra("Name2","iPad Programming");
                intent.putExtra("Year2",2020);
                intent.putExtra("Semester2",2);
                intent.putExtra("Credit2",4);
                intent.putExtra("Venue2","W66M");
                startActivity(intent);
            }
        });
    }
}
