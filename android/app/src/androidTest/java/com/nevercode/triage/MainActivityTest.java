package com.nevercode.triage;

import androidx.test.rule.ActivityTestRule;

import com.example.reproduce_issue_firebase_testlab.MainActivity;

import dev.flutter.plugins.integration_test.FlutterTestRunner;
import org.junit.Rule;
import org.junit.runner.RunWith;

@RunWith(FlutterTestRunner.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class, true, false);
}