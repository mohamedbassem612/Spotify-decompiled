package p;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d921 {
    public final Set a;
    public final LinkedHashSet b;

    public d921(xj61 xj61Var, LinkedHashSet linkedHashSet) {
        this.a = xj61Var;
        this.b = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d921)) {
            return false;
        }
        d921 d921Var = (d921) obj;
        return this.a.equals(d921Var.a) && this.b.equals(d921Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
