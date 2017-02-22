package fr.android.androidexercises;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Alex GOURBILIERE on 21/02/2017.
 */

public class BigJobService extends IntentService {
    public BigJobService() {
        super(BigJobService.class.getSimpleName());
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        long endTime = System.currentTimeMillis() + 5000;
        try {
            wait(endTime + System.currentTimeMillis());
        } catch (Exception ignored) {
        }

        Toast.makeText(this, "It's finished", Toast.LENGTH_SHORT).show();

        sendBroadcast(intent);
    }
}
