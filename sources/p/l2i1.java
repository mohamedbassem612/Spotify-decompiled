package p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l2i1 {
    public final LinkedHashSet a;
    public final LinkedHashSet b;

    public l2i1(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        this.a = linkedHashSet;
        this.b = linkedHashSet2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2i1)) {
            return false;
        }
        l2i1 l2i1Var = (l2i1) obj;
        return this.a.equals(l2i1Var.a) && this.b.equals(l2i1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
