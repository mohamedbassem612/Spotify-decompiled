package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c7b1 {
    public final a3i1 a;
    public final LinkedHashMap b;

    public c7b1(a3i1 a3i1Var, LinkedHashMap linkedHashMap) {
        this.a = a3i1Var;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c7b1) {
            c7b1 c7b1Var = (c7b1) obj;
            if (this.a == c7b1Var.a && this.b.equals(c7b1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
