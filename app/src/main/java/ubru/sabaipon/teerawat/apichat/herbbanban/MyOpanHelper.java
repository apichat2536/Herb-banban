package ubru.sabaipon.teerawat.apichat.herbbanban;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ADMIN on 27/3/2559.
 */
public class MyOpanHelper extends SQLiteOpenHelper{
    //ฉันประกาศตัวแปร
    public static final String database_name = "Herb.db";
    private static final int database_version = 1;

    private static final String create_user_table = "Create table userTABLE(" +
            "_id integer primary key," +
            "User text," +
            "Password text," +
            "Status text," +
            "Name text," +
            "Surname text," +
            "Phone text," +
            "Address text);";

    private static final String create_herb_table = "create table herbTABLE(" +
            "_id integer primary key," +
            "Name text," +
            "Image text," +
            "Description text," +
            "HowTo text," +
            "Lat text," +
            "Lng text," +
            "Status text);";

    public MyOpanHelper(Context context) {
        super(context,database_name,null,database_version);

    }//ชื่อคลาส

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(create_user_table);
        sqLiteDatabase.execSQL(create_herb_table);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}//เมนคลาส
