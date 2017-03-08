package com.example.brianchan.ripple_android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Brian Chan on 2/27/2017.
 */

public class PasscodeActivity extends AppCompatActivity {
    PasscodePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passcode);
        presenter = new PasscodePresenter(this);
    }

    public void enterParty(View view) {
        presenter.enterParty(view);
    }

    public void sendSMS(View view) {
        presenter.sendSMS(view);
    }
}
