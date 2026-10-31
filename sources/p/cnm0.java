package p;

import androidx.constraintlayout.motion.widget.a;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cnm0 implements Comparable {
    public static final String[] R0 = {"position", "x", "y", "width", "height", "pathRotate"};
    public clv a;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int b = 0;
    public float i = Float.NaN;
    public int t = -1;
    public int X = -1;
    public float Y = Float.NaN;
    public a Z = null;
    public LinkedHashMap N0 = new LinkedHashMap();
    public int O0 = 0;
    public double[] P0 = new double[18];
    public double[] Q0 = new double[18];

    public static boolean b(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    public static void e(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
    }

    public final void a(fil filVar) {
        int iC;
        this.a = clv.d(filVar.d.d);
        hil hilVar = filVar.d;
        this.t = hilVar.e;
        this.X = hilVar.b;
        this.i = hilVar.h;
        this.b = hilVar.f;
        this.Y = filVar.e.C;
        for (String str : filVar.g.keySet()) {
            mhl mhlVar = (mhl) filVar.g.get(str);
            if (mhlVar != null && (iC = l1d.C(mhlVar.c)) != 4 && iC != 5 && iC != 7) {
                this.N0.put(str, mhlVar);
            }
        }
    }

    public final void c(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.e;
        float fCos = this.f;
        float f2 = this.g;
        float f3 = this.h;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f4 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f4;
            } else if (i3 == 2) {
                fCos = f4;
            } else if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        a aVar = this.Z;
        if (aVar != null) {
            float[] fArr2 = new float[2];
            aVar.b(d, fArr2, new float[2]);
            float f5 = fArr2[0];
            float f6 = fArr2[1];
            double d2 = f;
            double d3 = fCos;
            double dSin = Math.sin(d3) * d2;
            fCos = (float) ((((double) f6) - (Math.cos(d3) * d2)) - ((double) (f3 / 2.0f)));
            f = (float) ((dSin + ((double) f5)) - ((double) (f2 / 2.0f)));
        }
        fArr[i] = (f2 / 2.0f) + f + 0.0f;
        fArr[i + 1] = (f3 / 2.0f) + fCos + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.d, ((cnm0) obj).d);
    }

    public final void d(float f, float f2, float f3, float f4) {
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
    }

    public final void f(a aVar, cnm0 cnm0Var) {
        double d = (((this.g / 2.0f) + this.e) - cnm0Var.e) - (cnm0Var.g / 2.0f);
        double d2 = (((this.h / 2.0f) + this.f) - cnm0Var.f) - (cnm0Var.h / 2.0f);
        this.Z = aVar;
        this.e = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.Y)) {
            this.f = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f = (float) Math.toRadians(this.Y);
        }
    }
}
