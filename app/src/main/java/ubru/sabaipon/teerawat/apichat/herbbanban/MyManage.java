package ubru.sabaipon.teerawat.apichat.herbbanban;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by ADMIN on 27/3/2559.
 */
public class MyManage {
    private MyOpanHelper myOpanHelper;
    private SQLiteDatabase sqLiteDatabase;

    public MyManage(Context context) {


        //การสร้างง
        myOpanHelper = new MyOpanHelper(context);
        sqLiteDatabase = myOpanHelper.getWritableDatabase();

    }//คอนเชสเตอ
}//เมนคลาส
