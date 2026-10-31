package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class inc1 {
    public final boolean a;
    public final List b;

    public inc1(List list, boolean z) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inc1)) {
            return false;
        }
        inc1 inc1Var = (inc1) obj;
        return this.a == inc1Var.a && this.b.equals(inc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
