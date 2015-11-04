package certh.iti.p4a_androidvibrationmodule;

import android.app.Activity;
import android.content.Context;
import android.os.Vibrator;

/**
 * Created by nkak on 6/17/2015.
 */
public class P4A_VibrationModule extends Activity
{
    Vibrator mVibrator;

    int dot = 200; // Length of a Morse Code "dot" in milliseconds
    int dash = 500; // Length of a Morse Code "dash" in milliseconds
    int short_gap = 200; // Length of Gap Between dots/dashes
    int medium_gap = 500; // Length of Gap Between Letters
    int long_gap = 1000; // Length of Gap Between Words

    long[] pattern = { 0, // Start immediately
            dot, short_gap, dot, short_gap, dot, // s
            medium_gap, dash, short_gap, dash, short_gap, dash, // o
            medium_gap, dot, short_gap, dot, short_gap, dot, // s
            long_gap };

    private static P4A_VibrationModule instance = null;

    private P4A_VibrationModule()
    {
        mVibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
    }

    public static P4A_VibrationModule getInstance()
    {
        if(instance == null)
            instance = new P4A_VibrationModule();
        return instance;
    }

    public void vibrate()
    {
        mVibrator.vibrate(300);
    }
}
