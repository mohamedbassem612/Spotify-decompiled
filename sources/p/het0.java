package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class het0 {
    public final iu30 a;
    public final rgg b;
    public final List c;

    public het0(iu30 iu30Var, rgg rggVar, List list) {
        this.a = iu30Var;
        this.b = rggVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof het0)) {
            return false;
        }
        het0 het0Var = (het0) obj;
        return u890.j(this.a, het0Var.a) && this.b.equals(het0Var.b) && this.c.equals(het0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b.a, this.a.hashCode() * 31, 31);
    }
}
