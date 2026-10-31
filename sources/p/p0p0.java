package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p0p0 {
    public final tka0 a;
    public final Bundle b;

    public p0p0(tka0 tka0Var, Bundle bundle) {
        this.a = tka0Var;
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0p0)) {
            return false;
        }
        p0p0 p0p0Var = (p0p0) obj;
        return u890.j(this.a, p0p0Var.a) && this.b.equals(p0p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
