package p;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class voa0 {
    public final Set a;
    public final Set b;
    public final LinkedHashSet c;
    public final LinkedHashSet d;

    public voa0(Set set, Set set2, LinkedHashSet linkedHashSet) {
        this.a = set;
        this.b = set2;
        this.c = linkedHashSet;
        this.d = dm61.y0(set, linkedHashSet);
        dm61.y0(set2, linkedHashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voa0)) {
            return false;
        }
        voa0 voa0Var = (voa0) obj;
        return this.a.equals(voa0Var.a) && this.b.equals(voa0Var.b) && this.c.equals(voa0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gvg.c(this.a.hashCode() * 31, 31, this.b);
    }
}
