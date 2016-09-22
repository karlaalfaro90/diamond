package com.example.estia.gcmsample;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by Karla on 22-Sep-16.
 */
public class GCMTokenRefreshListenerService extends InstanceIDListenerService {


    //If the token is changed registering the device again
    @Override
    public void onTokenRefresh() {
        Intent intent = new Intent(this, GCMRegistrationIntentService.class);
        startService(intent);
    }
}
