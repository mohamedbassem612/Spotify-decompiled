package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gkh1 {
    public final String a;
    public final Bundle b;

    public gkh1(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkh1)) {
            return false;
        }
        gkh1 gkh1Var = (gkh1) obj;
        return u890.j(this.a, gkh1Var.a) && u890.j(this.b, gkh1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Bundle bundle = this.b;
        return iHashCode + (bundle == null ? 0 : bundle.hashCode());
    }
}
