package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iph0 {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final Bundle a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    static {
        String str = zoi1.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public iph0(Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.a = new Bundle(bundle);
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static iph0 a(Bundle bundle) {
        Bundle bundleP = zoi1.p(bundle.getBundle(e));
        boolean z = bundle.getBoolean(f, false);
        boolean z2 = bundle.getBoolean(g, false);
        boolean z3 = bundle.getBoolean(h, false);
        if (bundleP == null) {
            bundleP = Bundle.EMPTY;
        }
        return new iph0(bundleP, z, z2, z3);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putBundle(e, this.a);
        bundle.putBoolean(f, this.b);
        bundle.putBoolean(g, this.c);
        bundle.putBoolean(h, this.d);
        return bundle;
    }
}
