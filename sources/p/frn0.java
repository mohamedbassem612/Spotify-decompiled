package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class frn0 extends irn0 {
    public final Class a;
    public final Bundle b;

    public frn0(Bundle bundle, Class cls) {
        this.a = cls;
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frn0)) {
            return false;
        }
        frn0 frn0Var = (frn0) obj;
        return this.a.equals(frn0Var.a) && u890.j(this.b, frn0Var.b);
    }

    public final int hashCode() {
        int iHashCode = (yi20.c.hashCode() + (this.a.hashCode() * 31)) * 31;
        Bundle bundle = this.b;
        return iHashCode + (bundle == null ? 0 : bundle.hashCode());
    }
}
