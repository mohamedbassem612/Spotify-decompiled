package p;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class dz70 {
    public static final jc10 a = new jc10(ahg1.a);
    public static final jc10 b = new jc10(aqi1.b);
    public static final jc10 c = new jc10(null);
    public static final jc10 d;
    public static final jc10 e;
    public static final jc10 f;
    public static final jc10 g;

    static {
        Boolean bool = Boolean.TRUE;
        d = new jc10(bool);
        e = new jc10(null);
        f = new jc10(bool);
        g = new jc10(Boolean.FALSE);
    }

    public static final Bitmap.Config a(dqq0 dqq0Var) {
        return (Bitmap.Config) kto1.v(dqq0Var, b);
    }

    public static final ColorSpace b(dqq0 dqq0Var) {
        return q58.d(kto1.v(dqq0Var, c));
    }
}
