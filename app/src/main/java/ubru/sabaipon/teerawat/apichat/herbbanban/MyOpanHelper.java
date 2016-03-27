package ubru.sabaipon.teerawat.apichat.herbbanban;

import android.content.Context;

/**
 * Created by ADMIN on 27/3/2559.
 */
public class MyOpanHelper {
    //ฉันประกาศตัวแปร
    public static final String database_name = "Herb.db";
    private static final int database_version = 1;

    private static final String create_user_table = "Create table userTABLE(" +
            "_id integer primary key," +
            "User text," +
            "Password text," +
            "Stasus text," +
            "Name text," +
            "Surname text," +
            "Phone text," +
            "Address text);";

    private static final String create_herb_table = "";

    public MyOpanHelper(Context context) {

    }//ชื่อคลาส

}//เมนคลาส
