package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kx71 implements vx71 {
    public final Set a;
    public final Set b;

    public kx71(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx71)) {
            return false;
        }
        kx71 kx71Var = (kx71) obj;
        return u890.j(this.a, kx71Var.a) && u890.j(this.b, kx71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
