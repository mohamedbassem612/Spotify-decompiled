package p;

import android.os.Bundle;
import android.util.SparseArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a4t0 {
    public final Bundle a;
    public final Bundle b;
    public final SparseArray c;

    public a4t0(Bundle bundle, Bundle bundle2, SparseArray sparseArray) {
        this.a = bundle;
        this.b = bundle2;
        this.c = sparseArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4t0)) {
            return false;
        }
        a4t0 a4t0Var = (a4t0) obj;
        return u890.j(this.a, a4t0Var.a) && u890.j(this.b, a4t0Var.b) && u890.j(this.c, a4t0Var.c);
    }

    public final int hashCode() {
        Bundle bundle = this.a;
        int iHashCode = (bundle == null ? 0 : bundle.hashCode()) * 31;
        Bundle bundle2 = this.b;
        int iHashCode2 = (iHashCode + (bundle2 == null ? 0 : bundle2.hashCode())) * 31;
        SparseArray sparseArray = this.c;
        return iHashCode2 + (sparseArray != null ? sparseArray.hashCode() : 0);
    }
}
