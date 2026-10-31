package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y7g1 {
    public final List a;
    public final List b = z6x.a;

    public y7g1(List list) {
        this.a = list;
        if (list.isEmpty()) {
            hhg1.n("Media sequence must not be empty.");
            throw null;
        }
    }

    public final ArrayList a() {
        return o7h.N0(this.b, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7g1)) {
            return false;
        }
        y7g1 y7g1Var = (y7g1) obj;
        return this.a.equals(y7g1Var.a) && this.b.equals(y7g1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
