package ubru.sabaipon.teerawat.apichat.herbbanban;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class HerbListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herb_list_view);

        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpanHelper.database_name,
                MODE_PRIVATE, null);
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + MyManage.herb_table, null);
        cursor.moveToFirst();
        int intCount = cursor.getCount();

        String[] nameStrings = new String[intCount];
        String[] imageStrings = new String[intCount];

        for (int i = 0; i < intCount; i++) {

            nameStrings[i] = cursor.getString(1);
            imageStrings[i] = cursor.getString(2);

            cursor.moveToNext();
        }   // for
        cursor.close();

        HerbAdapter herbAdapter = new HerbAdapter(this, imageStrings, nameStrings);
        ListView herbListView = (ListView) findViewById(R.id.listView);
        herbListView.setAdapter(herbAdapter);


    }   // Main Method

}   // Main Class