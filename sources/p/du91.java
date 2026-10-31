package p;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class du91 implements SensorEventListener {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ Object c;

    public du91(udm1 udm1Var) {
        this.a = (byte) 1;
        this.c = udm1Var;
        this.b = new float[4];
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        byte b = this.a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        long jLongValue;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((drr0) obj2).t((-sensorEvent.values[0]) * 140.0f);
                ((drr0) obj).t(sensorEvent.values[1] * 140.0f);
                break;
            default:
                float[] fArr = (float[]) obj2;
                SensorManager.getQuaternionFromVector(fArr, sensorEvent.values);
                udm1 udm1Var = (udm1) obj;
                long j = sensorEvent.timestamp;
                if (udm1Var.e) {
                    for (float f : fArr) {
                        if (Math.abs(f) > Float.MAX_VALUE) {
                        }
                        break;
                    }
                    if (j > udm1Var.g) {
                        udm1Var.g = j;
                        long jLongValue2 = ((Number) udm1Var.a.invoke()).longValue();
                        Long l = udm1Var.h;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            udm1Var.h = Long.valueOf(jLongValue2);
                            jLongValue = jLongValue2;
                        }
                        if (jLongValue2 - jLongValue >= 250000000 && !udm1Var.k) {
                            float[] fArr2 = udm1Var.f;
                            if (fArr2 == null) {
                                udm1Var.f = Arrays.copyOf(fArr, fArr.length);
                                break;
                            } else {
                                float f2 = fArr[0];
                                float f3 = fArr2[0];
                                float f4 = fArr[1];
                                float f5 = fArr2[1];
                                float f6 = fArr[2];
                                float f7 = fArr2[2];
                                float f8 = fArr[3];
                                float f9 = fArr2[3];
                                float f10 = (f8 * f9) + (f6 * f7) + (f4 * f5) + (f2 * f3);
                                float f11 = ((f6 * f5) + ((f8 * f3) - (f2 * f9))) - (f4 * f7);
                                f46.X(fArr, fArr2, 14);
                                if ((f11 * f11) + (f10 * f10) >= 0.01f) {
                                    float fAtan2 = ((((float) Math.atan2(f11, f10)) * 2.0f) + 3.1415927f) % 6.2831855f;
                                    if (fAtan2 != 0.0f && Math.signum(fAtan2) != Math.signum(6.2831855f)) {
                                        fAtan2 += 6.2831855f;
                                    }
                                    float f12 = fAtan2 - 3.1415927f;
                                    if (Math.abs(f12) >= 1.7453292E-4f) {
                                        float f13 = udm1Var.i + udm1Var.j + (f12 * 0.5f);
                                        float f14 = udm1Var.l;
                                        udm1Var.i = yoi1.o(f13, -f14, f14) - udm1Var.j;
                                        udm1Var.a();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    public du91(drr0 drr0Var, drr0 drr0Var2) {
        this.a = (byte) 0;
        this.b = drr0Var;
        this.c = drr0Var2;
    }

    private final void a(Sensor sensor, int i) {
    }

    private final void b(Sensor sensor, int i) {
    }
}
