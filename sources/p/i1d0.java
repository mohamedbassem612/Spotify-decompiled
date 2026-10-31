package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i1d0 {
    public final List a;
    public final tcd1 b;
    public final boolean c;
    public final int d;

    public i1d0(List list, tcd1 tcd1Var, boolean z, int i) {
        this.a = list;
        this.b = tcd1Var;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1d0)) {
            return false;
        }
        i1d0 i1d0Var = (i1d0) obj;
        return u890.j(this.a, i1d0Var.a) && this.b == i1d0Var.b && this.c == i1d0Var.c && this.d == i1d0Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
