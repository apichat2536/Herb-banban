package ubru.sabaipon.teerawat.apichat.herbbanban;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {
    //ประกาศตัวแปร
    private EditText userEditText,passwordEditText,nameEditText,
            surnameEditText,phoneEditText,addressEditText;
    private String userString,passwordString,nameString,
        surnameString,phoneString,addressString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // การผูก
        bindwidget();


    } //Main Method

    private void bindwidget() {
        userEditText = (EditText)findViewById(R.id.editText3);
        passwordEditText = (EditText) findViewById(R.id.editText4);
        nameEditText = (EditText) findViewById(R.id.editText5);
        surnameEditText = (EditText) findViewById(R.id.editText6);
        phoneEditText = (EditText) findViewById(R.id.editText7);
        addressEditText = (EditText) findViewById(R.id.editText8);


    }//ขอบเขตเมตตอส
} // Main class
