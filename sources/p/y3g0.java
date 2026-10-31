package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y3g0 {
    public final Set a;
    public final int b;
    public final r3g0 c;

    public /* synthetic */ y3g0(int i, Set set) {
        this(set, i, (r3g0) o7h.q0(w2g0.n(i)));
    }

    public static y3g0 a(y3g0 y3g0Var, Set set, r3g0 r3g0Var, int i) {
        if ((i & 1) != 0) {
            set = y3g0Var.a;
        }
        int i2 = y3g0Var.b;
        if ((i & 4) != 0) {
            r3g0Var = y3g0Var.c;
        }
        return new y3g0(set, i2, r3g0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3g0)) {
            return false;
        }
        y3g0 y3g0Var = (y3g0) obj;
        return u890.j(this.a, y3g0Var.a) && this.b == y3g0Var.b && this.c == y3g0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }

    public y3g0(Set set, int i, r3g0 r3g0Var) {
        this.a = set;
        this.b = i;
        this.c = r3g0Var;
    }
}
