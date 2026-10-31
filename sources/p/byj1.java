package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class byj1 implements eyj1 {
    public final String a;
    public final Set b;

    public byj1(String str, Set set) {
        this.a = str;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byj1)) {
            return false;
        }
        byj1 byj1Var = (byj1) obj;
        return u890.j(this.a, byj1Var.a) && this.b.equals(byj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
