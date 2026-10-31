package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kdi1 {
    public final int a;
    public final Map b;

    public kdi1(int i, Map map) {
        this.a = i;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdi1)) {
            return false;
        }
        kdi1 kdi1Var = (kdi1) obj;
        return this.a == kdi1Var.a && this.b.equals(kdi1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
