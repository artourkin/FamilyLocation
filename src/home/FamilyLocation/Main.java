package home.FamilyLocation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Intent service = new Intent(this, LocationService.class);
        startService(service);
    }

    public void onClickStop(View V) {
        stopService(new Intent(this, LocationService.class));
        System.exit(0);
    }
}
