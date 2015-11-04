package certh.iti.testapp;

import android.content.Context;
import android.os.Vibrator;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import certh.iti.p4a_androidvibrationmodule.P4A_VibrationModule;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add vibration feedback using the P4A Vibration Module
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_CLICK, findViewById(R.id.button1), 2000);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_LONG_CLICK, findViewById(R.id.button2), 2000);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_FOCUS_CHANGE, findViewById(R.id.button3), 2000);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_KEY, findViewById(R.id.button4), 2000);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_TOUCH, findViewById(R.id.button5), 2000);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_CREATE_CONTEXT_MENU, findViewById(R.id.button6), 2000);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_DRAG, findViewById(R.id.button7), findViewById(R.id.mainContainer), 2000);

        //vibration patterns - no repeat
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_CLICK, findViewById(R.id.button1p), P4A_VibrationModule.JamesBond, false);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_LONG_CLICK, findViewById(R.id.button2p), P4A_VibrationModule.JamesBond, false);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_FOCUS_CHANGE, findViewById(R.id.button3p), P4A_VibrationModule.JamesBond, false);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_KEY, findViewById(R.id.button4p), P4A_VibrationModule.JamesBond, false);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_TOUCH, findViewById(R.id.button5p), P4A_VibrationModule.JamesBond, false);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_CREATE_CONTEXT_MENU, findViewById(R.id.button6p), P4A_VibrationModule.JamesBond, false);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_DRAG, findViewById(R.id.button7p), findViewById(R.id.mainContainer), P4A_VibrationModule.JamesBond, false);

        //vibration patterns - repeat
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_CLICK, findViewById(R.id.button1pr), P4A_VibrationModule.JamesBond, true);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_LONG_CLICK, findViewById(R.id.button2pr), P4A_VibrationModule.JamesBond, true);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_FOCUS_CHANGE, findViewById(R.id.button3pr), P4A_VibrationModule.JamesBond, true);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_KEY, findViewById(R.id.button4pr), P4A_VibrationModule.JamesBond, true);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_TOUCH, findViewById(R.id.button5pr), P4A_VibrationModule.JamesBond, true);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_CREATE_CONTEXT_MENU, findViewById(R.id.button6pr), P4A_VibrationModule.JamesBond, true);
        P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_DRAG, findViewById(R.id.button7pr), findViewById(R.id.mainContainer), P4A_VibrationModule.JamesBond, true);
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void btnClick1(View view) {
        P4A_VibrationModule.getInstance(this).vibrate(2000);
        Toast.makeText(getApplicationContext(), "Vibration with specific duration", Toast.LENGTH_LONG).show();
    }

    public void btnClick2(View view) {
        P4A_VibrationModule.getInstance(this).vibrate(P4A_VibrationModule.JamesBond, false);
        Toast.makeText(getApplicationContext(), "Vibration with pattern", Toast.LENGTH_LONG).show();
    }
}
