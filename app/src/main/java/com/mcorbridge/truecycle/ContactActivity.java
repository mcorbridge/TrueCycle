package com.mcorbridge.truecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class ContactActivity extends Activity {

    String contactText = "As a recreational cyclist who rides on Cape Cod, Massachusetts, I can't justify the cost of putting a power meter on my road bike.  " +
            "I'm not that interested watts since my main concern is whether I can keep up with the strong group.  A power" +
            "meter is not going to improve on that metric.\n\nThis winter, in an attempt to maintain some semblance of summer ride shape, I started spin classes. " +
            "The spin bikes are fitted with consoles that showed watts, and suddenly I was interested in my power output." +
            " During spin class, I could see my watts increase as I turned up the resistance and pressed on the pedals.  But what did it mean?" +
            " If I could maintain a 300 watt average over 5 minutes, did that make me Tour de France worthy?\n\nAfter finding Dr. Andy Coggan's data, the answer is a definitive no." +
            " However I was able to see where I stood relative to established cycling categories.  This app doesn't do anything that Dr. Coggan's spreadsheet can't do, it just makes it easier." +
            " I hope you will find this a useful tool to see where you currently stand, and perhaps it will motivate you to get to where you want to be.\n\nFeedback?" +
            "  I can be reached at: mikecorbridge@gmail.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        TextView textView = (TextView) findViewById(R.id.contactText);
        textView.setText(this.contactText);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        Intent intent;
        switch (item.getItemId()) {
            case R.id.action_home:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_about:
                intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_contact:
                intent = new Intent(this, ContactActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
