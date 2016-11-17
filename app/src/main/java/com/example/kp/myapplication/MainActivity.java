package com.example.kp.myapplication;

import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btoast = (Button) findViewById(R.id.Toast);
        final Button bnotif = (Button) findViewById(R.id.Notification);
        final Button bdialog = (Button) findViewById(R.id.Dialog);
        btoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast Toast = null;
                Toast.makeText(getApplicationContext(), "Hey There is short click", Toast.LENGTH_SHORT).show();
            }


        });

        btoast.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                Toast.makeText(getApplicationContext(), "Hey There is long Click", Toast.LENGTH_LONG).show();

                return true;
            }


        });



        bdialog.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                AlertDialog.Builder alertDB = new AlertDialog.Builder(MainActivity.this);
                alertDB.setMessage("Are you sure");
                alertDB.setTitle("heeeer");

                AlertDialog alertDialog = alertDB.create();
                alertDialog.show();
            }
        });

        bnotif.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                Notification.Builder builder = new Notification.Builder(getApplicationContext());
                Notification notification = builder
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle("Notification")
                        .setContentText("Je suis une notification " )
                        .build();
                NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManager.notify(0,notification);



            }

        });


    }
}






