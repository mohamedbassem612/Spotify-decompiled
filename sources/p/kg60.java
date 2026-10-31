package p;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kg60 {
    public final SensorManager a;
    public final Sensor b;
    public final jg60 c;
    public aqo1 d;

    public kg60(Context context) {
        Object systemService = context.getSystemService("sensor");
        Sensor defaultSensor = null;
        SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
        this.a = sensorManager;
        if (Build.VERSION.SDK_INT >= 30 && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(36);
        }
        this.b = defaultSensor;
        this.c = new jg60(this);
        this.d = defaultSensor == null ? ig60.b : new hg60(-1.0f);
    }

    public final aqo1 a() {
        return this.d;
    }

    public final void b() {
        Sensor sensor;
        SensorManager sensorManager = this.a;
        if (sensorManager == null || (sensor = this.b) == null) {
            return;
        }
        sensorManager.registerListener(this.c, sensor, 3);
    }

    public final void c() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null || this.b == null) {
            return;
        }
        sensorManager.unregisterListener(this.c);
    }
}
