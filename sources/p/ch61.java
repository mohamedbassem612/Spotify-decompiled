package p;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ch61 {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final ke61 d;

    static {
        String str = zoi1.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public ch61(int i, Bundle bundle, long j, ke61 ke61Var) {
        boolean z = true;
        if (ke61Var != null && i >= 0 && i != 1) {
            z = false;
        }
        dm5.m(z);
        this.a = i;
        this.b = new Bundle(bundle);
        this.c = j;
        if (ke61Var == null && i < 0) {
            ke61Var = new ke61(i);
        }
        this.d = ke61Var;
    }

    public static ch61 a(Bundle bundle) {
        ke61 ke61Var;
        int i = bundle.getInt(e, -1);
        Bundle bundleP = zoi1.p(bundle.getBundle(f));
        long j = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 != null) {
            ke61Var = ke61.a(bundle2);
        } else {
            ke61Var = i != 0 ? new ke61(i) : null;
        }
        ke61 ke61Var2 = ke61Var;
        if (bundleP == null) {
            bundleP = Bundle.EMPTY;
        }
        return new ch61(i, bundleP, j, ke61Var2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(e, this.a);
        bundle.putBundle(f, this.b);
        bundle.putLong(g, this.c);
        ke61 ke61Var = this.d;
        if (ke61Var != null) {
            bundle.putBundle(h, ke61Var.b());
        }
        return bundle;
    }

    public ch61(int i, Bundle bundle) {
        this(i, bundle, SystemClock.elapsedRealtime(), null);
    }

    public ch61(int i) {
        this(i, Bundle.EMPTY);
    }
}
