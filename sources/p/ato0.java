package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ato0 {
    public final int a;
    public final List b;

    public ato0(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ato0)) {
            return false;
        }
        ato0 ato0Var = (ato0) obj;
        return this.a == ato0Var.a && this.b.equals(ato0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
