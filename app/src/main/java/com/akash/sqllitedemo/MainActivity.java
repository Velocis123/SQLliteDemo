package com.akash.sqllitedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.akash.sqllitedemo.Model.Details;




public class MainActivity extends AppCompatActivity   {
EditText txt_setdate;
EditText txt_roll,txt_name;
RadioGroup radioGroup;
Button btn_save;
    RadioButton radioButton;
    Button btn_show;
    DatabaseHandler db = new DatabaseHandler(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

txt_roll = findViewById(R.id.edt_roll);
txt_name = findViewById(R.id.edt_name);
radioGroup = findViewById(R.id.radio_grp);
btn_save = findViewById(R.id.btn_save);
btn_show = findViewById(R.id.btn_show);
        radioButton    =findViewById(radioGroup.getCheckedRadioButtonId());
//txt_setdate.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        Calendar now = Calendar.getInstance();
//        DatePickerDialog dpd = DatePickerDialog.newInstance(
//                MainActivity.this,
//                now.get(Calendar.YEAR), // Initial year selection
//                now.get(Calendar.MONTH), // Initial month selection
//                now.get(Calendar.DAY_OF_MONTH) // Inital day selection
//        );
//   dpd.show(getSupportFragmentManager(),"DATE");
//    }
//});


btn_save.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        add_details();

    }
});

btn_show.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent intent = new Intent(MainActivity.this,Activity_output.class);
        startActivity(intent);


    }
});




    }
    private void add_details(){

String roll = txt_roll.getText().toString();
        String name = txt_name.getText().toString();
        RadioButton radioButton =findViewById(radioGroup.getCheckedRadioButtonId());

        String gender = radioButton.getText().toString();
        Details details = new Details(roll,name,gender);

db.add_details(details);
        Toast.makeText(this,"Details Saved",Toast.LENGTH_SHORT).show();

    }


//    @Override
//    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
//        String date = "You picked the following date: "+dayOfMonth+"/"+(monthOfYear+1)+"/"+year;
//        txt_setdate.setText(date);
//    }
}
