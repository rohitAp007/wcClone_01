package com.example.whatsappclone;


import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import static androidx.test.InstrumentationRegistry.getInstrumentation;
import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import com.example.whatsappclone.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
    ViewInteraction appCompatEditText = onView(
allOf(withId(R.id.login_email),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
1)));
    appCompatEditText.perform(scrollTo(), replaceText("rohitparsode71@gmail.com"), closeSoftKeyboard());
    
    ViewInteraction appCompatEditText2 = onView(
allOf(withId(R.id.login_email), withText("rohitparsode71@gmail.com"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
1)));
    appCompatEditText2.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText3 = onView(
allOf(withId(R.id.login_email), withText("rohitparsode71@gmail.com"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
1)));
    appCompatEditText3.perform(scrollTo(), replaceText("rohitparsode71@gmail.c"));
    
    ViewInteraction appCompatEditText4 = onView(
allOf(withId(R.id.login_email), withText("rohitparsode71@gmail.c"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
1),
isDisplayed()));
    appCompatEditText4.perform(closeSoftKeyboard());
    
    ViewInteraction appCompatEditText5 = onView(
allOf(withId(R.id.login_password),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText5.perform(scrollTo(), replaceText("rohit"), closeSoftKeyboard());
    
    ViewInteraction appCompatEditText6 = onView(
allOf(withId(R.id.login_email), withText("rohitparsode71@gmail.c"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
1)));
    appCompatEditText6.perform(scrollTo(), replaceText("rohitparsode71@gmail.com"));
    
    ViewInteraction appCompatEditText7 = onView(
allOf(withId(R.id.login_email), withText("rohitparsode71@gmail.com"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
1),
isDisplayed()));
    appCompatEditText7.perform(closeSoftKeyboard());
    
    ViewInteraction appCompatEditText8 = onView(
allOf(withId(R.id.login_password), withText("rohit"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText8.perform(scrollTo(), replaceText("rohit@111"));
    
    ViewInteraction appCompatEditText9 = onView(
allOf(withId(R.id.login_password), withText("rohit@111"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2),
isDisplayed()));
    appCompatEditText9.perform(closeSoftKeyboard());
    
    pressBack();
    
    ViewInteraction appCompatButton = onView(
allOf(withId(R.id.login_btn), withText("LogIn"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
4)));
    appCompatButton.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText10 = onView(
allOf(withId(R.id.login_password), withText("rohit@111"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText10.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText11 = onView(
allOf(withId(R.id.login_password), withText("rohit@111"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText11.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText12 = onView(
allOf(withId(R.id.login_password), withText("rohit@111"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText12.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText13 = onView(
allOf(withId(R.id.login_password), withText("rohit@111"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText13.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText14 = onView(
allOf(withId(R.id.login_password), withText("rohit@111"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText14.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText15 = onView(
allOf(withId(R.id.login_password), withText("rohit@111"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText15.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText16 = onView(
allOf(withId(R.id.login_password), withText("rohit@111"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText16.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText17 = onView(
allOf(withId(R.id.login_password), withText("rohit@111"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText17.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText18 = onView(
allOf(withId(R.id.login_password), withText("rohit@111"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText18.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText19 = onView(
allOf(withId(R.id.login_password), withText("rohit@111"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText19.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText20 = onView(
allOf(withId(R.id.login_password), withText("rohit@111"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText20.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText21 = onView(
allOf(withId(R.id.login_password), withText("rohit@111"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText21.perform(scrollTo(), replaceText("rohit@11"));
    
    ViewInteraction appCompatEditText22 = onView(
allOf(withId(R.id.login_password), withText("rohit@11"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2),
isDisplayed()));
    appCompatEditText22.perform(closeSoftKeyboard());
    
    ViewInteraction appCompatEditText23 = onView(
allOf(withId(R.id.login_password), withText("rohit@11"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText23.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText24 = onView(
allOf(withId(R.id.login_password), withText("rohit@11"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText24.perform(scrollTo(), replaceText("rohi@11"));
    
    ViewInteraction appCompatEditText25 = onView(
allOf(withId(R.id.login_password), withText("rohi@11"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2),
isDisplayed()));
    appCompatEditText25.perform(closeSoftKeyboard());
    
    ViewInteraction appCompatEditText26 = onView(
allOf(withId(R.id.login_password), withText("rohi@11"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText26.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText27 = onView(
allOf(withId(R.id.login_password), withText("rohi@11"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText27.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText28 = onView(
allOf(withId(R.id.login_password), withText("rohi@11"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText28.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText29 = onView(
allOf(withId(R.id.login_password), withText("rohi@11"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText29.perform(scrollTo(), replaceText(""));
    
    ViewInteraction appCompatEditText30 = onView(
allOf(withId(R.id.login_password),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2),
isDisplayed()));
    appCompatEditText30.perform(closeSoftKeyboard());
    
    ViewInteraction appCompatEditText31 = onView(
allOf(withId(R.id.login_password),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText31.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText32 = onView(
allOf(withId(R.id.login_password),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText32.perform(scrollTo(), replaceText("pass@111"), closeSoftKeyboard());
    
    ViewInteraction appCompatEditText33 = onView(
allOf(withId(R.id.login_password), withText("pass@111"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText33.perform(pressImeActionButton());
    
    ViewInteraction appCompatButton2 = onView(
allOf(withId(R.id.login_btn), withText("LogIn"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
4)));
    appCompatButton2.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText34 = onView(
allOf(withId(R.id.login_password), withText("pass@111"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText34.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText35 = onView(
allOf(withId(R.id.login_password), withText("pass@111"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText35.perform(scrollTo(), replaceText(""));
    
    ViewInteraction appCompatEditText36 = onView(
allOf(withId(R.id.login_password),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2),
isDisplayed()));
    appCompatEditText36.perform(closeSoftKeyboard());
    
    pressBack();
    
    ViewInteraction appCompatEditText37 = onView(
allOf(withId(R.id.login_email), withText("rohitparsode71@gmail.com"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
1)));
    appCompatEditText37.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText38 = onView(
allOf(withId(R.id.login_email), withText("rohitparsode71@gmail.com"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
1)));
    appCompatEditText38.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText39 = onView(
allOf(withId(R.id.login_email), withText("rohitparsode71@gmail.com"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
1)));
    appCompatEditText39.perform(scrollTo(), click());
    
    ViewInteraction appCompatEditText40 = onView(
allOf(withId(R.id.login_email), withText("rohitparsode71@gmail.com"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
1)));
    appCompatEditText40.perform(scrollTo(), replaceText("rohitparsode71@gmail.com"));
    
    ViewInteraction appCompatEditText41 = onView(
allOf(withId(R.id.login_email), withText("rohitparsode71@gmail.com"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
1),
isDisplayed()));
    appCompatEditText41.perform(closeSoftKeyboard());
    
    ViewInteraction appCompatEditText42 = onView(
allOf(withId(R.id.login_password),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText42.perform(scrollTo(), replaceText("rohit@111"), closeSoftKeyboard());
    
    ViewInteraction appCompatEditText43 = onView(
allOf(withId(R.id.login_password), withText("rohit@111"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
2)));
    appCompatEditText43.perform(pressImeActionButton());
    
    ViewInteraction appCompatButton3 = onView(
allOf(withId(R.id.login_btn), withText("LogIn"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
4)));
    appCompatButton3.perform(scrollTo(), click());
    
    ViewInteraction appCompatButton4 = onView(
allOf(withId(R.id.login_btn), withText("LogIn"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
4)));
    appCompatButton4.perform(scrollTo(), click());
    
    ViewInteraction appCompatButton5 = onView(
allOf(withId(R.id.login_btn), withText("LogIn"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.ScrollView")),
0),
4)));
    appCompatButton5.perform(scrollTo(), click());
    
    ViewInteraction recyclerView = onView(
allOf(withId(R.id.chat_recyclerview),
childAtPosition(
withClassName(is("android.widget.RelativeLayout")),
0)));
    recyclerView.perform(actionOnItemAtPosition(0, click()));
    
    pressBack();
    
    ViewInteraction tabView = onView(
allOf(withContentDescription("Request"),
childAtPosition(
childAtPosition(
withId(R.id.main_tabs),
0),
2),
isDisplayed()));
    tabView.perform(click());
    
    ViewInteraction floatingActionButton = onView(
allOf(withId(R.id.request_float_btn), withContentDescription("FloatingActionButton request"),
childAtPosition(
withParent(withId(R.id.main_tab_viewPager)),
1),
isDisplayed()));
    floatingActionButton.perform(click());
    
    ViewInteraction recyclerView2 = onView(
allOf(withId(R.id.findff_recyclerview),
childAtPosition(
withId(R.id.main),
1)));
    recyclerView2.perform(actionOnItemAtPosition(6, click()));
    
    ViewInteraction appCompatButton6 = onView(
allOf(withId(R.id.Send_Message), withText("Cancel Chat Request"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
4),
isDisplayed()));
    appCompatButton6.perform(click());
    
    pressBack();
    
    ViewInteraction recyclerView3 = onView(
allOf(withId(R.id.findff_recyclerview),
childAtPosition(
withId(R.id.main),
1)));
    recyclerView3.perform(actionOnItemAtPosition(3, click()));
    
    ViewInteraction appCompatButton7 = onView(
allOf(withId(R.id.Send_Message), withText("Send Message"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
4),
isDisplayed()));
    appCompatButton7.perform(click());
    
    pressBack();
    
    pressBack();
    
    ViewInteraction tabView2 = onView(
allOf(withContentDescription("Status"),
childAtPosition(
childAtPosition(
withId(R.id.main_tabs),
0),
1),
isDisplayed()));
    tabView2.perform(click());
    
    ViewInteraction tabView3 = onView(
allOf(withContentDescription("Status"),
childAtPosition(
childAtPosition(
withId(R.id.main_tabs),
0),
1),
isDisplayed()));
    tabView3.perform(click());
    
    ViewInteraction floatingActionButton2 = onView(
allOf(withId(R.id.chat_float_btn),
childAtPosition(
withParent(withId(R.id.main_tab_viewPager)),
1),
isDisplayed()));
    floatingActionButton2.perform(click());
    
    ViewInteraction circleImageView = onView(
allOf(withId(R.id.status_image),
childAtPosition(
allOf(withId(R.id.unhide),
childAtPosition(
withClassName(is("android.widget.RelativeLayout")),
1)),
0),
isDisplayed()));
    circleImageView.perform(click());
    
    ViewInteraction circleImageView2 = onView(
allOf(withId(R.id.status_image),
childAtPosition(
allOf(withId(R.id.unhide),
childAtPosition(
withClassName(is("android.widget.RelativeLayout")),
1)),
0),
isDisplayed()));
    circleImageView2.perform(click());
    
    ViewInteraction recyclerView4 = onView(
allOf(withId(R.id.chat_recyclerview),
childAtPosition(
withClassName(is("android.widget.RelativeLayout")),
0)));
    recyclerView4.perform(actionOnItemAtPosition(0, click()));
    
    ViewInteraction appCompatEditText44 = onView(
allOf(withId(R.id.chat_input_message),
childAtPosition(
childAtPosition(
withId(R.id.cardView),
0),
0),
isDisplayed()));
    appCompatEditText44.perform(replaceText("hii"), closeSoftKeyboard());
    
    ViewInteraction appCompatImageButton = onView(
allOf(withId(R.id.send_message_chat),
childAtPosition(
childAtPosition(
withId(R.id.cardView),
0),
2),
isDisplayed()));
    appCompatImageButton.perform(click());
    
    pressBack();
    
    pressBack();
    
    ViewInteraction overflowMenuButton = onView(
allOf(withContentDescription("More options"),
childAtPosition(
childAtPosition(
withId(R.id.main_activity_toolbar),
1),
0),
isDisplayed()));
    overflowMenuButton.perform(click());
    
    ViewInteraction appCompatTextView = onView(
allOf(withId(androidx.appcompat.R.id.title), withText("Settings"),
childAtPosition(
childAtPosition(
withId(androidx.appcompat.R.id.content),
0),
0),
isDisplayed()));
    appCompatTextView.perform(click());
    
    ViewInteraction circleImageView3 = onView(
allOf(withId(R.id.profile_image),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
1),
isDisplayed()));
    circleImageView3.perform(click());
    
    pressBack();
    
    ViewInteraction appCompatButton8 = onView(
allOf(withId(R.id.update_Settings_btn), withText("Update"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
4),
isDisplayed()));
    appCompatButton8.perform(click());
    
    ViewInteraction appCompatButton9 = onView(
allOf(withId(R.id.update_Settings_btn), withText("Update"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
4),
isDisplayed()));
    appCompatButton9.perform(click());
    
    ViewInteraction overflowMenuButton2 = onView(
allOf(withContentDescription("More options"),
childAtPosition(
childAtPosition(
withId(R.id.main_activity_toolbar),
1),
0),
isDisplayed()));
    overflowMenuButton2.perform(click());
    
    ViewInteraction appCompatTextView2 = onView(
allOf(withId(androidx.appcompat.R.id.title), withText("Logout"),
childAtPosition(
childAtPosition(
withId(androidx.appcompat.R.id.content),
0),
0),
isDisplayed()));
    appCompatTextView2.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup)parent).getChildAt(position));
            }
        };
    }
}
