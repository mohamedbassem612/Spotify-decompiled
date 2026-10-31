package p;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h890 {
    public final xab1 a;
    public final LinkedHashSet b;
    public final LinkedHashMap c;

    public h890(xab1 xab1Var, LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap) {
        this.a = xab1Var;
        this.b = linkedHashSet;
        this.c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h890)) {
            return false;
        }
        h890 h890Var = (h890) obj;
        return this.a.equals(h890Var.a) && this.b.equals(h890Var.b) && this.c.equals(h890Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
