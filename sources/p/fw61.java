package p;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fw61 implements SensorEventListener {
    public final yqg a;
    public j9i1 b;
    public long c;
    public int d;
    public final float e;

    public fw61(yqg yqgVar, d35 d35Var) {
        this.a = yqgVar;
        this.e = d35Var.b() / 1000.0f;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        j9i1 j9i1Var;
        if (this.b == null) {
            return;
        }
        float[] fArr = sensorEvent.values;
        double d = fArr[0] / 9.80665f;
        double d2 = fArr[1] / 9.80665f;
        double d3 = fArr[2] / 9.80665f;
        double d4 = (d3 * d3) + (d2 * d2) + (d * d);
        float f = this.e;
        if (d4 > f * f) {
            long jB = this.a.b();
            long j = this.c;
            if (500 + j > jB) {
                return;
            }
            if (j + 2000 < jB) {
                this.d = 0;
            }
            this.c = jB;
            int i = this.d + 1;
            this.d = i;
            if (i != 2 || (j9i1Var = this.b) == null) {
                return;
            }
            j9i1Var.a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
