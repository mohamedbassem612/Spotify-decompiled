package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bf {
    public final km3 a;
    public final boolean b;

    public bf(Context context) {
        this(new km3(context, (byte) 5), false);
    }

    public final af a() {
        float fB = b() * 3.0f;
        if (-3.4028235E38f <= fB && fB <= 3.0f) {
            return af.a;
        }
        if (3.0f <= fB && fB <= 3.5f) {
            return af.b;
        }
        if (3.5f <= fB && fB <= 4.0f) {
            return af.c;
        }
        if (4.0f <= fB && fB <= 4.5f) {
            return af.d;
        }
        if (4.5f <= fB && fB <= 5.0f) {
            return af.e;
        }
        if (5.0f <= fB && fB <= 7.0f) {
            return af.f;
        }
        if (7.0f > fB || fB > 8.5f) {
            return (8.5f > fB || fB > 9.0f) ? af.i : af.h;
        }
        return af.g;
    }

    public final float b() {
        float fD;
        float f;
        km3 km3Var = this.a;
        if (km3Var.C() == 2 && this.b) {
            fD = km3Var.B();
            f = 0.95f;
        } else {
            fD = km3Var.D() / km3Var.E();
            f = 152.0f;
        }
        return fD * f;
    }

    public final int c(int i) {
        float fB = b();
        if (i >= ((int) (2.1474836E9f / fB))) {
            return Integer.MAX_VALUE;
        }
        return Math.max((int) Math.rint(i * fB), 1);
    }

    public bf(km3 km3Var, boolean z) {
        this.a = km3Var;
        this.b = z;
    }
}
