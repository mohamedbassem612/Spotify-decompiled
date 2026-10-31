package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class svi0 {
    public final Set a;
    public final Set b;

    public svi0(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svi0)) {
            return false;
        }
        svi0 svi0Var = (svi0) obj;
        return u890.j(this.a, svi0Var.a) && u890.j(this.b, svi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
