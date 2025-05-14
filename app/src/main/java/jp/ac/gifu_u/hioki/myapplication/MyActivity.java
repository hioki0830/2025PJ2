package jp.ac.gifu_u.hioki.myapplication;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;

public class MyActivity
    extends Activity implements SensorEventListener {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        var manager = (LocationManager)
                getSystemService(LOCATION_SERVICE);
    }


    @Override
    public void onSensorChanged(SensorEvent event) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
