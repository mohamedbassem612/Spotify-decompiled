package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class joc0 {
    public final Set a;
    public final Set b;

    public joc0(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joc0)) {
            return false;
        }
        joc0 joc0Var = (joc0) obj;
        return this.a.equals(joc0Var.a) && this.b.equals(joc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
