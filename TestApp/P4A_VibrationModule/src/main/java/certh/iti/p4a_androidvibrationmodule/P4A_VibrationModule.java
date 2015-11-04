package certh.iti.p4a_androidvibrationmodule;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.ContextMenu;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by Nick Kaklanis on 6/17/2015.
 */
public class P4A_VibrationModule
{
    public static final long[] SuperMarioThemeIntro = {125,75,125,275,200,275,125,75,125,275,200,600,200,600};
    public static final long[] TeenageMutantNinjaTurtles = {75,75,75,75,75,75,75,75,150,150,150,450,75,75,75,75,75,525};
    public static final long[] VoltronTheme = {250,200,150,150,100,50,450,450,150,150,100,50,900,2250};
    public static final long[] FinalFantasyVictoryFanfare = {50,100,50,100,50,100,400,100,300,100,350,50,200,100,100,50,600};
    public static final long[] StarWarsImperialMarch = {500,110,500,110,450,110,200,110,170,40,450,110,200,110,170,40,500};
    public static final long[] GoGoPowerRangers = {150,150,150,150,75,75,150,150,150,150,450};
    public static final long[] ShaveAndAHaircut = {100,200,100,100,75,25,100,200,100,500,100,200,100,500};
    public static final long[] MorseCodeSOS = {100,30,100,30,100,200,200,30,200,30,200,200,100,30,100,30,100};
    public static final long[] JamesBond = {200,100,200,275,425,100,200,100,200,275,425,100,75,25,75,125,75,25,75,125,100,100};
    public static final long[] MortalKombatTheme = {100,200,100,200,100,200,100,200,100,100,100,100,100,200,100,200,100,200,100,200,100,100,100,100,100,200,100,200,100,200,100,200,100,100,100,100,100,100,100,100,100,100,50,50,100,800};
    public static final long[] MichaelJacksonSmoothCriminal = {0,300,100,50,100,50,100,50,100,50,100,50,100,50,150,150,150,450,100,50,100,50,150,150,150,450,100,50,100,50,150,150,150,450,150,150};
    public static final long[] DreamTheaterFatalTragedy = {75,38,75,488,75,38,75,200,75,38,75,400};
    public static final long[] DreamTheaterOverture1928Intro = {75,25,75,25,75,25,75,525,75,25,75,25,75,25,75,25,75,25,75,25,75,225,75,25,75,25,75,25,75,225,75,25,75,25,75,25,75,525,75,25,75,25,75,25,75,25,75,25,75,25,75,225,75,25,75,25,75,25,75,225};
    public static final long[] DreamTheaterStrangeDejaVuIntro = {100,50,100,50,100,50,100,350,100,50,100,50,100,50,100,350,100,50,100,50,100,500,100,50,100,50,100,50,100,1400};
    public static final long[] MuseMadness = {80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,320,160,320,160,320};
    public static final long[] PainOfSalvationNihilMorari = {50,50,50,50,50,50,50,550,300,300,100,200,50,50,50,50,50,50,50,250};
    public static final long[] KarnivoolCote = {75,75,75,75,75,225,75,75,75,75,75,75,75,225,75,75,75,75,75,75,75,225,75,75,75,75,75,75,75,225,75,75,75,75,75,75,75,225,75,75,75,75,75,225,75,75,75,225,75,75,75,225,75,75,75,225,75,75,75,75,75,225,75,75,75,75,75,75,75,225,75,75,75,75,75,75,75,225,75,75,75,75,75,75,75,225,75,75,75,75,75,75,75,225,75,75,75,75,75,75};
    public static final long[] TesseracTNocturne = {660,60,180,60,60,180,60,180,60,180,420,60,180,60,60,180,60,180,60,180,420,60,180,60,60,180,60,180,60,180,420,60,180,60,60,180,60,180,420,60,420,60};
    public static final long[] TesseracTPerfection = {75,225,75,75,75,75,75,225,75,225,75,225,75,75,75,225,75,225,75,75,75,75,75,225,75,225,75,225,75,75,75,225,75,225,75,75,75,75,75,225,75,225,150,150,75,75,75,225,75,375,75,75,75,75,75,225,75,225,75,225,75,75,75,225,75,225,75,75,75,75,75,225,75,225,75,225,75,75,75,225,75,225,75,75,75,75,150,150};

    public static final int ON_CLICK = 0;               //when the user either clicks or touches or focuses upon any widget like button, text, image etc.
    public static final int ON_LONG_CLICK = 1;          //when the user either clicks or touches or focuses upon any widget like button, text, image etc. for one or more seconds
    public static final int ON_FOCUS_CHANGE = 2;        //when the widget looses its focus i.e. user goes away from the view item
    public static final int ON_KEY = 3;                 //when the user is focused on the item and presses or releases a hardware key on the device
    public static final int ON_TOUCH = 4;               //when the user presses the key, releases the key, or any movement gesture on the screen
    public static final int ON_MENU_ITEM_CLICK = 5;     //when the user selects a menu item
    public static final int ON_CREATE_CONTEXT_MENU = 6; //when the context menu is being built (as the result of a sustained "long click)
    public static final int ON_DRAG = 7;

