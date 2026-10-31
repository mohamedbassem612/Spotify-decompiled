package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rgp0 {
    public final Set a;
    public final Set b;

    public rgp0(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final Set a() {
        return this.a;
    }

    public final Set b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgp0)) {
            return false;
        }
        rgp0 rgp0Var = (rgp0) obj;
        return this.a.equals(rgp0Var.a) && this.b.equals(rgp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
