package p;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mbk1 implements SensorEventListener {
    public uk4 a;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        dhn.a.contains(this);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            uk4 uk4Var = this.a;
            if (uk4Var != null) {
                float[] fArr = sensorEvent.values;
                double d = fArr[0] / 9.80665f;
                double d2 = fArr[1] / 9.80665f;
                double d3 = fArr[2] / 9.80665f;
                if (Math.sqrt((d3 * d3) + (d2 * d2) + (d * d)) > 2.3d) {
                    uk4Var.f();
                }
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }
}
