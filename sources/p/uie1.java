package p;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uie1 implements SensorEventListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l811 b;
    public final /* synthetic */ m811 c;
    public final /* synthetic */ m811 d;
    public final /* synthetic */ m811 e;
    public final /* synthetic */ m811 f;
    public final /* synthetic */ m811 g;
    public final /* synthetic */ m811 h;
    public final /* synthetic */ ven0 i;

    public /* synthetic */ uie1(l811 l811Var, m811 m811Var, m811 m811Var2, m811 m811Var3, m811 m811Var4, m811 m811Var5, m811 m811Var6, ven0 ven0Var, byte b) {
        this.a = b;
        this.b = l811Var;
        this.c = m811Var;
        this.d = m811Var2;
        this.e = m811Var3;
        this.f = m811Var4;
        this.g = m811Var5;
        this.h = m811Var6;
        this.i = ven0Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        byte b = this.a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        byte b = this.a;
        ven0 ven0Var = this.i;
        m811 m811Var = this.c;
        l811 l811Var = this.b;
        m811 m811Var2 = this.d;
        m811 m811Var3 = this.e;
        m811 m811Var4 = this.f;
        float f = 0.5f;
        m811 m811Var5 = this.g;
        m811 m811Var6 = this.h;
        switch (b) {
            case 0:
                float[] fArr = sensorEvent.values;
                float f2 = fArr[0] / 9.80665f;
                float f3 = fArr[1] / 9.80665f;
                if (!l811Var.a) {
                    m811Var.a = f2;
                    m811Var2.a = f3;
                    m811Var3.a = f2;
                    m811Var4.a = f3;
                    l811Var.a = true;
                } else {
                    float f4 = f2 - m811Var.a;
                    if (f4 > 0.5f) {
                        m811Var.a = f2 - 0.5f;
                        f4 = 0.5f;
                    } else if (f4 < -0.5f) {
                        m811Var.a = f2 - (-0.5f);
                        f4 = -0.5f;
                    }
                    float f5 = f3 - m811Var2.a;
                    if (f5 > 0.5f) {
                        m811Var2.a = f3 - 0.5f;
                    } else if (f5 < -0.5f) {
                        m811Var2.a = f3 - (-0.5f);
                        f = -0.5f;
                    } else {
                        f = f5;
                    }
                    float fAbs = Math.abs(f4);
                    float fO = yoi1.o((fAbs < 0.04f ? 0.0f : ((fAbs - 0.04f) * Math.signum(f4)) / 0.96f) * 2.0f, -1.0f, 1.0f);
                    float fAbs2 = Math.abs(f);
                    float fO2 = yoi1.o((fAbs2 >= 0.04f ? ((fAbs2 - 0.04f) * Math.signum(f)) / 0.96f : 0.0f) * 2.0f, -1.0f, 1.0f);
                    float f6 = m811Var5.a;
                    m811Var5.a = l1d.e(fO, f6, 0.1f, f6);
                    float f7 = m811Var6.a;
                    m811Var6.a = l1d.e(fO2, f7, 0.1f, f7);
                    if (Math.abs(f2 - m811Var3.a) < 0.012f && Math.abs(f3 - m811Var4.a) < 0.012f) {
                        float f8 = m811Var2.a;
                        m811Var2.a = l1d.e(f3, f8, 0.05f, f8);
                    }
                    m811Var3.a = f2;
                    m811Var4.a = f3;
                    ven0Var.setValue(new tie1(m811Var5.a, m811Var6.a));
                }
                break;
            default:
                float[] fArr2 = sensorEvent.values;
                float f9 = fArr2[0] / 9.80665f;
                float f10 = fArr2[1] / 9.80665f;
                if (!l811Var.a) {
                    m811Var.a = f9;
                    m811Var2.a = f10;
                    m811Var3.a = f9;
                    m811Var4.a = f10;
                    l811Var.a = true;
                } else {
                    float f11 = f9 - m811Var.a;
                    if (f11 > 0.5f) {
                        m811Var.a = f9 - 0.5f;
                        f11 = 0.5f;
                    } else if (f11 < -0.5f) {
                        m811Var.a = f9 - (-0.5f);
                        f11 = -0.5f;
                    }
                    float f12 = f10 - m811Var2.a;
                    if (f12 > 0.5f) {
                        m811Var2.a = f10 - 0.5f;
                    } else if (f12 < -0.5f) {
                        m811Var2.a = f10 - (-0.5f);
                        f = -0.5f;
                    } else {
                        f = f12;
                    }
                    float fAbs3 = Math.abs(f11);
                    float fSignum = fAbs3 < 0.04f ? 0.0f : ((fAbs3 - 0.04f) * Math.signum(f11)) / 0.96f;
                    float fAbs4 = Math.abs(f);
                    float fSignum2 = fAbs4 >= 0.04f ? ((fAbs4 - 0.04f) * Math.signum(f)) / 0.96f : 0.0f;
                    float fO3 = yoi1.o(fSignum * 2.0f, -1.0f, 1.0f);
                    float fO4 = yoi1.o(fSignum2 * 2.0f, -1.0f, 1.0f);
                    float f13 = m811Var5.a;
                    m811Var5.a = l1d.e(fO3, f13, 0.1f, f13);
                    float f14 = m811Var6.a;
                    m811Var6.a = l1d.e(fO4, f14, 0.1f, f14);
                    if (Math.abs(f9 - m811Var3.a) < 0.012f && Math.abs(f10 - m811Var4.a) < 0.012f) {
                        float f15 = m811Var2.a;
                        m811Var2.a = l1d.e(f10, f15, 0.05f, f15);
                    }
                    m811Var3.a = f9;
                    m811Var4.a = f10;
                    ven0Var.setValue(new zje1(m811Var5.a, m811Var6.a));
                }
                break;
        }
    }

    private final void a(Sensor sensor, int i) {
    }

    private final void b(Sensor sensor, int i) {
    }
}
