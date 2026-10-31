package p;

import android.os.Build;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ge50 implements mxq0 {
    public int N0;
    public long O0;
    public z1a1 P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public final gv20 U0;
    public be50 a;
    public final yd50 b;
    public final ha4 c;
    public vu30 d;
    public Function0 e;
    public boolean g;
    public float[] i;
    public boolean t;
    public long f = 9223372034707292159L;
    public final float[] h = kch0.a();
    public wat X = j2h1.c(1.0f);
    public flb0 Y = flb0.a;
    public final vid Z = new vid();

    public ge50(be50 be50Var, yd50 yd50Var, ha4 ha4Var, vu30 vu30Var, Function0 function0) {
        this.a = be50Var;
        this.b = yd50Var;
        this.c = ha4Var;
        this.d = vu30Var;
        this.e = function0;
        int i = ofg1.c;
        this.O0 = wpb1.v();
        this.S0 = true;
        this.U0 = new gv20(this, (byte) 3);
    }

    public final float[] a() {
        float[] fArrA = this.i;
        if (fArrA == null) {
            fArrA = kch0.a();
            this.i = fArrA;
        }
        if (this.R0) {
            this.R0 = false;
            float[] fArrB = b();
            if (this.S0) {
                return fArrB;
            }
            if (!apo.o(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z = this.Q0;
        float[] fArr = this.h;
        if (z) {
            be50 be50Var = this.a;
            long jO = be50Var.z;
            fe50 fe50Var = be50Var.a;
            if ((9223372034707292159L & jO) == 9205357640488583168L) {
                jO = zno1.o(o0c.R(this.f));
            }
            kch0.f(this.h, Float.intBitsToFloat((int) (jO >> 32)), Float.intBitsToFloat((int) (jO & 4294967295L)), fe50Var.L(), fe50Var.K(), fe50Var.M(), fe50Var.m(), fe50Var.p(), fe50Var.c(), fe50Var.e(), 1040);
            this.Q0 = false;
            this.S0 = zgo1.t(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.t || this.g) {
            return;
        }
        this.c.invalidate();
        f(true);
    }

    public final void d(long j) {
        boolean zM = ha4.m();
        ha4 ha4Var = this.c;
        if (zM) {
            ha4Var.O(-4.0f);
        }
        be50 be50Var = this.a;
        if (!qr80.b(be50Var.t, j)) {
            be50Var.t = j;
            be50Var.a.j((int) (j >> 32), be50Var.u, (int) (j & 4294967295L));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            kw7.B(ha4Var);
        } else {
            ha4Var.invalidate();
        }
    }

    public final void e(long j) {
        if (yr80.b(j, this.f)) {
            return;
        }
        if (ha4.m()) {
            this.c.O(-4.0f);
        }
        this.f = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.t) {
            this.t = z;
            ha4 ha4Var = this.c;
            wdn0 wdn0Var = ha4Var.d1;
            boolean z2 = ha4Var.f1;
            if (!z) {
                if (z2) {
                    return;
                }
                wdn0Var.k(this);
                wdn0 wdn0Var2 = ha4Var.e1;
                if (wdn0Var2 != null) {
                    wdn0Var2.k(this);
                    return;
                }
                return;
            }
            if (!z2) {
                wdn0Var.b(this);
                return;
            }
            wdn0 wdn0Var3 = ha4Var.e1;
            if (wdn0Var3 == null) {
                wdn0Var3 = new wdn0();
                ha4Var.e1 = wdn0Var3;
            }
            wdn0Var3.b(this);
        }
    }

    public final void g() {
        ha4.m();
        if (this.t) {
            long j = this.O0;
            int i = ofg1.c;
            if (!ofg1.a(j, wpb1.v()) && !yr80.b(this.a.u, this.f)) {
                be50 be50Var = this.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.O0 >> 32)) * ((int) (this.f >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.O0 & 4294967295L)) * ((int) (this.f & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!Offset.c(be50Var.z, jFloatToRawIntBits)) {
                    be50Var.z = jFloatToRawIntBits;
                    be50Var.a.I(jFloatToRawIntBits);
                }
            }
            this.a.f(this.X, this.Y, this.f, this.U0);
            f(false);
        }
    }
}
