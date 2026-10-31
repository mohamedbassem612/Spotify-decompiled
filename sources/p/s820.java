package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s820 {
    public final List a;
    public final r620 b;

    public s820(List list, r620 r620Var) {
        this.a = list;
        this.b = r620Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s820)) {
            return false;
        }
        s820 s820Var = (s820) obj;
        return u890.j(this.a, s820Var.a) && this.b == s820Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        r620 r620Var = this.b;
        return iHashCode + (r620Var == null ? 0 : r620Var.hashCode());
    }
}
