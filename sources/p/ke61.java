package p;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ke61 {
    public static final String d;
    public static final String e;
    public static final String f;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        String str = zoi1.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
    }

    public ke61(String str, int i, Bundle bundle) {
        boolean z = true;
        if (i >= 0 && i != 1) {
            z = false;
        }
        dm5.m(z);
        this.a = i;
        this.b = str;
        this.c = bundle;
    }

    public static ke61 a(Bundle bundle) {
        int i = bundle.getInt(d, 1000);
        String string = bundle.getString(e, "");
        Bundle bundleP = zoi1.p(bundle.getBundle(f));
        if (bundleP == null) {
            bundleP = Bundle.EMPTY;
        }
        return new ke61(string, i, bundleP);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.a);
        bundle.putString(e, this.b);
        Bundle bundle2 = this.c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke61)) {
            return false;
        }
        ke61 ke61Var = (ke61) obj;
        return this.a == ke61Var.a && Objects.equals(this.b, ke61Var.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public ke61(int i) {
        this("no error message provided", i, Bundle.EMPTY);
    }
}
