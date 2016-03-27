package ubru.sabaipon.teerawat.apichat.herbbanban;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by ADMIN on 27/3/2559.
 */
public class MyManage {
    private MyOpanHelper myOpanHelper;
    private SQLiteDatabase sqLiteDatabase;

    public static final String user_table = "userTABLE";
    public static final String colum_id = "_id";
    public static final String colum_User = "User";
    public static final String colum_Password = "Password";
    public static final String colum_Status = "Status";
    public static final String colum_Name = "Name";
    public static final String colum_Surname = "Surname";
    public static final String colum_Phone = "Phone";
    public static final String colum_Address = "Address";


    public static final String herb_table = "herbTABLE";
    public static final String colum_Image = "Image";
    public static final String colum_Description = "Description";
    public static final String colum_HowTo = "HowTo";
    public static final String colum_Lat = "Lat";
    public static final String colum_Lng = "Lng";


    public MyManage(Context context) {


        //การสร้างง
        myOpanHelper = new MyOpanHelper(context);
        sqLiteDatabase = myOpanHelper.getWritableDatabase();

    }//คอนเชสเตอ






    public long addValueToSQLite(int intTABLE,
                                 String strColumn1,
                                 String strColumn2,
                                 String strColumn3,
                                 String strColumn4,
                                 String strColumn5,
                                 String strColumn6,
                                 String strColumn7) {


        long myLong = 0;
        ContentValues contentValues = new ContentValues();
        switch (intTABLE) {

            case 0:

                contentValues.put(colum_User, strColumn1);
                contentValues.put(colum_Password, strColumn2);
                contentValues.put(colum_Status, strColumn3);
                contentValues.put(colum_Name, strColumn4);
                contentValues.put(colum_Surname, strColumn5);
                contentValues.put(colum_Phone, strColumn6);
                contentValues.put(colum_Address, strColumn7);

                myLong = sqLiteDatabase.insert(user_table, null, contentValues);

                break;
            case 1:

                contentValues.put(colum_Name, strColumn1);
                contentValues.put(colum_Image, strColumn2);
                contentValues.put(colum_Description, strColumn3);
                contentValues.put(colum_HowTo, strColumn4);
                contentValues.put(colum_Lat, strColumn5);
                contentValues.put(colum_Lng, strColumn6);
                contentValues.put(colum_Status, strColumn7);

                myLong = sqLiteDatabase.insert(herb_table, null, contentValues);

                break;
        }//สวิท

        return myLong;
    }

}//เมนคลาส
