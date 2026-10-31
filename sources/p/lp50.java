package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lp50 {
    public final g7o a;
    public final ArrayList b;

    public lp50(g7o g7oVar, ArrayList arrayList) {
        this.a = g7oVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp50)) {
            return false;
        }
        lp50 lp50Var = (lp50) obj;
        return this.a.equals(lp50Var.a) && this.b.equals(lp50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
