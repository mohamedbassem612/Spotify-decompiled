package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o0v0 {
    public static final o0v0 c;
    public final Set a;
    public final Set b;

    static {
        w7x w7xVar = w7x.a;
        c = new o0v0(w7xVar, w7xVar);
    }

    public o0v0(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final o0v0 a(p0v0 p0v0Var) {
        String str = p0v0Var.c;
        boolean z = p0v0Var.a;
        Set set = this.a;
        Set set2 = this.b;
        if (z) {
            return p0v0Var.b ? new o0v0(dm61.x0(str, set), dm61.u0(str, set2)) : new o0v0(dm61.u0(str, set), dm61.x0(str, set2));
        }
        return new o0v0(dm61.u0(str, set), dm61.u0(str, set2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0v0)) {
            return false;
        }
        o0v0 o0v0Var = (o0v0) obj;
        return this.a.equals(o0v0Var.a) && this.b.equals(o0v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
