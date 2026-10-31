package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e10 {
    public final iu30 a;
    public final Set b;

    public e10(Set set, iu30 iu30Var) {
        this.a = iu30Var;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e10)) {
            return false;
        }
        e10 e10Var = (e10) obj;
        return u890.j(this.a, e10Var.a) && u890.j(this.b, e10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ e10(iu30 iu30Var) {
        this(w7x.a, iu30Var);
    }
}
