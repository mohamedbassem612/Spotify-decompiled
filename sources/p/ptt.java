package p;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ptt implements SensorEventListener {
    public boolean a;
    public final SensorManager b;
    public final Sensor c;
    public float d;
    public float e;
    public float f;
    public float g;
    public final float[] h;
    public final llm i;
    public final ArrayList j;
    public boolean k;

    public ptt(Context context, q8n q8nVar) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(1) : defaultSensor;
        this.h = new float[]{0.0f, 0.0f, 0.0f};
        this.i = smo1.e(q8nVar);
        this.j = new ArrayList(1);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (!this.a) {
            this.b.unregisterListener(this);
            this.a = false;
            return;
        }
        if (sensorEvent != null) {
            if (sensorEvent.sensor.getType() == 10) {
                float[] fArr = sensorEvent.values;
                this.d = fArr[0];
                this.e = fArr[1];
                this.f = fArr[2];
            }
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr2 = this.h;
                float f = fArr2[0] * 0.8f;
                float[] fArr3 = sensorEvent.values;
                float f2 = (fArr3[0] * 0.19999999f) + f;
                fArr2[0] = f2;
                float f3 = (fArr3[1] * 0.19999999f) + (fArr2[1] * 0.8f);
                fArr2[1] = f3;
                float f4 = (fArr3[2] * 0.19999999f) + (fArr2[2] * 0.8f);
                fArr2[2] = f4;
                this.d = fArr3[0] - f2;
                this.e = fArr3[1] - f3;
                this.f = fArr3[2] - f4;
            }
        }
        float f5 = this.d;
        float f6 = this.e;
        float f7 = (f6 * f6) + (f5 * f5);
        float f8 = this.f;
        this.g = (f8 * f8) + f7;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
