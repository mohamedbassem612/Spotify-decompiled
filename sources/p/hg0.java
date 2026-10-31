package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hg0 implements ig0 {
    public final Class a;
    public final Bundle b;

    public hg0(Bundle bundle, Class cls) {
        this.a = cls;
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg0)) {
            return false;
        }
        hg0 hg0Var = (hg0) obj;
        return this.a.equals(hg0Var.a) && this.b.equals(hg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
