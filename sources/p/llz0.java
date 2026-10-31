package p;

import android.graphics.Color;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class llz0 {
    public static final kiv a = new kiv(ijz0.c, (byte) 1);

    public static final kiv a() {
        return a;
    }

    public static final long b(String str) {
        return z4p1.e(Color.parseColor(str));
    }

    public static final jlz0 c(ehz0 ehz0Var) {
        try {
            return new jlz0(b(ehz0Var.a), b(ehz0Var.b), b(ehz0Var.c), b(ehz0Var.d), b(ehz0Var.e), b(ehz0Var.f), b(ehz0Var.g), b(ehz0Var.h));
        } catch (Throwable unused) {
            return jlz0.i;
        }
    }
}
