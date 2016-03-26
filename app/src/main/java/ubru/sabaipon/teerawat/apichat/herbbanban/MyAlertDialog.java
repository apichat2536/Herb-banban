package ubru.sabaipon.teerawat.apichat.herbbanban;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by ADMIN on 26/3/2559.
 */
public class MyAlertDialog {

    public void myDialog(Context context,
                          String strTitle,
                          String strMessaga) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(R.drawable.danger);
        builder.setTitle(strTitle);
        builder.setMessage(strMessaga);
        builder.setCancelable(false);
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.dismiss();

            }
        });
        builder.show();


    } // เมสตอส

} // เมนคลาส
