package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ppa0 {
    public final List a;
    public final int b;

    public ppa0(List list) {
        this.a = list;
        this.b = list.hashCode();
    }

    public final List a() {
        return this.a;
    }

    public final ppa0 b(ppa0 ppa0Var) {
        return new ppa0(o7h.N0(ppa0Var.a, this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppa0)) {
            return false;
        }
        return this.a.equals(((ppa0) obj).a);
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return f4i1.f("KeyResolver(", o7h.y0(this.a, " -> ", (String) null, (String) null, mr90.c1, 30), ")");
    }
}
