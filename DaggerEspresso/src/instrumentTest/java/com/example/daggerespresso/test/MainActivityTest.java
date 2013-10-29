package com.example.daggerespresso.test;

import android.test.ActivityInstrumentationTestCase2;

import com.example.daggerespresso.MainActivity;
import com.example.daggerespresso.R;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.isDisplayed;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;

/**
 * Created by mwolfe on 10/28/13.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super(MainActivity.class);
    }

    public void testActivity() {
        getActivity();
        onView(withId(R.id.HelloWorld)).check(matches(isDisplayed()));
    }

}