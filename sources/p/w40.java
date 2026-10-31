package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w40 {
    public final vu30 a;
    public final Set b;

    public w40(Set set, vu30 vu30Var) {
        this.a = vu30Var;
        this.b = set;
    }

    public final vu30 a() {
        return this.a;
    }

    public final Set b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w40)) {
            return false;
        }
        w40 w40Var = (w40) obj;
        return u890.j(this.a, w40Var.a) && u890.j(this.b, w40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
