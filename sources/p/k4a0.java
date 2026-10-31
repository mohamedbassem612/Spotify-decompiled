package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k4a0 {
    public final si41 a;
    public final Set b;
    public final boolean c;

    public k4a0(si41 si41Var, Set set, boolean z) {
        this.a = si41Var;
        this.b = set;
        this.c = z;
    }

    public static k4a0 a(k4a0 k4a0Var, si41 si41Var, Set set, int i) {
        if ((i & 1) != 0) {
            si41Var = k4a0Var.a;
        }
        if ((i & 2) != 0) {
            set = k4a0Var.b;
        }
        return new k4a0(si41Var, set, k4a0Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4a0)) {
            return false;
        }
        k4a0 k4a0Var = (k4a0) obj;
        return this.a.equals(k4a0Var.a) && u890.j(this.b, k4a0Var.b) && this.c == k4a0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + gvg.c(this.a.hashCode() * 31, 31, this.b);
    }
}
