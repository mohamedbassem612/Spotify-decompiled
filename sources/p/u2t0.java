package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u2t0 {
    public final List a;
    public final a3t0 b;
    public final Set c;
    public final boolean d;

    public u2t0(List list, a3t0 a3t0Var, Set set, boolean z) {
        this.a = list;
        this.b = a3t0Var;
        this.c = set;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2t0)) {
            return false;
        }
        u2t0 u2t0Var = (u2t0) obj;
        return u890.j(this.a, u2t0Var.a) && this.b == u2t0Var.b && this.c.equals(u2t0Var.c) && this.d == u2t0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gvg.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
