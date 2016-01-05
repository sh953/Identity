package com.example.android.identity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.scheduler.R;

public class SleepActivity extends Activity {

    TextView textView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setBackgroundColor(Color.TRANSPARENT);
        Button button = (Button)findViewById(R.id.button);
        button.setBackgroundColor(Color.TRANSPARENT);
        textView = (TextView)findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            boolean b = false;
            @Override
            public void onClick(View v) {
                if(b){
                    Intent intent = new Intent(SleepActivity.this, ContactsActivity.class);
                    SleepActivity.this.startActivity(intent);

                }
                textView.setText("Do you want to call somebody?");
                b=true;
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sleep, menu);
        return true;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
