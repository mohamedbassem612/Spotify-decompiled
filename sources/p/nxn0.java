package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nxn0 implements pxn0 {
    public final String a;
    public final Bundle b;

    public nxn0(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
        if (str.length() > 0) {
            return;
        }
        hhg1.n("A non-empty URI must be provided.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxn0)) {
            return false;
        }
        nxn0 nxn0Var = (nxn0) obj;
        return u890.j(this.a, nxn0Var.a) && u890.j(this.b, nxn0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Bundle bundle = this.b;
        return iHashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    public nxn0(lik1 lik1Var, Bundle bundle) {
        this(lik1Var.a, bundle);
    }
}
