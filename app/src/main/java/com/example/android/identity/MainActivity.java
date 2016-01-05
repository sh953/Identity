/*
 * Copyright 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.identity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.android.scheduler.R;


public class MainActivity extends Activity {
    AlarmReceiver alarm = new AlarmReceiver();
    Button alarmButton;
    Button gamesButton;
    Button toDoButton;
    Button infoButton;
    Button contactsButton;
    Button demoButton;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alarmButton = (Button)findViewById(R.id.alarmButton);
        alarmButton.setBackgroundColor(Color.TRANSPARENT);
        alarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PillActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });

        gamesButton = (Button)findViewById(R.id.gamesButton);
        gamesButton.setBackgroundColor(Color.TRANSPARENT);
        gamesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        toDoButton = (Button)findViewById(R.id.toDoButton);
        toDoButton.setBackgroundColor(Color.TRANSPARENT);
        toDoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        infoButton = (Button)findViewById(R.id.infoButton);
        infoButton.setBackgroundColor(Color.TRANSPARENT);
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        contactsButton = (Button)findViewById(R.id.contactsButton);
        contactsButton.setBackgroundColor(Color.TRANSPARENT);
        contactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ContactsActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });

        demoButton = (Button)findViewById(R.id.demoButton);
        demoButton.setBackgroundColor(Color.TRANSPARENT);
        demoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SleepActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            // When the user clicks START ALARM, set the alarm.
            case R.id.start_action:
                alarm.setAlarm(this);

                return true;
            // When the user clicks CANCEL ALARM, cancel the alarm.
            case R.id.cancel_action:
                Intent intent = new Intent(MainActivity.this, TodayActivity.class);
                MainActivity.this.startActivity(intent);
        }
        return false;


    }
}
