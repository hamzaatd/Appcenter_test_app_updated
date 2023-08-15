package com.maliksoft.appcenter_test_app_updated;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCenter.start(getApplication(), "bd8025af-680b-4815-ac04-2ac9b9b2a98c",
                Analytics.class, Crashes.class);

        Toast.makeText(MainActivity.this, "this is dev branch ", Toast.LENGTH_SHORT).show();
          add();

    }

    void add(){
        int x =10;
        int y =20;
        int h =x+y;
        System.out.println(""+h);

    }

}