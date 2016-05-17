package com.example.android.chatappfirebase;

import com.firebase.client.Firebase;

/**
 * Created by RodrigoVasco on 09/05/2016.
 *
 * Initialize Firebase with the application context. This must happen before the client is used.
 */

public class ChatApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
