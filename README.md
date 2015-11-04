P4A_AndroidVibrationModule
==========================

An Android Library that offers a mechanism for easily adding vibration feedback to Android applications.

The source code contains two main directories:

1) [P4A_AndroidVibrationModule](https://github.com/P4ALLcerthiti/AndroidVibrationModule/tree/master/P4A_VibrationModule): This includes the source code of the P4A_AndroidVibrationModule

2) [MyTestApp](https://github.com/P4ALLcerthiti/AndroidVibrationModule/tree/master/MyTestApp): This includes the source code of a sample application that uses the P4A_AndroidVibrationModule

## Main features

The main features of the P4A AndroidVibrationModule include the following:
- A set of predefined [vibration patterns](https://github.com/P4ALLcerthiti/AndroidVibrationModule/blob/master/P4A_VibrationModule/src/main/java/certh/iti/p4a_androidvibrationmodule/P4A_VibrationModule.java#L26-L44)
- Vibration feedback when different events are fired: [ON_CLICK](https://github.com/P4ALLcerthiti/AndroidVibrationModule/blob/master/P4A_VibrationModule/src/main/java/certh/iti/p4a_androidvibrationmodule/P4A_VibrationModule.java#L46), [ON_LONG_CLICK](https://github.com/P4ALLcerthiti/AndroidVibrationModule/blob/master/P4A_VibrationModule/src/main/java/certh/iti/p4a_androidvibrationmodule/P4A_VibrationModule.java#L47), [ON_FOCUS_CHANGE](https://github.com/P4ALLcerthiti/AndroidVibrationModule/blob/master/P4A_VibrationModule/src/main/java/certh/iti/p4a_androidvibrationmodule/P4A_VibrationModule.java#L48), [ON_KEY](https://github.com/P4ALLcerthiti/AndroidVibrationModule/blob/master/P4A_VibrationModule/src/main/java/certh/iti/p4a_androidvibrationmodule/P4A_VibrationModule.java#L49), [ON_TOUCH](https://github.com/P4ALLcerthiti/AndroidVibrationModule/blob/master/P4A_VibrationModule/src/main/java/certh/iti/p4a_androidvibrationmodule/P4A_VibrationModule.java#L50), [ON_MENU_ITEM_CLICK](https://github.com/P4ALLcerthiti/AndroidVibrationModule/blob/master/P4A_VibrationModule/src/main/java/certh/iti/p4a_androidvibrationmodule/P4A_VibrationModule.java#L51), [ON_CREATE_CONTEXT_MENU](https://github.com/P4ALLcerthiti/AndroidVibrationModule/blob/master/P4A_VibrationModule/src/main/java/certh/iti/p4a_androidvibrationmodule/P4A_VibrationModule.java#L52), [ON_DRAG](https://github.com/P4ALLcerthiti/AndroidVibrationModule/blob/master/P4A_VibrationModule/src/main/java/certh/iti/p4a_androidvibrationmodule/P4A_VibrationModule.java#L53)
- Offering various functions for [starting vibration](https://github.com/P4ALLcerthiti/AndroidVibrationModule/blob/master/P4A_VibrationModule/src/main/java/certh/iti/p4a_androidvibrationmodule/P4A_VibrationModule.java#L404-L429), [stoping vibration](https://github.com/P4ALLcerthiti/AndroidVibrationModule/blob/master/P4A_VibrationModule/src/main/java/certh/iti/p4a_androidvibrationmodule/P4A_VibrationModule.java#L78-L84), [examining if device supports vibration](https://github.com/P4ALLcerthiti/AndroidVibrationModule/blob/master/P4A_VibrationModule/src/main/java/certh/iti/p4a_androidvibrationmodule/P4A_VibrationModule.java#L73-L76), etc.

## Usage instructions

A complete example showing how the P4A AndroidVibrationModule can be used to add vibration vibration feedback to the GUI components of an Android application can be found [here](https://github.com/P4ALLcerthiti/AndroidVibrationModule/tree/master/MyTestApp).

Adding haptic feedback in a GUI component (e.g. button, etc.) can be achieved using the P4A AndroidVibrationModule by a simple line of code:

	P4A_VibrationModule.getInstance(this).addVibrationFeedbackOnEventListener(P4A_VibrationModule.ON_CLICK, findViewById(R.id.button1), 2000);

The example above adds vibration feedback to "button1". In particular, when this button is clicked, it vibrates for 2 seconds.

Further examples can be found [here](https://github.com/P4ALLcerthiti/AndroidVibrationModule/blob/master/MyTestApp/src/main/java/certh/iti/testapp/MainActivity.java#L23-L48).

## Funding Acknowledgement

The research leading to these results has received funding from the European Union's Seventh Framework Programme (FP7) under grant agreement No.610510