    Context mContext;
    Vibrator mVibrator;

    private static P4A_VibrationModule instance = null;

    private P4A_VibrationModule(Context curContext)
    {
        mContext = curContext;
        mVibrator = (Vibrator) curContext.getSystemService(Context.VIBRATOR_SERVICE);
    }

    public static P4A_VibrationModule getInstance(Context curContext)
    {
        if(instance == null)
            instance = new P4A_VibrationModule(curContext);
        return instance;
    }

    public boolean deviceSupportsVibration()
    {
        return mVibrator.hasVibrator();
    }

    public void stopVibration()
    {
        mVibrator.cancel();

        //if(showMessages)
        //    Toast.makeText(mContext, VIBRATION_STOPPED, Toast.LENGTH_LONG).show();
    }

    /////////////////////////////////
    // VIBRATION ON EVENT LISTENER //
    //     -specific duration-     //
    /////////////////////////////////
    public void addVibrationFeedbackOnEventListener(int tmpEventType, View tmpComponent, final long milliseconds)
    {
        if(tmpEventType == ON_CLICK) {
            tmpComponent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mVibrator.vibrate(milliseconds);
                }
            });
        }
        else if(tmpEventType == ON_LONG_CLICK)
        {
            tmpComponent.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    mVibrator.vibrate(milliseconds);
                    return false;
                }
            });
        }
        else if(tmpEventType == ON_FOCUS_CHANGE)
        {
            tmpComponent.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    mVibrator.vibrate(milliseconds);
                }
            });
        }
        else if(tmpEventType == ON_KEY)
        {
            tmpComponent.setOnKeyListener(new View.OnKeyListener() {

                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event) {
                    mVibrator.vibrate(milliseconds);
                    return false;
                }
            });
        }
        else if(tmpEventType == ON_TOUCH)
        {
            tmpComponent.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    mVibrator.vibrate(milliseconds);
                    return false;
                }
            });
        }
        else if(tmpEventType == ON_MENU_ITEM_CLICK)
        {
            ((MenuItem)tmpComponent).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    mVibrator.vibrate(milliseconds);
                    return false;
                }
            });
        }
        else if(tmpEventType == ON_CREATE_CONTEXT_MENU)
        {
            tmpComponent.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {

                @Override
                public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
                    mVibrator.vibrate(milliseconds);
                }
            });
        }
    }

    /////////////////////////////////
    // VIBRATION ON EVENT LISTENER //
    //     -specific duration-     //
    //        drag 'n drop         //
    /////////////////////////////////
    public void addVibrationFeedbackOnEventListener(int tmpEventType, View tmpComponent, View tmpDropTargetComponent, final long milliseconds)
    {
        if(tmpEventType == ON_DRAG)
        {
            class MyTouchListener implements View.OnTouchListener {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        ClipData data = ClipData.newPlainText("", "");
                        View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                        view.startDrag(data, shadowBuilder, view, 0);
                        view.setVisibility(View.INVISIBLE);

                        //vibrate
                        mVibrator.vibrate(milliseconds);

                        return true;
                    } else {
                        return false;
                    }
                }
            }

            tmpComponent.setOnTouchListener(new MyTouchListener());

            class MyDragListener implements View.OnDragListener {
                //Drawable enterShape = getResources().getDrawable(R.drawable.shape_droptarget);
                //Drawable normalShape = getResources().getDrawable(R.drawable.shape);

                @Override
                public boolean onDrag(View v, DragEvent event) {
                    int action = event.getAction();
                    switch (event.getAction()) {
                        case DragEvent.ACTION_DRAG_STARTED:
                            // do nothing
                            break;
                        case DragEvent.ACTION_DRAG_ENTERED:
                            //v.setBackgroundDrawable(enterShape);
                            break;
                        case DragEvent.ACTION_DRAG_EXITED:
                            //v.setBackgroundDrawable(normalShape);
                            break;
                        case DragEvent.ACTION_DROP:
                            // Dropped, reassign View to ViewGroup
                            View view = (View) event.getLocalState();
                            ViewGroup owner = (ViewGroup) view.getParent();
                            owner.removeView(view);
                            RelativeLayout container = (RelativeLayout) v;  //TODO -> RelativeLayout is now hardcoded -> Make it work for any component
                            container.addView(view);
                            view.setVisibility(View.VISIBLE);

                            stopVibration();
                            break;
                        case DragEvent.ACTION_DRAG_ENDED:
                            //v.setBackgroundDrawable(normalShape);
                        default:
                            break;
                    }
                    return true;
                }
            }

            tmpDropTargetComponent.setOnDragListener(new MyDragListener());
        }
    }

    /////////////////////////////////
    // VIBRATION ON EVENT LISTENER //
    //     -vibration patterns-    //
    /////////////////////////////////
    public void addVibrationFeedbackOnEventListener(int tmpEventType, View tmpComponent, final long[] pattern, final boolean repeat)
    {
        if(tmpEventType == ON_CLICK) {
            tmpComponent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (repeat)
                        mVibrator.vibrate(pattern, 0);
                    else
                        mVibrator.vibrate(pattern, -1);
                }
            });
        }
        else if(tmpEventType == ON_LONG_CLICK)
        {
            tmpComponent.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    if(repeat)
                        mVibrator.vibrate(pattern, 0);
                    else
                        mVibrator.vibrate(pattern, -1);
                    return false;
                }
            });
        }
        else if(tmpEventType == ON_FOCUS_CHANGE)
        {
            tmpComponent.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    if(repeat)
                        mVibrator.vibrate(pattern, 0);
                    else
                        mVibrator.vibrate(pattern, -1);
                }
            });
        }
        else if(tmpEventType == ON_KEY)
        {
            tmpComponent.setOnKeyListener(new View.OnKeyListener() {

                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event) {
                    if(repeat)
                        mVibrator.vibrate(pattern, 0);
                    else
                        mVibrator.vibrate(pattern, -1);
                    return false;
                }
            });
        }
        else if(tmpEventType == ON_TOUCH)
        {
            tmpComponent.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    if(repeat)
                        mVibrator.vibrate(pattern, 0);
                    else
                        mVibrator.vibrate(pattern, -1);
                    return false;
                }
            });
        }
        else if(tmpEventType == ON_MENU_ITEM_CLICK)
        {
            ((MenuItem)tmpComponent).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    if(repeat)
                        mVibrator.vibrate(pattern, 0);
                    else
                        mVibrator.vibrate(pattern, -1);
                    return false;
                }
            });
        }
        else if(tmpEventType == ON_CREATE_CONTEXT_MENU)
        {
            tmpComponent.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {

                @Override
                public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
                    if(repeat)
                        mVibrator.vibrate(pattern, 0);
                    else
                        mVibrator.vibrate(pattern, -1);
                }
            });
        }
    }

    /////////////////////////////////
    // VIBRATION ON EVENT LISTENER //
    //     -vibration patterns-    //
    //        drag 'n drop         //
    /////////////////////////////////
    public void addVibrationFeedbackOnEventListener(int tmpEventType, View tmpComponent, View tmpDropTargetComponent, final long[] pattern, final boolean repeat)
    {
        if(tmpEventType == ON_DRAG)
        {
            class MyTouchListener implements View.OnTouchListener {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        ClipData data = ClipData.newPlainText("", "");
                        View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                        view.startDrag(data, shadowBuilder, view, 0);
                        view.setVisibility(View.INVISIBLE);

                        //vibrate
                        if(repeat)
                            mVibrator.vibrate(pattern, 0);
                        else
                            mVibrator.vibrate(pattern, -1);

                        return true;
                    } else {
                        return false;
                    }
                }
            }

            tmpComponent.setOnTouchListener(new MyTouchListener());

            class MyDragListener implements View.OnDragListener {
                //Drawable enterShape = getResources().getDrawable(R.drawable.shape_droptarget);
                //Drawable normalShape = getResources().getDrawable(R.drawable.shape);

                @Override
                public boolean onDrag(View v, DragEvent event) {
                    int action = event.getAction();
                    switch (event.getAction()) {
                        case DragEvent.ACTION_DRAG_STARTED:
                            // do nothing
                            break;
                        case DragEvent.ACTION_DRAG_ENTERED:
                            //v.setBackgroundDrawable(enterShape);
                            break;
                        case DragEvent.ACTION_DRAG_EXITED:
                            //v.setBackgroundDrawable(normalShape);
                            break;
                        case DragEvent.ACTION_DROP:
                            // Dropped, reassign View to ViewGroup
                            View view = (View) event.getLocalState();
                            ViewGroup owner = (ViewGroup) view.getParent();
                            owner.removeView(view);
                            RelativeLayout container = (RelativeLayout) v;  //TODO -> RelativeLayout is now hardcoded -> Make it work for any component
                            container.addView(view);
                            view.setVisibility(View.VISIBLE);

                            stopVibration();
                            break;
                        case DragEvent.ACTION_DRAG_ENDED:
                            //v.setBackgroundDrawable(normalShape);
                        default:
                            break;
                    }
                    return true;
                }
            }

            tmpDropTargetComponent.setOnDragListener(new MyDragListener());
        }
    }

    ///////////////////////////
    //   VIBRATE DIRECTLY    //
    //  -specific duration-  //
    ///////////////////////////
    public void vibrate(long milliseconds)
    {
        //IT NEEDS ANDROID VERSION >= 21
        //AudioAttributes VIBRATION_ATTRIBUTES = new AudioAttributes.Builder()
        //    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
        //    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
        //    .build();
        mVibrator.vibrate(milliseconds/*, VIBRATION_ATTRIBUTES*/);
    }

    ////////////////////////////
    //    VIBRATE DIRECTLY    //
    //  -vibration patterns-  //
    ////////////////////////////
    public void vibrate(long[] pattern, boolean repeat)
    {
        if(repeat)
            mVibrator.vibrate(pattern, 0);
        else
            mVibrator.vibrate(pattern, -1);
    }
}
