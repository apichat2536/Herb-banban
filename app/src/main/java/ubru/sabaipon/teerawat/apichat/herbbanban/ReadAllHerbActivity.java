package ubru.sabaipon.teerawat.apichat.herbbanban;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReadAllHerbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_all_herb);
    }//เมนเมสตอส

    public void clickReadAll(View view) {

        startActivity(new Intent(this, HerbListView.class));


    }
    public void clickUpdate(View view) {


    }

    public void clickApprove(View view) {


    }

}//เมนคลาส
