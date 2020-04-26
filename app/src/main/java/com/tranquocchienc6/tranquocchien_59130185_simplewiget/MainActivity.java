package com.tranquocchienc6.tranquocchien_59130185_simplewiget;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText editName, editDate, editOtherHobbies;
    RadioGroup rdgSex;
    RadioButton rdbMale,rdbFeMale;
    CheckBox cbCafeWithFriends, cbAtHomeAlone, cbCook, cbWatchFilm, cbListenMusic;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
    }
    private void addView()
    {
        editName=findViewById(R.id.editName);
        editDate=findViewById(R.id.editDate);
        editOtherHobbies=findViewById(R.id.editOtherHobbies);
        rdgSex=findViewById(R.id.rdgSex);
        rdbMale=findViewById(R.id.rdbMale);
        rdbMale=findViewById(R.id.rdbFemale);
        cbAtHomeAlone=findViewById(R.id.cbAtHomeAlone);
        cbCafeWithFriends=findViewById(R.id.cbCafeWithFriend);
        cbCook=findViewById(R.id.cbCook);
        cbListenMusic=findViewById(R.id.cbListenMusic);
        cbWatchFilm=findViewById(R.id.cbWatchFilm);
        btnSubmit=findViewById(R.id.btnSubmit);
    }
    private void addEvent()
    {
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messToast();
            }
        });
    }
    private void messToast()
    {
        int sex = this.rdgSex.getCheckedRadioButtonId();
        String name = editName.getText().toString().trim();
        String date = editDate.getText().toString().trim();
        RadioButton rdbSex = this.findViewById(sex);
        String hobbies = "";
        if (cbListenMusic.isChecked()) {
            if (hobbies.length() > 0) {
                hobbies += ", ";
            }
            hobbies += "Nghe nhạc";
        }
        if (cbCafeWithFriends.isChecked()) {
            if (hobbies.length() > 0) {
                hobbies += ", ";
            }
            hobbies += "Đi Cafe với bạn bè";
        }
        if (cbCook.isChecked()) {
            if (hobbies.length() > 0) {
                hobbies += ", ";
            }
            hobbies += "Vào bếp nấu ăn";
        }
        if (cbWatchFilm.isChecked()) {
            if (hobbies.length() > 0) {
                hobbies += ", ";
            }
            hobbies += "Xem phim";
        }
        if (cbAtHomeAlone.isChecked()) {
            if (hobbies.length() > 0) {
                hobbies += ", ";
            }
            hobbies += "Ở nhà một mình";
        }
        hobbies+=", ";
        hobbies+=editOtherHobbies.getText().toString().trim();
        String text = name + "\nNgày sinh: " + date + "\nGiới tính: " + rdbSex.getText() + "\nSở thích: " + hobbies;
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}
