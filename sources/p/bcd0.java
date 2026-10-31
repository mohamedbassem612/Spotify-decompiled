package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bcd0 {
    public final int a;
    public final Set b;

    public bcd0(int i, Set set) {
        this.a = i;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcd0)) {
            return false;
        }
        bcd0 bcd0Var = (bcd0) obj;
        return this.a == bcd0Var.a && this.b.equals(bcd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
