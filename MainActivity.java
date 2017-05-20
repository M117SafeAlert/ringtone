package com.example.ringtone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
//import android.os.Bundle;
//import android.support.v7.app.ActionBarActivity;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.widget.Button;
//import android.widget.RadioButton;
//import android.widget.Toast;


//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}

// CODE FROM SITE

public class MainActivity extends AppCompatActivity {

    Ringtone ringTone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                if(ringTone!=null){
                    //previous ringTone is playing,
                    //stop it first
                    ringTone.stop();
                }

                Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);

                if(notification == null){
                    notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE);
                }
                if(notification == null){
                    notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                }

                Ringtone r = RingtoneManager.getRingtone(getApplicationContext(), notification);
                if (r != null){
                    r.play();
                }
            }
    }

