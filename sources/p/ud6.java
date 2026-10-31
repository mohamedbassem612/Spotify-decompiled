package p;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ud6 implements SensorEventListener {
    public final /* synthetic */ float[] a;
    public final /* synthetic */ float[] b;
    public final /* synthetic */ wq50 c;

    public ud6(float[] fArr, float[] fArr2, wq50 wq50Var) {
        this.a = fArr;
        this.b = fArr2;
        this.c = wq50Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        float[] fArr3 = this.b;
        SensorManager.getOrientation(fArr2, fArr3);
        float f = fArr3[1];
        wq50 wq50Var = this.c;
        wq50Var.b = f;
        wq50Var.a = fArr3[2];
        wq50Var.c = true;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
