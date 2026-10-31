package p;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jg60 implements SensorEventListener {
    public final /* synthetic */ kg60 a;

    public jg60(kg60 kg60Var) {
        this.a = kg60Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr.length != 1) {
            return;
        }
        if (fArr.length != 0) {
            this.a.d = new hg60(fArr[0]);
        } else {
            bhn0.t("Array is empty.");
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
