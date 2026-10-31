package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ut61 {
    public final Set a;
    public final Set b;

    public ut61(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut61)) {
            return false;
        }
        ut61 ut61Var = (ut61) obj;
        return this.a.equals(ut61Var.a) && this.b.equals(ut61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
