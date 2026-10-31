package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class esz0 {
    public static final String a;

    static {
        String str = zoi1.a;
        a = Integer.toString(0, 36);
    }

    public static esz0 a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        if (i == 0) {
            String str2 = z560.d;
            dm5.m(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(z560.d, false) ? new z560(bundle.getBoolean(z560.e, false)) : new z560();
        }
        if (i == 1) {
            String str3 = ljs0.c;
            dm5.m(bundle.getInt(str, -1) == 1);
            float f = bundle.getFloat(ljs0.c, -1.0f);
            return f == -1.0f ? new ljs0() : new ljs0(f);
        }
        if (i == 2) {
            String str4 = rhb1.d;
            dm5.m(bundle.getInt(str, -1) == 2);
            int i2 = bundle.getInt(rhb1.d, 5);
            float f2 = bundle.getFloat(rhb1.e, -1.0f);
            return f2 == -1.0f ? new rhb1(i2) : new rhb1(i2, f2);
        }
        if (i != 3) {
            hhg1.n(f4i1.c(i, "Unknown RatingType: "));
            return null;
        }
        String str5 = rhe1.d;
        dm5.m(bundle.getInt(str, -1) == 3);
        return bundle.getBoolean(rhe1.d, false) ? new rhe1(bundle.getBoolean(rhe1.e, false)) : new rhe1();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
