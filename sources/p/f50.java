package p;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f50 {
    public final Set a;
    public final Set b;
    public final Map c;

    public f50(LinkedHashSet linkedHashSet, int i) {
        int i2 = i & 2;
        LinkedHashSet linkedHashSet2 = w7x.a;
        linkedHashSet = i2 != 0 ? linkedHashSet2 : linkedHashSet;
        this.a = linkedHashSet2;
        this.b = linkedHashSet;
        this.c = b7x.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f50)) {
            return false;
        }
        f50 f50Var = (f50) obj;
        return u890.j(this.a, f50Var.a) && u890.j(this.b, f50Var.b) && u890.j(this.c, f50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gvg.c(this.a.hashCode() * 31, 31, this.b);
    }
}
