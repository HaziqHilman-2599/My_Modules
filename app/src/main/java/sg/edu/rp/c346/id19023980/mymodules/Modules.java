package sg.edu.rp.c346.id19023980.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Modules extends AppCompatActivity {
    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules);

        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvSem = findViewById(R.id.textViewSemester);
        tvCredit = findViewById(R.id.textViewCredit);
        tvVenue = findViewById(R.id.textViewVenue);

        Intent intentReceived = getIntent();
        int type = intentReceived.getIntExtra("Type",0);

        if(type==1){
            String code = intentReceived.getStringExtra("Code");
            tvCode.setText("Module Code: " + code);
            String name = intentReceived.getStringExtra("Name");
            tvName.setText("Module Name: " + name);
            int year = intentReceived.getIntExtra("Year",0);
            tvYear.setText("Academic Year:" + year);
            int sem = intentReceived.getIntExtra("Semester",0);
            tvSem.setText("Semester:" + sem);
            int credit = intentReceived.getIntExtra("Credit",0);
            tvCredit.setText("Module Credit: "+credit);
            String venue = intentReceived.getStringExtra("Venue");
            tvVenue.setText("Venue: " + venue);

        }else {
            String code = intentReceived.getStringExtra("Code2");
            tvCode.setText("Module Code: " + code);
            String name = intentReceived.getStringExtra("Name2");
            tvName.setText("Module Name: " + name);
            int year = intentReceived.getIntExtra("Year2",0);
            tvYear.setText("Academic Year:" + year);
            int sem = intentReceived.getIntExtra("Semester2",0);
            tvSem.setText("Semester:" + sem);
            int credit = intentReceived.getIntExtra("Credit2",0);
            tvCredit.setText("Module Credit: "+credit);
            String venue = intentReceived.getStringExtra("Venue2");
            tvVenue.setText("Venue: " + venue);
        }
    }
}
