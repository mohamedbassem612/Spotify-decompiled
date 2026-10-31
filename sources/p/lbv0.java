package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lbv0 {
    public final int a;
    public final ArrayList b;

    public lbv0(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbv0)) {
            return false;
        }
        lbv0 lbv0Var = (lbv0) obj;
        return this.a == lbv0Var.a && this.b.equals(lbv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
