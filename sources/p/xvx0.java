package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xvx0 implements zvx0 {
    public final ArrayList a;
    public final boolean b;

    public xvx0(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvx0)) {
            return false;
        }
        xvx0 xvx0Var = (xvx0) obj;
        return this.a.equals(xvx0Var.a) && this.b == xvx0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
