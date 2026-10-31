package p;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ck5 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static ck5 c;
    public ex21 a;

    public static synchronized ck5 a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return ex21.f(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            ck5 ck5Var = new ck5();
            c = ck5Var;
            ck5Var.a = ex21.b();
            ex21 ex21Var = c.a;
            a680 a680Var = new a680((byte) 4);
            synchronized (ex21Var) {
                ex21Var.e = a680Var;
            }
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.d(context, i);
    }
}
