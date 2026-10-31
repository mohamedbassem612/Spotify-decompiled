package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y5w0 {
    public final List a;
    public final blc0 b;
    public final int c;
    public final boolean d;

    public y5w0(List list, blc0 blc0Var, int i, boolean z) {
        this.a = list;
        this.b = blc0Var;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5w0)) {
            return false;
        }
        y5w0 y5w0Var = (y5w0) obj;
        return u890.j(this.a, y5w0Var.a) && this.b == y5w0Var.b && this.c == y5w0Var.c && this.d == y5w0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ab80.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }
}
